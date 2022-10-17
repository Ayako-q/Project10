package com.example.project10;

import java.util.Scanner;

public class Collection {
    // 2.1 private property count to store number of elements.
    private int countOfObjects;
    // 2.2 private array to store objects.
    private Camera[] collection;

    public int getCountOfObjects() {
        return countOfObjects;
    }

    // 2.3 add(newObj) method to add new items.
    public void addCamera(Camera c) {
        Camera[] arr = new Camera[countOfObjects + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = collection[i];
        }
        arr[countOfObjects] = c;
        collection = arr;
        countOfObjects++;
        System.out.println("\nYour camera has been successfully added");
    }

    public void toCameraProperties(String i) {
        String[] o = i.trim().split("\s+");
        Camera cam = new Camera();
        cam.setBrand(o[0]);
        cam.setModel(o[1]);
        cam.setType(o[2]);
        if (o[2].toLowerCase().equals("digital")) {
            cam.setIsoMin(Integer.parseInt(o[3]));
            cam.setIsoMax(Integer.parseInt(o[4]));
        }
        addCamera(cam);
    }

    // 2.4 method to print whole list of objects.
    public void printAllCamers() {
        for (Camera c : collection)
            c.printDescription();
    }

    // 2.5 find methods
    public void findByModel() {
        System.out.println("What is the model of camera we are looking for?");
        String model = inputString();
        for (Camera c : collection) {
            if (c.getModel().toLowerCase().equals(model)) {
                c.printDescription();
            }
        }
    }

    // 2.6 sort() method
    public void sortCameras() {
        boolean isSorted = false;
        int outIterations = 0;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < countOfObjects - outIterations - 1; j++) {
                if (collection[j].getType().equals("Film")) {
                    isSorted = false;
                    Camera temp = collection[j];
                    collection[j] = collection[j + 1];
                    collection[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting your collection looks like:");
        printAllCamers();
    }

    // 2.7 other method for search objects
    public void findByBrand() {
        System.out.println("What is the brand of camera we are looking for?");
        String brand = inputString();
        System.out.println("\nFound results:");
        for (Camera c : collection) {
            if (c.getBrand().toLowerCase().equals(brand)) {
                c.printDescription();
            }
        }
    }

    // Method for outputing options that are available
    public void UI() {
        System.out.println("\nChoose an option to proceed:\n" +
                "1 - add camera to collection\n" +
                "2 - print all cameras\n" +
                "3 - search cameras by model\n" +
                "4 - search cameras by brand\n" +
                "5 - sort cameras by type\n" +
                "0 - exit the program\n");
    }

    public void logic() {
        boolean isHere = true;
        while (isHere) {
            UI(); // show user available options
            String userInput = inputString();
            if (userInput.equals("1")) {
                System.out.println("Please, enter you camera data in format:\n" +
                        "'Brand' 'model' 'type' and for digital 'min ISO' 'max ISO'");
                toCameraProperties(inputString());
            } else if (userInput.equals("2")) {
                printAllCamers();
            } else if (userInput.equals("3")) {
                findByModel();
            } else if (userInput.equals("4")) {
                findByBrand();
            } else if (userInput.equals("5")) {
                sortCameras();
            } else {
                isHere = false;
            }
        }

    }

    public String inputString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
