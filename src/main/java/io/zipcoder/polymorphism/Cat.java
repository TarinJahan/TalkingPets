package io.zipcoder.polymorphism;

public class Cat extends Pets {

    String name;
    public Cat(){
        name = "";
    }
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        super.speak();
        return "Meow";
    }
}
