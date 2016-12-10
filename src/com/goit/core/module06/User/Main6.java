package com.goit.core.module06.User;

import java.util.Arrays;

/**
 * Created by Mala on 12/4/2016.
 */
public class Main6 {


    public static void main(String[] args) {
        User user1 = new User(1, "pppp", "oooo", 1000, 5000);
        User user2 = new User(2, "aa", "bb", 100, 500);
        User user3 = new User(3, "cc", "oooddo", 2000, 3000);
        User user4 = new User(4, "cc", "oooddo", 2000, 3000);

        User[] users = {user1, user2, user3, user4};

        System.out.println("Unique users: ");
        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
//        System.out.println("Conditional balance: ");
//        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(users,500)));
//        System.out.println("Deleting of empty users: ");
//        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
//        System.out.println("Users id: ");
//        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
//        System.out.println("Balance after salary: ");
//        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));

    }
}
