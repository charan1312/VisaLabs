package com.visalab.day.six;

/**
 * Created by caware on 7/15/2016.
 */
public interface ApplyFeesStrategy {

    public double checkBalance(double bal, double amnt);

    public double checkTimesWithdrawnPerMonth(int times);


}
