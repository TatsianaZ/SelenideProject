package com.it_academy.functional_tests.onliner;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        /////////////Java 5
        List animals = new ArrayList();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Pig");

        String animal = (String) animals.get(1);
        System.out.println(animal);

        //////////С появлением джинериков
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Pig");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        //////////Java 7

        List<String> animals3 = new ArrayList<>();
        animals3.add("Cat");
        animals3.add("Dog");
        animals3.add("Pig");

        System.out.println(animals3);
    }
}
