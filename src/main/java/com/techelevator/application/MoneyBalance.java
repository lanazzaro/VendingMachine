package com.techelevator.application;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyBalance {
    private BigDecimal currentBalance = new BigDecimal("0");

    public MoneyBalance(){
    }

    public BigDecimal addToCurrentBalance(BigDecimal moneyFed){
        currentBalance = (currentBalance.add(moneyFed));
        return currentBalance;
        //BigDecimal moneyFedDecimal = new BigDecimal(moneyFed);
    }

    public BigDecimal subtractFromCurrentBalance(BigDecimal cost){
            currentBalance = (currentBalance.subtract(cost));
        return currentBalance;
    }
//BigDecimal snackCostBD = new BigDecimal(String.valueOf(snackCost));
//        double moneyMinusSnackCost = inputMoney.getCurrentBalance().subtract(snackCostBD).doubleValue();
//       boolean enoughMoney = moneyMinusSnackCost >= 0;
//       return enoughMoney;

    public void giveChange(){
        BigDecimal balance = this.currentBalance;
        int nickels = 0;
        int quarters = 0;
        int dimes = 0;
        int dollars = 0;

        while(balance.doubleValue() >= 1.0){
            balance = balance.subtract(BigDecimal.ONE);
            dollars += 1;
        }
        while(balance.doubleValue() >= 0.25){
            balance = balance.subtract(new BigDecimal(".25"));
            quarters += 1;
        }
        while(balance.doubleValue() >= 0.1){
            balance = balance.subtract(new BigDecimal(".1"));
            dimes += 1;
        }
        while(balance.doubleValue() >= 0.05){
            balance = balance.subtract(new BigDecimal(".05"));
            nickels += 1;
        }
        System.out.println("Here's your change! Dollars: " + dollars + " Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels);
        balance = BigDecimal.ZERO;
    }

    public BigDecimal bogodoSale(){
        return currentBalance = currentBalance.add(BigDecimal.ONE);
    }


    public BigDecimal getCurrentBalance() {
        this.currentBalance = this.currentBalance.setScale(2);
        return currentBalance;
    }
}
