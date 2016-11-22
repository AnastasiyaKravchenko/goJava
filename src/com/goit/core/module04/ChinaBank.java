package com.goit.core.module04;


public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {

        if (currency == Currency.USD) {
            //System.out.println("Withdraw limit in USD= " + 100);
            return 100;
        } else if (currency == Currency.EUR) {
            //System.out.println("Withdraw limit in EUR= " + 150);
            return 150;
        }
        else return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == Currency.USD) {
           // System.out.println("Funding limit in USD= " + 5000);
            return 5000;
        } else if(currency == Currency.EUR) {
            //System.out.println("Funding limit in EUR= " + 10000);
            return 10000;
        }
        else return 0;

    }

    @Override
    int getMonthlyRate() {
        if(currency==Currency.USD){
            //System.out.println("Monthly rate 1% in USD" );
            return 1;
        }
        else if(currency==Currency.EUR){
            //System.out.println("Monthly rate 0% in EUR");
            return 0;
        }
        return 0;
    }

    @Override
    int getCommission(int summ) {
        if((summ<1000)&&(currency==Currency.USD)){
           // summ-=summ*0.03;
            //System.out.println("Commission is 3% for USD and summ<1000"+summ);
            return 3;
        }
        else if((summ>1000)&&(currency==Currency.USD)){
           //summ-=summ*0.05;
           // System.out.println("Commission is 5% for USD and summ>1000"+summ);
            return 5;
        }
        else if((summ<1000)&&(currency==Currency.EUR)){
           // summ-=summ*0.10;
           // System.out.println("Commission is 10% for EUR and summ<1000"+summ);
            return 10;
        }
        else if((summ>1000)&&(currency==Currency.EUR)){
           // summ-=summ*0.11;
           // System.out.println("Commission is 11% for EUR and  summ>1000"+summ);
            return 11;
        }
        return 0;
    }
}
