package com.goit.core.module05.API;

import com.goit.core.module05.Entity.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mala on 11/27/2016.
 */

public class BookingComAPI implements API {
    static private final List<Room> rooms= new ArrayList<>();

    static  {
        rooms.add( new Room(1, 200, 1,new Date() , "LEOPOLIS HOTEL", "LVIV"));
        rooms.add (new Room(2, 500, 4, new Date() , "MIRRORS DESIGN HOTEL", "KYIV"));
        rooms.add(new Room(3, 1200, 2, new Date(), "FAIRMONT GRAND HOTEL", "KYIV"));
        rooms.add (new Room(4, 900, 3, new Date(), "KHARKIV PALACE PREMIER HOTEL", "KHARKIV"));
        rooms.add (new Room(5, 4000, 2, new Date(), "INTERCONTINENTAL", "KYIV"));
    }

    @Override
    public List<Room> findRooms(int price, int persons, String hotel, String city) {
        List<Room> found= new ArrayList<>();

        for (Room room :rooms) {
            if (room.getPrice() <= price &&
                    (persons <= room.getPersons()) &&
                    ((city.equals(room.getCityName())) &&
                            (hotel.equals(room.getHotelName())))) {
                found.add(room);

            }
        }
        return found;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }
}



