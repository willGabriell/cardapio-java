package com.example.cardapio.model;

import com.example.cardapio.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String img;

    private Integer price;

    public Food(FoodRequestDTO data) {
        this.img = data.img();
        this.price = data.price();
        this.title = data.title();
    }

}
