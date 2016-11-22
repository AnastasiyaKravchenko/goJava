package com.goit.core.module04;


public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {

        if (currency == Currency.USD) {
            //System.out.println("Withdraw limit in USD= " + 2000);
            return 2000;
        } else if (currency == Currency.EUR) {
            //System.out.println("Withdraw limit in EUR= " + 2200);
            return 2200;
        } else return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == Currency.USD) {
            //System.out.println("Funding limit in USD= " + 20000);
            return 20000;
        } else if (currency == Currency.EUR) {
            //System.out.println("Funding limit in EUR= " + 10000);
            return 10000;
        } else return 0;

    }

    @Override
    int getMonthlyRate() {
        if (currency == Currency.USD) {
            //System.out.println("Monthly rate 0% in USD" );
            return 0;
        } else if (currency == Currency.EUR) {
            //System.out.println("Monthly rate 1% in EUR");
            return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int summ) {
        if ((summ < 1000) && (currency == Currency.USD)) {
            // summ-=summ*0.05;
            //System.out.println("Commission is 5% for USD and summ<1000"+summ);
            return 5;
        } else if ((summ > 1000) && (currency == Currency.USD)) {
            // summ-=summ*0.07;
            //System.out.println("Commission is 7% for USD and summ>1000"+summ);
            return 7;
        } else if ((summ < 1000) && (currency == Currency.EUR)) {
            //summ-=summ*0.02;
            // System.out.println("Commission is 2% for EUR and summ<1000"+summ);
            return 2;
        } else if ((summ > 1000) && (currency == Currency.EUR)) {
            //summ -= summ * 0.04;
           // System.out.println("Commission is 4% for EUR and  summ>1000" + summ);
            return 4;
        }
        return 0;
    }

}
