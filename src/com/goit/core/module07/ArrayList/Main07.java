package com.goit.core.module07.ArrayList;

import java.util.*;


import static com.goit.core.module04.Currency.EUR;
import static com.goit.core.module04.Currency.USD;

/**
 * Created by Mala on 12/12/2016.
 */
public class Main07 {
    public static void show(List list) {
        for (Object l : list)
            System.out.println(l.toString());
    }

    public static void main(String[] args) {
        User user1 = new User(101, "Ivan", "Gulin", "Zaporozhye", 2000);
        User user2 = new User(102, "Danil", "Dubunin", "Pavlograd", 8000);
        User user3 = new User(103, "Anastasiya", "Eropheeva", "Kiev", 815);
        User user4 = new User(104, "Dmitriy", "Zavrazhniy", "Sumy", 300);
        User user5 = new User(105, "Valentyn", "Kiyanitsa", "Kiev", 600);
        User user6 = new User(106, "Dmitriy", "Kukharenok", "Kiev", 8040);
        User user7 = new User(107, "Anasatsiya", "Konukh", "Kiev", 645);
        User user8 = new User(108, "Anastasiya", "Kravchenko", "Krivoy Rog", 6800);
        User user9 = new User(109, "Vladislav", "Kuleshov", "Pavlograd", 2300);
        User user10 = new User(110, "Ruslana", "Lishinskaya", "Kanev", 4552);

        Order order1 = new Order(1, 200, EUR, "Watch", "Rozetka", user1);
        Order order2 = new Order(2, 130, USD, "Dior - Miss Dior", "Brocard", user2);
        Order order3 = new Order(3, 700, USD, "iPhone7", "Allo", user3);
        Order order4 = new Order(4, 80, EUR, "Teddy", "Toys Home", user4);
        Order order5 = new Order(5, 430, USD, "Railway", "Toys Home", user5);
        Order order6 = new Order(6, 20, EUR, "Slippers", "Rozetka", user6);
        Order order7 = new Order(7, 350, USD, "Nomi Deka ", "Rozetka", user7);
        Order order8 = new Order(8, 50, USD, "Barbie", "Toys Home", user8);
        Order order9 = new Order(9, 100, EUR, "Elizabeth Arden", "Brocard", user9);
        Order order10 = new Order(10, 550, EUR, "Dior - Sauvage", "Brocard", user10);

        List<Order> list = new ArrayList<Order>();
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);
        list.add(order10);
        System.out.println("Before sort");
        show(list);

// Sort by price in decrease order
        System.out.println("--------------------------------------------------------");
        Collections.sort(list, new PriceComparator()) ;
        System.out.println("After Sort by price in decrease order");
        show(list);
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        Collections.sort(list, new PriceAndCityComparator()) ;
        System.out.println("After Sort by price in increase order AND User city");
        show(list);
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("After sort list by Order itemName AND ShopIdentificator AND User city");
        Collections.sort(list,new ComparatorItemNameANDShopIdentificatorANDUsercity());
        show(list);

    }
}





