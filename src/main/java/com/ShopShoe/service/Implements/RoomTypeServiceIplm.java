package com.ShopShoe.service.Implements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ShopShoe.entity.RoomTypeEntity;
import com.ShopShoe.repository.RoomTypeRepositoty;
import com.ShopShoe.services.IBaseService;

@Service
public class RoomTypeServiceIplm implements IBaseService<RoomTypeEntity>{


	@Autowired
	private RoomTypeRepositoty Repository;
	
	@Override
	public RoomTypeEntity save(RoomTypeEntity hotel) {
		Repository.save(hotel);
		return hotel;
	}
	@Override
	public RoomTypeEntity update(RoomTypeEntity entity) {
		return null;
	}

	@Override
	public void delete(long id) {
		Repository.deleteById(id);
	}

	@Override
	public List<RoomTypeEntity> findAll() {
		return Repository.findAll();
	}

	@Override
	public Optional<RoomTypeEntity> findById(long id) {
		Optional<RoomTypeEntity> entity = Repository.findById(id);
		return entity;
	}


}
