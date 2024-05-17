package com.bpl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpl.entity.Fruit;
import com.bpl.repo.FruitRepository;

@Service
public class FruitServiceImpl implements IFruitService {

	@Autowired
	private FruitRepository fruitRepo;
	
	@Override
	public String registerFruit(Fruit fruit) {
		Long idVal=fruitRepo.save(fruit).getFruitId();
		return "Fruit registered with id Value"+idVal;
	}

	@Override
	public List<Fruit> showAllFruit() {
		List<Fruit> listFruit=fruitRepo.findAll();
		return listFruit;
	}

}
