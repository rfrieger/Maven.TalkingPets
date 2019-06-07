package io.zipcoder.polymorphism;

public class Dog extends Pet {
    private String name;

    Dog() {
        super("fido");
    }
    Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Bark";
    }


}
