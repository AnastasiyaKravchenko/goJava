package com.goit.core.module08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mala on 12/29/2016.
 */
public class Main08 {
    public static void main(String[] args) {

        DB<User> DBuser=new DB<>();
        AbstractDAOImpl<User> abstractDAO=new AbstractDAOImpl<>();
        List<User> users=new ArrayList<>();
        User user1=new User("u1");
        User user2=new User("u2");
        User user3=new User("u3");
        User user4=new User("u4");
        User user8=new User("u8");
        User user9=new User("u9");
        User user7=new User("u7");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        List<User> usersToDelete= new ArrayList<>();
        usersToDelete.add(user2);
        usersToDelete.add(user8);

        List<User> usersToSaveAll= new ArrayList<>();
        usersToSaveAll.add(user7);
        usersToSaveAll.add(user8);
        usersToSaveAll.add(user9);


        abstractDAO.save(DBuser,user1);
        abstractDAO.save(DBuser,user2);
        abstractDAO.save(DBuser,user3);
        abstractDAO.save(DBuser,user4);

        System.out.println("DB with added users: "+DBuser);
        abstractDAO.delete(DBuser,users.get(2));
        System.out.println("DB without delete user: "+DBuser);
        abstractDAO.saveAll(DBuser,usersToSaveAll);
        System.out.println("DB users with all users from another list: "+DBuser);
        abstractDAO.deleteAll(DBuser,usersToDelete);
        System.out.println("DB users without all users from another list: "+DBuser);

        List<User> listUsers=abstractDAO.getList(DBuser);
        System.out.println("DB users"+listUsers.toString());








    }
}
