package com.goit.core.module07.ArrayList;

import java.util.Comparator;

/**
 * Created by Mala on 12/12/2016.
 */
public class PriceAndCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getUser().getCity().compareTo(o2.getUser().getCity()) == 0) {
            return o1.getPrice() - o2.getPrice();
        };
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
