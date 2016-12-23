package com.goit.core.module05.Entity;

import com.goit.core.module05.API.API;
import com.goit.core.module05.API.BookingComAPI;
import com.goit.core.module05.API.TripAdvisorAPI;
import com.goit.core.module05.API.GoogleAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mala on 11/28/2016.
 */
public class Controller {
    List<API> apis = new ArrayList<>();

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new TripAdvisorAPI());
        apis.add(new GoogleAPI());
    }

    public List<Room> requestRooms(int price, int persons, String hotel, String city) {

        List<Room> resultDB = new ArrayList<>();
        for (API api : apis) {
            for (Room room : api.findRooms(price, persons, hotel, city)) {
                resultDB.add(room);
            }
        }

        return resultDB;
    }

    public List<Room> check(API api1, API api2) {
        List<Room> rooms1 = new ArrayList<>();
        rooms1.addAll(api1.getAllRooms());
        List<Room> rooms2 = new ArrayList<>();
        rooms2.addAll(api2.getAllRooms());
        List<Room> result = new ArrayList<>();

        for (Room ap:rooms1) {
            for (Room ap2:rooms2) {
                if (ap.equals(ap2))
                    result.add(ap);

            }
        }
    return result;
    }
}
