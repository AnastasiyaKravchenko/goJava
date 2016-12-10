package com.goit.core.module06.User;

/**
 * Created by Mala on 12/4/2016.
 */
public class UserUtils {


    public static User[] uniqueUsers(User[] users) {
        int count = 0;
        User[] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            for (int j = i+1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    result[count] = users[i];
                    count++;
                }
            }
        }
//        System.out.println(Arrays.toString(result));
        User[] finalResult=new User[count];
        if(count!=0)
            System.arraycopy(result, 0, finalResult, 0, count);
        else
            System.out.println("No one similar user");

        return finalResult;
    }


    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance)
                count++;
        }

        User[] condBal = new User[count];
        count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                condBal[count] = users[i];
                count++;
            }
        }
        return condBal;
    }


    public static final User[] paySalaryToUsers(User[] users) {
        int count = 0;
        for (int i = 0; i < users.length; i++)
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());

        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersId[i] = users[i].getId();
        }
        return usersId;
    }

//    public static User[] deleteEmptyUsers(User[] users) {
//        int count = 0;
//        User[] deleteUser = new User[count];
//
//        for (int i = 0; i < users.length; i++) {
//            if (users[i] == null) {
//                deleteUser[count] = users[i];
//                count++;
//            }
//
//        }
//        return deleteUser;
//    }
}

