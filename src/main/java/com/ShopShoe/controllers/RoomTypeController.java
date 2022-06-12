package com.ShopShoe.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ShopShoe.entity.HotelEntity;
import com.ShopShoe.entity.RoomTypeEntity;
import com.ShopShoe.service.Implements.HotelServiceIplm;
import com.ShopShoe.service.Implements.RoomTypeServiceIplm;

@RestController
@RequestMapping("type")
public class RoomTypeController {

	@Autowired
	RoomTypeServiceIplm roomTypeService;

	@Autowired
	HotelServiceIplm hotelService;

	@GetMapping("/entity")
	public List<RoomTypeEntity> getAllHotel() {
		return roomTypeService.findAll();
	}

	@GetMapping("/findOne/{id}")
	public Optional<RoomTypeEntity> findOne(@PathVariable long id) {
		return roomTypeService.findById(id);
	}

	@PostMapping("/create/{hotelId}")
	public ResponseEntity<RoomTypeEntity> createComment(@PathVariable(value = "hotelId") long hotelId,
			@RequestBody RoomTypeEntity entity) {
		
		HotelEntity hotel = hotelService.getById(hotelId);
		entity.setHotel(hotel);
		roomTypeService.save(entity);
		return new ResponseEntity<>(entity, HttpStatus.CREATED);
	}
	
	
	@PostMapping("/createe")
	public ResponseEntity<RoomTypeEntity> createRoomType(@RequestBody RoomTypeEntity entity) {
		roomTypeService.save(entity);
		return new ResponseEntity<>(entity, HttpStatus.CREATED);
	}

	
	@DeleteMapping("/delete/{id}")
	public List<RoomTypeEntity> delete(@PathVariable long id) {
		roomTypeService.delete(id);
		return this.getAllHotel();
	}
}
