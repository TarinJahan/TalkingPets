package io.zipcoder.polymorphism;

public class Dog extends Pets{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
