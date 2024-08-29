package com.example.cardapio.repository;

import com.example.cardapio.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRespository extends JpaRepository<Food, Long> {

}
