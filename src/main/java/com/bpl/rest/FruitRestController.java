package com.bpl.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bpl.entity.Fruit;
import com.bpl.service.IFruitService;

@RestController
public class FruitRestController {

	@Autowired
	private IFruitService service;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveFruit(@RequestBody Fruit fruit){
		String msg=service.registerFruit(fruit);
	return new ResponseEntity<>(msg,HttpStatus.CREATED); 
	}
	
	@GetMapping("/show")
	public ResponseEntity<?> showAllFruit(){
		List<Fruit> listFruit=service.showAllFruit();
		return new ResponseEntity<>(listFruit,HttpStatus.OK);
	}
}
