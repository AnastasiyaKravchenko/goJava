package com.goit.core.module08;

import java.util.List;

/**
 * Created by Mala on 12/29/2016.
 */
public interface AbstractDAO<T> {
    void save(DB<T> db,T t);
    void delete(DB<T> db,T t);
    void deleteAll(DB<T> db,List T);
    void saveAll(DB<T> db,List T);
    List <T> getList(DB<T> db);



}
