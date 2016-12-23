package com.goit.core.module07.ArrayList;

import com.goit.core.module04.Currency;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static com.goit.core.module04.Currency.EUR;
import static com.goit.core.module04.Currency.USD;

/**
 * Created by Mala on 12/12/2016.
 */
public class MainTreeSet {
    public static void show(Set set) {
        for (Object item : set)
            System.out.println(item.toString());
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
        Order order10 = new Order(9, 100, EUR, "Elizabeth Arden", "Brocard", user9);

        Set<Order> set = new TreeSet<>();
        set.add(order1);
        set.add(order2);
        set.add(order3);
        set.add(order4);
        set.add(order5);
        set.add(order6);
        set.add(order7);
        set.add(order8);
        set.add(order9);
        set.add(order10);

// Deleting orders with currency in USD
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
            Order element = iterator.next();
            if (element.getCurrency() == Currency.USD) {
                iterator.remove();
            }
        }
        System.out.println("Only Orders with currency in EUR:");
        show(set);
        System.out.println("");
        System.out.println("Are orders contain User with last name Kuleshov? "+containLastName(set, "Kuleshov"));
        System.out.println("");
        System.out.println("Order with Max price is: ");
        System.out.println(maxPriceOrder((TreeSet<Order>) set));
    }


    public static boolean containLastName(Set<Order> set, String lastName) {
        boolean flag=false;
        for (Order order : set) {
            if (order.getUser().getLastName().contains(lastName))
                flag= true;
        }
        return true;
    }

    public static Order maxPriceOrder(TreeSet<Order> set){
//        Order maxPrice=set.last();
        return set.last();
    }
}

