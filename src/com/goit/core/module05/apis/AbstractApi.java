package com.goit.core.module05.apis;

import com.goit.core.module05.entities.Room;

/**
 * Created by ajoshi on 29-Nov-16.
 */
abstract class AbstractApi implements Api {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] allRooms = getAllRooms();
        Room[] found = new Room[allRooms.length];
        int count = 0;
        for (int i = 0; i < allRooms.length; i++) {
            if (allRooms[i].getPrice() <= price &&
                    (persons <= allRooms[i].getPersons()) &&
                    ((city.equals(allRooms[i].getCityName())) &&
                    (hotel.equals(allRooms[i].getHotelName())))) {
                found[count] = allRooms[i];
                count++;
            }
        }
        Room[] foundTrimmed = new Room[count];
        System.arraycopy(found, 0, foundTrimmed, 0, count);
        return foundTrimmed;
    }
}
