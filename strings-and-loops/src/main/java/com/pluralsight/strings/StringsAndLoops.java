package com.pluralsight.strings;

public class StringsAndLoops {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("Milk");
        System.out.println("Cereal");
        System.out.println("Bread");
        System.out.println("Chips");
        System.out.println("Salsa");
        System.out.println("Dip");
        System.out.println("Guacamole");
        System.out.println("Bagels");
        System.out.println("Seasoning");

        String[] list = {"Milk", "Cereal", "Bread", "Chips", "Salsa", "Dip", "Guacamole", "Bagels", "Seasoning"};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
