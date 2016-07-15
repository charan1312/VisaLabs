package com.visalab.day.six;

/**
 * Created by caware on 7/15/2016.
 */
public class SpecialWithDrawal implements GrantWithdrawalStrategy {
    @Override
    public boolean checkAvailableBalance(double bal, double withdrawAmount) {
        return bal - withdrawAmount >= -150;
    }

    @Override
    public boolean checkTimesWithdrawnInMonth(int nOfWithdrawals) {
        return nOfWithdrawals < 5;
    }

    public SpecialWithDrawal() {
        System.out.println("Assigned Special Withdrawal Strategy");
    }
}

