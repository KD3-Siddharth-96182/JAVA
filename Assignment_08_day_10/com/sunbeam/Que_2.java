package com.sunbeam;

import java.util.*;

public class Que_2 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

  
        Collections.sort(colors);


        System.out.println("Sorted Colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}