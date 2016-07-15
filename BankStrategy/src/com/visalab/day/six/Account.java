package com.visalab.day.six;

/**
 * Created by caware on 7/15/2016.
 */
public class Account {

    private double balance;
    private String holderName;
    private String acntType;
    private int numberofW;

    private GrantWithdrawalStrategy grantWithdrawalStrategy;
    private ApplyFeesStrategy applyFeesStrategy;


    public GrantWithdrawalStrategy getGrantWithdrawalStrategy() {
        return grantWithdrawalStrategy;
    }

    public void setGrantWithdrawalStrategy(GrantWithdrawalStrategy grantWithdrawalStrategy) {
        this.grantWithdrawalStrategy = grantWithdrawalStrategy;
    }

    public ApplyFeesStrategy getApplyFeesStrategy() {
        return applyFeesStrategy;
    }

    public void setApplyFeesStrategy(ApplyFeesStrategy applyFeesStrategy) {
        this.applyFeesStrategy = applyFeesStrategy;
    }

    public void setAcntType(String acntType) {
        this.acntType = acntType;
        if(acntType.equalsIgnoreCase("Normal")) {
            grantWithdrawalStrategy = new NormalWithdrawal();
            applyFeesStrategy = new NormalFees();
        }
        if(acntType.equalsIgnoreCase("Special")) {
            grantWithdrawalStrategy = new SpecialWithDrawal();
            applyFeesStrategy = new SpecialFees();
        }
    }

    public String getAcntType() {
        return acntType;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.holderName;
    }

    public Account(String name,double balance,String acntType) {
        this.holderName = name;
        this.balance = balance;
        setAcntType(acntType);
        numberofW = 0;

        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Account{" +
                "numberofW=" + numberofW +
                ", acntType='" + acntType + '\'' +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }

    private final void transaction(String msg, double amt, double fees) {
        System.out.println("Name:" + this.holderName);
        System.out.println("Message:" + msg);
        System.out.println("Amount:" + amt);
        if("Deposit".equalsIgnoreCase(msg)) {
            this.balance += amt;
        }
        if("Withdraw".equalsIgnoreCase(msg)) {
            this.balance -= amt;
            this.balance -= fees;
        }
        System.out.println("Current Balance(After Fees if WithDraw):" + this.balance);
    }


    public void deposit(double amt){
        if (amt > 0) {
            System.out.println("Deposit Succesful");
            transaction("Deposit",amt,0);
        }
    }

    public void withdraw(double amt) {
        double fees;
        if (grantWithdrawalStrategy.checkAvailableBalance(this.balance, amt) && grantWithdrawalStrategy.checkTimesWithdrawnInMonth(this.numberofW)) {
            System.out.println(getApplyFeesStrategy().checkBalance(this.balance,amt) + "----" +  getApplyFeesStrategy().checkTimesWithdrawnPerMonth(this.numberofW));
            fees = getApplyFeesStrategy().checkBalance(this.balance,amt) + getApplyFeesStrategy().checkTimesWithdrawnPerMonth(this.numberofW);
            transaction("Withdraw",amt,fees);
            this.numberofW++;
        } else {
            transaction("WithDraw Not Possible",amt,0);
        }
    }


}
