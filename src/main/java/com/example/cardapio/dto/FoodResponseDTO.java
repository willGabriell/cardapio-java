package com.example.cardapio.dto;

import com.example.cardapio.model.Food;

public record FoodResponseDTO(long id, String title, String img, Integer price) {
    public FoodResponseDTO (Food food){
        this(food.getId(), food.getTitle(), food.getImg(), food.getPrice());
    }
}
