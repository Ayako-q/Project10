package com.example.project10;

import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Part 1. References

        //1.1 Assignments
        // creating new objects and references
        System.out.println("\n----------------\nPart 1 section 1\n----------------\n");
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

        // Part 2
        System.out.println("\n----------------\n     Part 2\n----------------");
        System.out.println("\nWelcome to the cameras database!");
        Collection collection = new Collection();
        collection.logic();
    }
}