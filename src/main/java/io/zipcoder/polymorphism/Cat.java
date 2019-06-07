package io.zipcoder.polymorphism;

public class Cat extends Pet {
    private String name;

    Cat() {
        super("Jeff");
    }
    Cat(String name) {
        super(name);
    }


    public String speak() {
        return "Meow";
    }
}
