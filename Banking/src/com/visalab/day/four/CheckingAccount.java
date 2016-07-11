package com.visalab.day.four;

/**
 * Created by CAWARE on 7/8/2016.
 */
public class CheckingAccount extends Account {

    private long overDraft ;

    public CheckingAccount(String name, long amt) {
        super(name);
        this.overDraft = amt;
    }

    @Override
    public boolean deposit(long amt) {
        super.transaction("Checking Deposit",amt);
        return true;
    }

    @Override
    public boolean withdraw(long amt) {
        if((super.getBalance() - amt) > overDraft) {
            super.transaction("Checking Withdrawal", -1 * amt);
            return true;
        }
        else
            return false;
    }
}
