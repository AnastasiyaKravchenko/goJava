package com.goit.core.module05.API;

import com.goit.core.module05.Entity.Room;

/**
 * Created by Mala on 11/27/2016.
 */
 public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room [] getAllRooms();
 }
