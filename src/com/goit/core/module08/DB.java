package com.goit.core.module08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mala on 12/29/2016.
 */
public class DB<T> {
      List<T> list=new ArrayList<>();

    @Override
    public String toString() {
        return "DB{" +
                "list=" + list +
                '}';
    }
}
