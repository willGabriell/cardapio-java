package com.example.cardapio.repository;

import com.example.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRespository extends JpaRepository<Food, Long> {

}
