package com.ShopShoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ShopShoe.entity.RoomTypeEntity;

@Repository
public interface RoomTypeRepositoty extends JpaRepository<RoomTypeEntity, Long>{


}
