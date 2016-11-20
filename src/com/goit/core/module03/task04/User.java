package com.goit.core.module03.task04;


public class User {
    String name;
    int balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    String currency;



    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }



     void paySalary(){
        int sum=balance+salary;
        System.out.println("Salary balance= "+sum);

    }

      void withdraw(int summ){
          if(summ<1000)
              balance=balance-(balance*5)/100;
          else
              balance=balance-(balance*10)/100;
          System.out.println("Balance with withdraw= "+balance);
    }

    void companyNameLenght(String companyName) {
        int count = 0;

        int length = companyName.length();
        System.out.println("Length of company name= " + length);
    }


    void monthIncreaser(int addMonth){
        System.out.println("New amount months of employment= "+(monthsOfEmployment+addMonth));
    }
//---------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
