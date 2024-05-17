package com.bpl.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpl.entity.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Serializable> {

}
