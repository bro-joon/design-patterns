package com.boksil2.mediator;

import java.time.LocalDateTime;

public class Hotel {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.getTowers(3);
        guest.dinner(LocalDateTime.now());

        Restaurant restaurant = new Restaurant();
        restaurant.dinner(1111, LocalDateTime.now());
    }
}
