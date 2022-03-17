package com.company;

public class MasinaCurse extends Masina {

    public MasinaCurse(String brand, int price) {

        super(brand,price);

        traction = new NitroTraction();

    }



    @Override
    public void showCar() {

        System.out.println("Aceasta e masina de curse marca " + this.getBrand());

    }
}
