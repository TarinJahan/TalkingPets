package io.zipcoder.polymorphism;

public class Dog extends Pets{
    String name;
    public Dog(){
        name = "";
    }
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        super.speak();
        return "Woof";
    }
}
