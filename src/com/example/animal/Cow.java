package com.example.animal;

import com.example.products.Meat;
import com.example.products.Product;

import java.util.Random;

public class Cow implements Animal {
    private int volume = new Random().nextInt(13) + 2;
    private final String name;

    public Cow() {
        name = "безымянная";
    }

    @Override
    public String toString() {
        return "Корова по имени " + name;
    }

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Муу");
    }

    @Override
    public Product getProduct() {
        Product milk = new Meat.Milk(volume);
        volume = 0;
        return milk;
    }


}
