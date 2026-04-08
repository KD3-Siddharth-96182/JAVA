package com.sunbeam;

import java.util.ArrayList;


public class Que_3 {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original List: " + list);

        
        list.set(1, "Black");

        System.out.println("After Replacement: " + list);
    }
}