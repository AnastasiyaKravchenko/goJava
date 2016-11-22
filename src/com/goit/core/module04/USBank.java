package com.goit.core.module04;

import static com.goit.core.module04.Currency.USD;


public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {

        if (currency == Currency.USD) {
           // System.out.println("Withdraw limit in USD= " + 1000);
            return 1000;
        } else if (currency == Currency.EUR) {
           // System.out.println("Withdraw limit in EUR= " + 1200);
            return 1200;
        }
        else return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == Currency.USD) {
            //System.out.println("Funding limit in USD= " + 10000);
            return 10000;
        } else if(currency == Currency.EUR) {
           // System.out.println(" No funding limit in EUR ");
            return 0;
        }
        else return 0;

    }

    @Override
    int getMonthlyRate() {
        if(currency==Currency.USD){
           // System.out.println("Monthly rate 1% in USD" );
            return 1;
        }
        else if(currency==Currency.EUR){
            //System.out.println("Monthly rate 2% in EUR");
            return 2;
        }
        return 0;
    }

    @Override
    int getCommission(int summ) {
        if((summ<1000)&&(currency==Currency.USD)){
            //summ-=summ*0.05;
            //System.out.println("Commission is 5% for USD EUR and  summ>1000"+summ);
            return 5;
        }
        else if((summ>1000)&&(currency==Currency.USD)){
            //summ-=summ*0.07;
            //System.out.println("Commission is 7% for USD EUR and  summ<1000"+summ);
            return 7;
        }
        else if((summ<1000)&&(currency==Currency.EUR)){
            //summ-=summ*0.06;
            //System.out.println("Commission is 6% for EUR EUR and  summ>1000"+summ);
            return 6;
        }
        else if((summ>1000)&&(currency==Currency.EUR)){
           // summ-=summ*0.08;
           // System.out.println("Commission is 8% for EUR EUR and  summ<1000"+summ);
            return 8;
        }
        return 0;
    }
}

