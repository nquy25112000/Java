package com.ShopShoe.service.Implements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ShopShoe.entity.HotelEntity;
import com.ShopShoe.repository.HotelRepository;
import com.ShopShoe.services.IHotelService;

@Service
public class HotelServiceIplm implements IHotelService<HotelEntity> {

	@Autowired
	private HotelRepository Repository;

	@Override
	public HotelEntity save(HotelEntity hotel) {
		Repository.save(hotel);
		return hotel;
	}

	@Override
	public HotelEntity update(HotelEntity entity) {
		return null;
	}

	@Override
	public void delete(long id) {
		Repository.deleteById(id);
	}

	@Override
	public List<HotelEntity> findAll() {
		return Repository.findAll();
	}

	@Override
	public Optional<HotelEntity> findById(long id) {
		Optional<HotelEntity> entity = Repository.findById(id);
		return entity;
	}

	@Override
	public HotelEntity getById(long id) {
		return Repository.findId(id);
	}

}
