package com.dti.workshop;

import java.util.Scanner;

public class AmericanShare {
    //data member
    private double money;
    private int person;
    private double moneyShare;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public double getMoneyShare() {
        return moneyShare;
    }

    public void setMoneyShare(double moneyShare) {
        this.moneyShare = moneyShare;
    }

    public void showMoneyShare() {System.out.println("Money share per person is : " + getMoneyShare());}

}
