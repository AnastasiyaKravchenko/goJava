package com.goit.core.module07;

import com.goit.core.module04.Currency;

/**
 * Created by Mala on 12/12/2016.
 */
public class Order implements Comparable<Order>{
    private long id;
    protected int price;
    protected Currency currency;
    protected String itemName;
    protected String shopIdentificator;
    protected User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        return this.price - o.price;
    }


}
