package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {


    public static void main(String[] args) {
        InputHandler input = new InputHandler();

        input.getPetNum();
        input.addPetsArray();

        for (Pet p: input.pets) {
            System.out.println(p.getName());
            System.out.println(p.speak());
        }
    }
}
