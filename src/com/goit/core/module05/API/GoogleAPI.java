package com.goit.core.module05.API;

import com.goit.core.module05.Entity.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mala on 11/27/2016.
 */
public class GoogleAPI implements API {
    static private final List<Room> rooms = new ArrayList<>();

    static {
        rooms.add(new Room(201, 250, 2, new Date(), "CONTINENTAL", "ODESSA"));
        rooms.add(new Room(202, 15000, 4, new Date(), "SWISS HOTEL", "LVIV"));
        rooms.add(new Room(203, 2500, 5, new Date(), "FHYATT REGENCY", "KYIV"));
        rooms.add(new Room(204, 20000, 6, new Date(), "RADISSON BLU RESORT", "BUKOVEL"));
        rooms.add(new Room(205, 4000, 2, new Date(), "INTERCONTINENTAL", "KYIV"));
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
