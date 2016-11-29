package com.goit.core.module05.apis;

import com.goit.core.module05.entities.Room;

import java.util.Date;

/**
 * Created by Mala on 11/27/2016.
 */
public class TripAdvisorApi extends AbstractApi {
    private static final Room[] rooms = new Room[5];

    static {
        Room quad = new Room(101, 8000, 4, new Date(), "HILTON ", "KYIV");
        rooms[0] = quad;
        Room twin = new Room(102, 500, 4, new Date(), "MIRRORS DESIGN HOTEL", "KYIV");
        rooms[1] = twin;
        Room suit = new Room(103, 2500, 5, new Date(), "FHYATT REGENCY", "KYIV");
        rooms[2] = suit;
        Room king = new Room(104, 1900, 2, new Date(), "FOUR POINTS BY SHERATON ", "ZAPOROZHYE");
        rooms[3] = king;
        Room lux = new Room(105, 10000, 2, new Date(), "ASTORIA", "LVIV");
        rooms[4] = lux;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
