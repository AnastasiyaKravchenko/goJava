package com.goit.core.module05.dao;

import com.goit.core.module05.entities.Room;

/**
 * Created by Mala on 11/28/2016.
 */
public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.getHotelName() + " saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.getHotelName() + " deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.getHotelName() + " update");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println(id + " found");
        return null;
    }
}
