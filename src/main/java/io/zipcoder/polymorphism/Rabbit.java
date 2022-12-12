package io.zipcoder.polymorphism;

public class Rabbit extends Pets{

   public Rabbit(){
       name = "";

   }
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "kip-kip";
    }
}
