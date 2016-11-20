package com.goit.core.module03.task04;


public class Main {
    public static void main(String[] args) {
        User user=new User("Oleg",3000,5,"Samsung",10000,"yes");
        user.paySalary();
        user.withdraw(200);
        user.companyNameLenght("pppppp");
        user.monthIncreaser(12);


    }
}
