package com.goit.core.module09;

import com.goit.core.module04.Currency;
import com.goit.core.module07.ArrayList.Order;
import com.goit.core.module07.ArrayList.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.goit.core.module04.Currency.EUR;
import static com.goit.core.module04.Currency.USD;

/**
 * Created by Mala on 12/12/2016.
 */
public class Main09 {
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

        Order order1 = new Order(1, 2000, EUR, "Watch", "Rozetka", user1);
        Order order2 = new Order(2, 130, USD, "Dior - Miss Dior", "Brocard", user2);
        Order order3 = new Order(3, 130, USD, "iPhone7", "Allo", user3);
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

        System.out.println("Sorted list by price in decrease order");
        sortPrice(list);
        System.out.println();
        System.out.println("");
        System.out.println("Sorted list by price and city");
        sortPriceAndCity(list);
        System.out.println();
        System.out.println("Sorted list by item, Id and city");
        sortItemIDCity(list);
        System.out.println();
        System.out.println("Splitted lists by currency");
        splitListByCurrency(list);
        System.out.println();
        System.out.println("Splitted lists by city name");
        splitListByCity(list);
        System.out.println();
        System.out.println("Check if Order contains last name Kravchenko");
        findLastName(list);
        System.out.println();
        System.out.println("List without doubles");
        deleteDoubles(list);
        System.out.println();
        System.out.println("List without price less than 1500");
        deletePrice(list);
        System.out.println();
        System.out.println("List without USD: ");
        deleteUSD(list);
    }

    static public void print(List<Order> list) {
        list.forEach(show -> System.out.println(show));
    }

    static void sortPrice(List<Order> list) {
        list.sort(Comparator.comparing(Order::getPrice).reversed());
        list.forEach(show -> System.out.println(show));
    }

    static void sortPriceAndCity(List<Order> list) {
        list.sort(Comparator.comparing(Order::getPrice)
                .thenComparing((a, b) -> a.getUser().getCity().compareTo(b.getUser().getCity())));
        list.forEach(show -> System.out.println(show));

    }

    static void sortItemIDCity(List<Order> list) {
        list.sort(Comparator.comparing(Order::getItemName)
                .thenComparing(Order::getId)
                .thenComparing((a, b) -> a.getUser().getCity().compareTo(b.getUser().getCity())));
        list.forEach(show -> System.out.println(show));
    }


    static void deleteDoubles(List<Order> list) {
        list.stream().distinct().collect(Collectors.toList()).forEach(show -> System.out.println(show));
    }

    static void deletePrice(List<Order> list) {
        list.removeIf(l -> l.getPrice() < 1500);
        list.forEach(show -> System.out.println(show));
    }

    static void splitListByCurrency(List<Order> list) {
        List<Order> listEUR = list.stream()
                .filter(l -> l.getCurrency() == Currency.EUR)
                .map(l -> new Order(l.getId(), l.getPrice(), l.getCurrency(), l.getItemName(), l.getShopIdentificator(), l.getUser())).collect(Collectors.toList());
        System.out.println("List only with EUR: ");
        listEUR.forEach(show -> System.out.println(show));

        List<Order> listUSD = list.stream()
                .filter(l -> l.getCurrency() == Currency.USD)
                .map(l -> new Order(l.getId(), l.getPrice(), l.getCurrency(), l.getItemName(), l.getShopIdentificator(), l.getUser())).collect(Collectors.toList());
        System.out.println("List only with USD: ");
        listUSD.forEach(show -> System.out.println(show));
    }

    static void splitListByCity(List<Order> list) {
        Map<String, List<Order>> cityList = list.stream()
                .collect(Collectors.groupingBy(l -> l.getUser().getCity()));
        cityList.entrySet().stream().forEach(System.out::println);
    }


    static void findLastName(List<Order> list) {
        list.stream()
                .filter(l -> l.getUser().getLastName() == "Kravchenko").forEach(show -> System.out.println(show));
    }

    static void deleteUSD(List<Order> list) {
        list.removeIf(l -> l.getCurrency() == Currency.USD);
        list.forEach(show -> System.out.println(show));

    }

}





