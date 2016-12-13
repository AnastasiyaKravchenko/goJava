package com.goit.core.module07;

import java.util.Comparator;

/**
 * Created by Mala on 12/12/2016.
 */
public class PriceAndCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.user.city.compareTo(o2.user.city) == 0) {
            return o1.price - o2.price;
        };
        return o1.user.city.compareTo(o2.user.city);
    }
}
