package com.company;

public class MasinaOras extends Masina{

    public MasinaOras(String brand, int price) {

        super(brand, price);

        traction = new FrontTraction();


    }

    @Override
    public void showCar() {

        System.out.println("This is a city car brand " + this.getBrand());

    }
}
