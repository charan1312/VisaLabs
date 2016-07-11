package com.visalab.day.four;

/**
 * Created by CAWARE on 7/8/2016.
 */
public abstract class Account {
    private long balance;
    private String holderName;

    public Account() {
    }

    public Account(String name) {
        this.holderName = name;
    }

    public final void transaction(String msg, long amt) {
        System.out.println("Name:" + this.holderName);
        System.out.println("Message:" + msg);
        System.out.println("Amount:" + amt);
        this.balance += amt;
    }

    public long getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.holderName;
    }
    public abstract boolean deposit(long amt);

    public abstract boolean withdraw(long amt);
}
