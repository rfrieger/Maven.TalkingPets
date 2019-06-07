package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;


public class PetTest{

    @Test
    public void PetConstructorNoarguments() {
        Pet c = new Cat();
        String actual = c.getName();
        String expected = "Jeff";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void PetConstructor() {
        Pet c = new Cat("fido");
        String actual = c.getName();
        String expected = "fido";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public  void speakTest() {
        Pet c = new Cat();
        String actual = c.speak();
        String expected = "Meow";

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void getName() {
        Pet c = new Cat();
        String actual = c.getName();
        String expected = "Jeff";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setName() {
        Pet c = new Cat();
        c.setName("whatever");
        String actual = c.getName();
        String expected = "whatever";

        Assert.assertEquals(actual, expected);
    }
}
