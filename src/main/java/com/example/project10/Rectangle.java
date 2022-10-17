package com.example.project10;

//Part 1. References
//1.1
public class Rectangle {
    public int length;
    public int width;

    // constructor
    public Rectangle(int length, int width) {
        this.width = width;
        this.length = length;
    }

    public void printRectangle() {
        System.out.println("\nRectangle length: " + length + "\nRectangle width: " + width);
    }
}