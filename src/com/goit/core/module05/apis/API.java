package com.goit.core.module05.apis;

import com.goit.core.module05.entities.Room;

/**
 * Created by Mala on 11/27/2016.
 */
public interface Api {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAllRooms();
}
