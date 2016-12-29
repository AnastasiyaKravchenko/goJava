package com.goit.core.module08;

/**
 * Created by Mala on 12/29/2016.
 */
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
