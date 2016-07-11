package com.visalab.day.four;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account[] accounts = new Account[3];
        accounts[0] = new MortgageAccount("Holder 1",100000);
        accounts[1] =  new CheckingAccount("Holder 2",200);
        accounts[2] =  new CheckingAccount("Holder 3",1000);

        for( int i = 0 ; i < accounts.length ; i++ ) {
            System.out.println(accounts[i].deposit(1000));
            System.out.println("Current Balance:" + accounts[i].getBalance());
            System.out.println(accounts[i].withdraw(500));
            System.out.println("Current Balance:" + accounts[i].getBalance());
            System.out.println(accounts[i].withdraw(1000));
            System.out.println("Current Balance:" + accounts[i].getBalance());
            System.out.println(accounts[i].withdraw(2000));
            System.out.println("Current Balance:" + accounts[i].getBalance());
        }
    }
}
