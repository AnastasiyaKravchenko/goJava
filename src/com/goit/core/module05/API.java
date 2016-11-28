package com.goit.core.module05;

/**
 * Created by Mala on 11/27/2016.
 */
 interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room [] getAllRooms();
 }
