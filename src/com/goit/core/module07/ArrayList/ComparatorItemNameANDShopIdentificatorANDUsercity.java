package com.goit.core.module07.ArrayList;

import java.util.Comparator;

/**
 * Created by Mala on 12/12/2016.
 */
public class ComparatorItemNameANDShopIdentificatorANDUsercity implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getShopIdentificator().compareTo(o2.getShopIdentificator())==0){
            if(o1.getItemName().compareTo(o2.getItemName())==0)
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            else return o1.getItemName().compareTo(o2.getItemName());
        }
            return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
    }
}
