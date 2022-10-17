package com.example.project10;

public class Camera {
    private String brand;
    private String model;
    private String type;
    private int isoMin;
    private int isoMax;

    //setters:
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsoMin(int isoMin) {
        this.isoMin = isoMin;
    }

    public void setIsoMax(int isoMax) {
        this.isoMax = isoMax;
    }

    //getters:
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getIsoMin() {
        return isoMin;
    }

    public int getIsoMax() {
        return isoMax;
    }

    public String getIsoRange() {
        if (type.toLowerCase().equals("film"))
            return "for this type of camera - iso depends on film you will use";
        return isoMin + "-" + isoMax;
    }

    public String messageForType() {
        if (type.toLowerCase().equals("film"))
            return "You will have to buy a film before using this camera";
        return "You will have to charge the battery before using this camera";
    }

    public void printDescription() {
        System.out.println("\nCamera specifications:\n");
        System.out.println("Camera name: " + brand + " " + model);
        System.out.println("Camera type: " + type);
        System.out.println("ISO sensitivity: " + getIsoRange());
    }
}
