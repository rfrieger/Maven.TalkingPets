package io.zipcoder.polymorphism;

public class Mouse extends Pet {

    Mouse() {
        super("mousey");
    }

    Mouse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Mouse sound";
    }

}
