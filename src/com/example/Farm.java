package com.example;

import com.example.animal.Animal;
import com.example.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animalList = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
        animal.makeSound();
    }

    public List<Product> getProduction() {
        List<Product> products = new ArrayList<Product>();
        for (Animal animal : animalList) {
            Product product = animal.getProduct();
            System.out.println(animal + " принесла нам " + product);
            products.add(product);
        }
        return products;
    }
}
