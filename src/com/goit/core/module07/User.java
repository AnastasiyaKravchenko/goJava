package com.goit.core.module07;

/**
 * Created by Mala on 12/12/2016.
 */
public class User {
    private long id;
    protected String firstName;
    protected String lastName;
    protected String city;
    private int balance;

    public User(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

