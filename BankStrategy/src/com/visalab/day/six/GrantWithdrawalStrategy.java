package com.visalab.day.six;

/**
 * Created by caware on 7/15/2016.
 */
public interface GrantWithdrawalStrategy {

    //public double balance;

    public boolean checkAvailableBalance(double bal, double withdrawAmount);

    public boolean checkTimesWithdrawnInMonth(int nOfWithdrawals);

}
