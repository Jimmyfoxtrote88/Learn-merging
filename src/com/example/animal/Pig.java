package com.example.animal;

import com.example.products.Meat;
import com.example.products.Product;

import java.util.Random;

public class Pig implements Animal {
    private final String name;
    private int volume = new Random().nextInt(13) + 2;

    public Pig() {
        name = "безымянная";
    }

    public Pig(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Хрю");
    }

    @Override
    public Product getProduct() {
        return new Meat(volume);
    }

    @Override
    public String toString() {
        return "Свинка по имени " + name;
    }
}
