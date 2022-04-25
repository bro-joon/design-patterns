package com.boksil2.abstractfactory;

import com.boksil2.factorymethod.Ship;
import com.boksil2.factorymethod.ShipFactory;
import com.boksil2.abstractfactory.WhiteshipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());

        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());


    }
}
