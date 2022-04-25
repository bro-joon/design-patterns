package com.boksil2.abstractfactory;

import com.boksil2.factorymethod.Ship;
import com.boksil2.factorymethod.ShipFactory;
import com.boksil2.factorymethod.WhiteShipFactory;
import com.boksil2.factorymethod.Whiteship;

public class WhiteshipFactory implements ShipFactory  {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
