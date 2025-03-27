package com.rama.restaurant.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class RestaurantDto {
    private Long id;
    private String name;
    private String type;
}
