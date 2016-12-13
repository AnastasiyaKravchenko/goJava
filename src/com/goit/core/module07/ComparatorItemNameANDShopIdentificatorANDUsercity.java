package com.goit.core.module07;

import java.util.Comparator;

/**
 * Created by Mala on 12/12/2016.
 */
public class ComparatorItemNameANDShopIdentificatorANDUsercity implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if(o1.shopIdentificator.compareTo(o2.shopIdentificator)==0){
            if(o1.itemName.compareTo(o2.itemName)==0)
                return o1.user.city.compareTo(o2.user.city);
            else return o1.itemName.compareTo(o2.itemName);
        }
            return o1.shopIdentificator.compareTo(o2.shopIdentificator);
    }
}
