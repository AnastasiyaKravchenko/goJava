package com.goit.core.module05.API;

import com.goit.core.module05.Entity.Room;

import java.util.Date;

/**
 * Created by Mala on 11/27/2016.
 */

public class BookingComAPI implements API {
    static private final Room[] rooms = new Room[5];

    static  {
        Room single = new Room(1, 200, 1,new Date() , "LEOPOLIS HOTEL", "LVIV");
        rooms[0] = single;
        Room twin = new Room(2, 500, 4, new Date() , "MIRRORS DESIGN HOTEL", "KYIV");
        rooms[1] = twin;
        Room queen = new Room(3, 1200, 2, new Date(), "FAIRMONT GRAND HOTEL", "KYIV");
        rooms[2] = queen;
        Room triple = new Room(4, 900, 3, new Date(), "KHARKIV PALACE PREMIER HOTEL", "KHARKIV");
        rooms[3] = triple;
        Room studio = new Room(5, 4000, 2, new Date(), "INTERCONTINENTAL", "KYIV");
        rooms[4] = studio;
    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        Room[] found = new Room[rooms.length];
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() <= price &&
                    (persons <= rooms[i].getPersons()) &&
                    ((city.equals(rooms[i].getCityName())) &&
                            (hotel.equals(rooms[i].getHotelName())))) {
                found[count] = rooms[i];
                count++;
            }
        }
        Room[] finalFound=new Room[count];
        if (count != 0)
            System.arraycopy(found, 0, finalFound, 0, finalFound.length);
        return finalFound;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}



