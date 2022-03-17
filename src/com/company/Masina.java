package com.company;

public abstract class Masina {

    Traction traction;

    private String brand;
    private int price;


    public Masina(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public abstract void showCar();

    public void performTraction(){

        traction.wheeldrive();
    }

    public Traction getTraction() {
        return traction;
    }

    public void setTraction(Traction traction) {
        this.traction = traction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
