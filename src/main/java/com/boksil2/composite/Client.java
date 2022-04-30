package com.boksil2.composite;

public class Client {
    public static void main(String[] args) {
        Item droanBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력물약", 50);

        Bag bag = new Bag();
        bag.add(droanBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(droanBlade);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}
