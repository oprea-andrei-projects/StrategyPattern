package com.company;

public class Main {

    public static void main(String[] args) {

        MasinaCurse masinaCurse = new MasinaCurse("bmw",3000);

        masinaCurse.performTraction();

        masinaCurse.setTraction(new RearTraction());

        masinaCurse.performTraction();

    }
}
