package com.goit.core.module05.API;

import com.goit.core.module05.Entity.Room;

import java.util.List;

/**
 * Created by Mala on 11/27/2016.
 */
 public interface API {
    List<Room> findRooms(int price, int persons, String city, String hotel);
    List<Room> getAllRooms();
 }
