package com.example;

import com.example.animal.Cow;
import com.example.animal.Pig;

import java.util.Map;

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

        final Map<String, Integer> products = farm.getProduction();
        System.out.println(products);

    }
}
