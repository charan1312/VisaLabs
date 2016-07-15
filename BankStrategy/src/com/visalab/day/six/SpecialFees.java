package com.visalab.day.six;

/**
 * Created by caware on 7/15/2016.
 */
public class SpecialFees implements ApplyFeesStrategy{
    @Override
    public double checkBalance(double bal, double amnt) {

        double creditBal =  bal - amnt ;
        if(creditBal >= 0)
            return 0;
        else if(creditBal < 0 && creditBal >= -100)
            return 2;
        else
            return 5;
    }

    @Override
    public double checkTimesWithdrawnPerMonth(int times) {
        if(times == 5)
            return 2;
        else if(times == 4)
            return 1.50;
        else if(times == 3)
            return 1;
        else
            return 0;
    }


    public SpecialFees() {
        System.out.println("Assigned Special Withdrawal Fees Strategy");
    }
}
