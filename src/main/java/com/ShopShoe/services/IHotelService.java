package com.ShopShoe.services;

import com.ShopShoe.entity.HotelEntity;

public interface IHotelService<T> extends IBaseService<T> {
	HotelEntity getById(long id);
}
