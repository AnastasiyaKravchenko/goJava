package com.goit.core.module05.apis;

import com.goit.core.module05.entities.Room;

import java.util.Date;

/**
 * Created by Mala on 11/27/2016.
 */
public class BookingComApi extends AbstractApi {
    private static final Room[] rooms = new Room[5];

    static {
        Room single = new Room(1, 200, 1, new Date(), "LEOPOLIS HOTEL", "LVIV");
        rooms[0] = single;
        Room twin = new Room(2, 500, 4, new Date(), "MIRRORS DESIGN HOTEL", "KYIV");
        rooms[1] = twin;
        Room queen = new Room(3, 1200, 2, new Date(), "FAIRMONT GRAND HOTEL", "KYIV");
        rooms[2] = queen;
        Room triple = new Room(4, 900, 3, new Date(), "KHARKIV PALACE PREMIER HOTEL", "KHARKIV");
        rooms[3] = triple;
        Room studio = new Room(5, 4000, 2, new Date(), "INTERCONTINENTAL", "KYIV");
        rooms[4] = studio;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}



