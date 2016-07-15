package com.visalab.day.six;

public class Main {

    public static void main(String[] args) {
        Account charan = new Account("Charan",500,"Normal");
        charan.deposit(500);
        charan.withdraw(200);
        charan.withdraw(300);
        charan.withdraw(300);
        charan.withdraw(200);
        charan.setAcntType("Special");
        charan.withdraw(200);
    }
}
