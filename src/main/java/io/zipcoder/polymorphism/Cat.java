package io.zipcoder.polymorphism;

public class Cat extends Pets {
    String name = "";

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
