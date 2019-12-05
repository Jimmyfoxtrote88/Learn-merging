package com.example;

import com.example.animal.Cow;
import com.example.animal.Pig;
import com.example.products.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm();
        farm.addAnimal(new Cow());
        farm.addAnimal(new Cow("Буренка"));
        farm.addAnimal(new Cow());
        farm.addAnimal(new Cow());
        farm.addAnimal(new Pig());
        farm.addAnimal(new Pig("Хавронья"));
        farm.addAnimal(new Pig());

        List<Product> production = farm.getProduction();
        System.out.println(production);

    }
}
