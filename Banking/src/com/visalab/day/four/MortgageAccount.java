package com.visalab.day.four;

/**
 * Created by CAWARE on 7/8/2016.
 */
public class MortgageAccount extends Account {

    private long initBorrowed ;

    public MortgageAccount(String name, long amt) {
        super(name);
        super.transaction("Initial Borrowed Amount" , amt);
        //System.out.println("Initial borrowed Amount:" + amt);
        this.initBorrowed = amt;
    }

    @Override
    public boolean deposit(long amt) {
        super.transaction("Mortgage Payment", -1 * amt);
        return true;
    }

    @Override
    public boolean withdraw(long amt) {
        System.out.println("Withdraw not possible on Mortgage Account");
        return false;
    }
}
