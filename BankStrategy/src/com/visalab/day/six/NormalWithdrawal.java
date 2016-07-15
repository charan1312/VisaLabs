package com.visalab.day.six;

/**
 * Created by caware on 7/15/2016.
 */
public class NormalWithdrawal implements GrantWithdrawalStrategy{
    @Override
    public boolean checkAvailableBalance(double bal, double withdrawAmount) {
        return bal - withdrawAmount > 7;        //7 to compensate the highest withdrawal fees
    }

    @Override
    public boolean checkTimesWithdrawnInMonth(int nOfWithdrawals) {
        return nOfWithdrawals < 3;
    }

    public NormalWithdrawal() {
        System.out.println("Assigned Normal Withdrawal Strategy");
    }

}
