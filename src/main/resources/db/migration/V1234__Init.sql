use hotel222;

CREATE TABLE hotel(
  `id` bigint(11) NOT NULL PRIMARY KEY AUTO_INCREMENT ,
  `name` varchar(255) NOT NULL,
  `adress` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE roomtype(
  `id` bigint(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `type` varchar(255) NOT NULL,
  `price` float(8,2) NOT NULL,
  `hotel_id` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



ALTER TABLE roomtype
  ADD CONSTRAINT `roomtype_hotelid_foreign` FOREIGN KEY (`hotel_id`) REFERENCES hotel(`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;