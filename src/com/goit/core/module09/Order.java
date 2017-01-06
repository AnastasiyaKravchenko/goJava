package com.goit.core.module09;

import com.goit.core.module04.Currency;
import com.goit.core.module07.ArrayList.User;

/**
 * Created by Mala on 12/12/2016.
 */
public class Order implements Comparable<Order>{
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private com.goit.core.module07.ArrayList.User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, com.goit.core.module07.ArrayList.User user) {
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

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User getUser() {
        return user;
    }
}
