package com.goit.core.module08;
import java.util.List;

/**
 * Created by Mala on 12/29/2016.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {

    @Override
    public void save(DB<T> db,T t) {
        db.list.add(t);
    }

    @Override
    public void delete(DB<T> db,T t) {
    db.list.remove(t);
    }

    @Override
    public void deleteAll(DB<T> db,List T) {
        db.list.removeAll(T);
    }

    @Override
    public void saveAll(DB<T> db,List T) {
        db.list.addAll(T);
    }

    @Override
    public List<T> getList(DB<T> db) {
        return db.list;
    }


}
