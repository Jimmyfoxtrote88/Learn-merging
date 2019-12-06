package com.example;

import com.example.animal.Animal;
import com.example.products.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * собираем со всех животных продукты и отправляем его в виде мапы
 * @return Map<Strin   ,       Integer> -- тип продукта и его количество
 */


public class Farm {
    List<Animal> animalList = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
        animal.makeSound();
    }

    public Map<String, Integer> getProduction() {
        Map<String, Integer> products;
        products = new HashMap<String, Integer>();
        for (Animal animal : animalList) {
            Product product = animal.getProduct();
            System.out.println(animal + " принесла нам " + product);
            // если хранилище не содержит записи об этом продукте
            if (products.get(product.getClass().getSimpleName()) == null) {
                //добавили его значение
                products.put(product.getClass().getSimpleName(), product.getValue());
            } else {
                // здесь добавляется значение продукта , если он уже есть в хранилище
                final Integer value = products.get(product.getClass().getSimpleName());
                products.put(product.getClass().getSimpleName(), value + product.getValue());
            }
        }
        return products;
    }
}
