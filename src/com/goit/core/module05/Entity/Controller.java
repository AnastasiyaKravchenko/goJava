package com.goit.core.module05.Entity;

import com.goit.core.module05.API.API;
import com.goit.core.module05.API.BookingComAPI;
import com.goit.core.module05.API.TripAdvisorAPI;
import com.goit.core.module05.API.GoogleAPI;

/**
 * Created by Mala on 11/28/2016.
 */
public class Controller {
    API apis[] = new API[3];

    public Controller() {
        API api1 = new BookingComAPI();
        apis[0] = api1;
        API api2 = new TripAdvisorAPI();
        apis[1] = api2;
        API api3 = new GoogleAPI();
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

    public Room[] check(API api1, API api2) {
        Room[] rooms1 = api1.getAllRooms();
        Room[] rooms2 = api2.getAllRooms();
        Room[] result = new Room[rooms1.length + rooms2.length];
        int count = 0;
        for (int i = 0; i < rooms1.length; i++) {
            for (int j = 0; j < rooms2.length; j++) {
                if (rooms1[i].equals(rooms2[j])) {
                    result[count] = rooms1[i];
                    count++;
                }
            }
        }
        Room[] finalResult = new Room[count];
        if (count != 0)
            System.arraycopy(result, 0, finalResult, 0, count);
        return finalResult;
    }
}
