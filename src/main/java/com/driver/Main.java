package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // This will result in a compilation error
        obj.name = "John"; // Error: name has private access in RWOnly

        // Access the value using the getter
        String name = obj.getName();
        System.out.println("Name: " + name);
    }
}