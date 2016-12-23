package com.goit.core.module05.API;

import com.goit.core.module05.Entity.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mala on 11/27/2016.
 */
public class TripAdvisorAPI implements API {
    static private final List<Room> rooms= new ArrayList<>();

    static {
        rooms.add(new Room(101, 8000, 4, new Date(), "HILTON ", "KYIV"));
        rooms.add(new Room(102, 500, 4, new Date(), "MIRRORS DESIGN HOTEL", "KYIV"));
        rooms.add(new Room(103, 2500, 5, new Date(), "FHYATT REGENCY", "KYIV"));
        rooms.add(new Room(104, 1900, 2, new Date(), "FOUR POINTS BY SHERATON ", "ZAPOROZHYE"));
        rooms.add(new Room(105, 10000, 2, new Date(), "ASTORIA", "LVIV"));
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
