package com.example.keyboard_mobile_app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Product {
    public String productId;

    public String productName;

    public int quantity;

    public String unit;

    public String description;

    public String displayUrl;

    public String category;

    public String brand;
}
