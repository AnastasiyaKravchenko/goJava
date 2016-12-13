package com.goit.core.module07;

import java.util.Comparator;

/**
 * Created by Mala on 12/12/2016.
 */
class PriceComparator implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        return o2.price - o1.price;
    }
}
