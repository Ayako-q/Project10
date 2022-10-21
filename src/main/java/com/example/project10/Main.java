package com.example.project10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Part 1. References

        //1.1 Assignments

        System.out.println("\n----------------\nPart 1 section 1\n----------------\n");

        // creating new objects and references
        Rectangle rec1 = new Rectangle(13, 5);
        Rectangle rec2;
        Rectangle rec3;
        // creating two object references
        rec2 = rec1;
        rec3 = rec2;
        System.out.println("Before changing the object properties:");
        rec2.printRectangle();
        // assigning new values to the objects' properties
        rec2.length = 9;
        rec3.width = 15;
        System.out.println("\nAfter changing the object properties");
        // check for changes
        rec2.printRectangle();

        System.out.println("\n----------------\nPart 1 section 2\n----------------");

        //1.2 Arguments
        // creating new object
        Bank account1 = new Bank(1000, "USD");
        // Our properties before change
        System.out.println("\nOur properties before change:");
        account1.printAccountInfo();
        // changing properties inside the method
        account1.usdToEur();
        // checking if properties have changed inside the method
        System.out.println("\nOur properties after change:");
        account1.printAccountInfo();

        System.out.println("\n----------------\n     Part 2\n----------------");

        // Part 2
        System.out.println("\nWelcome to the cameras database!");
        Collection collection = new Collection();
        collection.logic();
        // I have fixed my sort method, in video it doesn't sort at all, I have forgotten to place outerIterations++;
    }
}
