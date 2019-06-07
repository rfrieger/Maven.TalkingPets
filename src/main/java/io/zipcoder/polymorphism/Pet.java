package io.zipcoder.polymorphism;

abstract class Pet {
    private String name;


    Pet() {
        this.name = "fido";
    }
    Pet(String name) {
        this.name = name;
    }

    Pet(String name, String type) {
        this.name =name;
    }

    abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
