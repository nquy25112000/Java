package com.ShopShoe.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ShopShoe.entity.HotelEntity;
import com.ShopShoe.service.Implements.HotelServiceIplm;

@RestController
@RequestMapping("hotel")
public class HotelController {

	@Autowired
	HotelServiceIplm hotelServices;

	@GetMapping("/entity")
	public List<HotelEntity> getAllHotel() {
		return  hotelServices.findAll();
	}
	
	@GetMapping("/findOne/{id}")
	public Optional<HotelEntity> findOne(@PathVariable long id) {
		return hotelServices.findById(id);
	}
	
	@GetMapping("/findOne2/{id}")
	public HotelEntity findOne2(@PathVariable long id) {
		return hotelServices.getById(id);
	}

	@PostMapping("/create")
	public HotelEntity created(@RequestBody HotelEntity entity) {
		entity = hotelServices.save(entity);
		return entity;
	}

	@DeleteMapping("/delete/{id}")
	public List<HotelEntity> delete(@PathVariable long id) {
		hotelServices.delete(id);
		return this.getAllHotel();
	}
}
