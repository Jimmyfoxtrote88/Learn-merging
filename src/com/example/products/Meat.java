package com.example.products;

public class Meat implements Product {

    private final int volume;

    public Meat(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Мясо %d кг", volume);
    }

    public static class Milk implements Product {
        private final int volume;

        public Milk(int volume) {
            this.volume = volume;
        }

        @Override
        public String toString() {
            return String.format("Молоко %d литров", volume);
        }
    }
}
