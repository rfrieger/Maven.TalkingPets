package io.zipcoder.polymorphism;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InputHandlerTest {

    @Test
    public void getPetNum() {
    }

    @Test
    public void addPetsArray() {
        String type = "dog";
        String name = "name";
        Integer petNum = 1;
        ArrayList<Pet> pets = new ArrayList<Pet>(petNum);

        InputHandler in = new InputHandler();

        in.addPetsArray();

        System.out.println(pets.size());
    }

}