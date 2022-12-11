package io.zipcoder.polymorphism;

public class Rabbit extends Pets{
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("kip-kip");
    }
}
