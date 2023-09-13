package com.driver;

public class RWOnly {
     String name;

    // Constructor
    public RWOnly() {
        this.name = ""; // Initialize name with an empty string
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
