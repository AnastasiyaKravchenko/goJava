package com.goit.core.module04;


import static com.goit.core.module04.Currency.EUR;
import static com.goit.core.module04.Currency.USD;

public class Main {
    public static void main(String[] args) {
        USBank usBank1 = new USBank(10000535, "Kanada", EUR, 250, 6655, 2, 200000000);
        USBank usBank2 = new USBank(10002545, "The USA", USD, 3000, 5200, 1, 500000000);
        EUBank euBank1 = new EUBank(10002544, "Italy", EUR, 160, 3200, 6, 200000);
        EUBank euBank2 = new EUBank(10255564, "Switzerland",EUR , 100, 6000, 1, 700000000);
        ChinaBank chinaBank1 = new ChinaBank(10002031, "China",USD , 3000, 5200, 2, 2005000);
        ChinaBank chinaBank2 = new ChinaBank(10002785, "China",EUR , 3000, 5200, 1, 2500000);

        User user1 = new User(12653,"Nadya",5000,5,"Samsung",5500,usBank1);
        User user2 = new User(12554,"Emilia",3500,8,"Lenovo",5500,euBank2);
        User user3 = new User(12655,"Anastasiya",15000,15,"Asus",5500,chinaBank1);
        BankSystem bankSystem=new BankSystemImpl();

        System.out.println(user1);
        bankSystem.fundUser(user1,30000);
        bankSystem.withdrawOfUser(user1,5000);
        bankSystem.transferMoney(user1,user2,100);
        bankSystem.paySalary(user1);
        System.out.println("----------------------------------------------------------");

        System.out.println(user2);
        bankSystem.fundUser(user2,30000);
        bankSystem.withdrawOfUser(user2,100);
        bankSystem.transferMoney(user2,user3,100);
        bankSystem.paySalary(user2);
        System.out.println("----------------------------------------------------------");

        System.out.println(user3);
        bankSystem.fundUser(user3,30000);
        bankSystem.withdrawOfUser(user3,5000);
        bankSystem.transferMoney(user3,user1,10000);
        bankSystem.paySalary(user3);
        System.out.println("----------------------------------------------------------");


    }
}
