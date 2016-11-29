package com.goit.core.module05.apis;

import com.goit.core.module05.entities.Room;

import java.util.Date;

/**
 * Created by Mala on 11/27/2016.
 */
public class GoogleApi extends AbstractApi {
    private static final Room[] rooms = new Room[5];

    static {
        Room econom = new Room(201, 250, 2, new Date(), "CONTINENTAL", "ODESSA");
        rooms[0] = econom;
        Room superLux = new Room(202, 15000, 4, new Date(), "SWISS HOTEL", "LVIV");
        rooms[1] = superLux;
        Room suit = new Room(203, 2500, 5, new Date(), "FHYATT REGENCY", "KYIV");
        rooms[2] = suit;
        Room president = new Room(204, 20000, 6, new Date(), "RADISSON BLU RESORT", "BUKOVEL");
        rooms[3] = president;
        Room studio = new Room(205, 4000, 2, new Date(), "INTERCONTINENTAL", "KYIV");
        rooms[4] = studio;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
