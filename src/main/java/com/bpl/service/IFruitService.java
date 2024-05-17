package com.bpl.service;

import java.util.List;

import com.bpl.entity.Fruit;

public interface IFruitService {

	public String registerFruit(Fruit fruit);
	public List<Fruit> showAllFruit();
}
