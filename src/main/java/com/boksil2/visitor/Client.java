package com.boksil2.visitor;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        Device device = new Pad();
        rectangle.accept(device);
    }

}
