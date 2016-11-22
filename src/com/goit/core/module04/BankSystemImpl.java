package com.goit.core.module04;

interface BankSystem {
    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}

class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfWithdrawal()) {
            double balance = user.getBalance() - amount - amount * user.getBank().getCommission(amount)/100;
            System.out.println("Balance after withdraw is " + balance);
        } else
            System.out.println("ERROR! Not enough money for withdraw!");

    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount > user.getBank().getLimitOfFunding()) {
            double balance = user.getBalance() + amount;
            System.out.println("Balance after funding is " + balance);
        } else
            System.out.println("Action is not permitted because of Funding limit ");


    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if (amount <= fromUser.getBank().getLimitOfWithdrawal()) {
            double moneyFromUser = fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount)/100;
            double moneyToUser = toUser.getBalance() + amount;
            System.out.println("Transaction is successful");
        } else System.out.println("ERROR! Not enough money for transaction!");
    }

    @Override
    public void paySalary(User user) {
        int userSalary =user.getSalary()*user.getMonthsOfEmployment();
        System.out.println("Salary "+user.getName()+"'s for "+user.getMonthsOfEmployment()+" months is "+ userSalary);
    }
}

