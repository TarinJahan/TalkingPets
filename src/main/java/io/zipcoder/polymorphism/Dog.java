package io.zipcoder.polymorphism;

public class Dog extends Pets{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        super.speak();
        return "Woof";
    }
}
