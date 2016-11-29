package com.goit.core.module05.controllers;

import com.goit.core.module05.apis.Api;
import com.goit.core.module05.apis.BookingComApi;
import com.goit.core.module05.apis.GoogleApi;
import com.goit.core.module05.apis.TripAdvisorApi;
import com.goit.core.module05.entities.Room;

/**
 * Created by Mala on 11/28/2016.
 */
public class Controller {
    private Api apis[] = new Api[3];

    public Controller() {
        Api api1 = new BookingComApi();
        apis[0] = api1;
        Api api2 = new TripAdvisorApi();
        apis[1] = api2;
        Api api3 = new GoogleApi();
        apis[2] = api3;
    }

    public Room[] requestRooms(int price, int persons, String hotel, String city) {
        Room[] rooms1 = apis[0].findRooms(price, persons, hotel, city);
        Room[] rooms2 = apis[1].findRooms(price, persons, hotel, city);
        Room[] rooms3 = apis[2].findRooms(price, persons, hotel, city);
        Room[] resultDB = new Room[rooms1.length + rooms2.length + rooms3.length];
        System.arraycopy(rooms1, 0, resultDB, 0, rooms1.length);
        System.arraycopy(rooms2, 0, resultDB, rooms1.length, rooms2.length);
        System.arraycopy(rooms3, 0, resultDB, rooms1.length + rooms2.length, rooms3.length);
        return resultDB;

    }

    public Room[] check(Api api1, Api api2) {
        int count = 0;
        Room[] rooms1 = api1.getAllRooms();
        Room[] rooms2 = api2.getAllRooms();
        Room[] result = new Room[rooms1.length];
        for (Room room1 : rooms1) {
            for (Room room2 : rooms2) {
                if (room1.equals(room2)) {
                    result[count] = room1;
                    count++;
                }
            }
        }
        Room[] resultTrimmed = new Room[count];
        System.arraycopy(result, 0, resultTrimmed, 0, count);
        return resultTrimmed;
    }
}
