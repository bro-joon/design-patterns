package com.boksil2.strategy;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue lgiht");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });

    }
}
