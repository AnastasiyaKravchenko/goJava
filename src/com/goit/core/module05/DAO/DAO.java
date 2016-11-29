package com.goit.core.module05.DAO;

import com.goit.core.module05.Entity.Room;

/**
 * Created by Mala on 11/28/2016.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
