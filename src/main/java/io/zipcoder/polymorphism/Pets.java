package io.zipcoder.polymorphism;

public class Pets {
    String name;

    public Pets(){
        name = "";
    }
    public Pets(String name) {
        this.name = name;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String speak(){
        return "";
    }

}
