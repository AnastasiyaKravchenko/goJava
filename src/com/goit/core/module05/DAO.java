package com.goit.core.module05;

/**
 * Created by Mala on 11/28/2016.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
