package com.visalab.day.five;

import java.util.Scanner;

public class Main {

    public enum Months{
        January,        February,        March,        April,        May,
        June,           July,           August,        September,    October,
        November,       December;
    }

    public static int[] daysInMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

    public static class BadMonth extends Exception  {
        public BadMonth(String msg) {
            System.out.println("Exception occured with message:" + msg);
        }
        public BadMonth(Throwable cause) {
            super(cause);
        }

        public BadMonth(String msg,Throwable cause) {
            super(msg,cause);
        }

    }

    public static class BadDay extends Exception {

        public BadDay(String msg) {
            System.out.println("BadDay Exception:" + msg);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mnth = null;
        int dys = 0;
        do {
            try {
                System.out.println("Enter a Month:");
                mnth = sc.nextLine();
                System.out.println("Enter days:");
                dys = Integer.parseInt(sc.nextLine());
                testMonth(mnth, dys);
            } catch(BadMonth bme) {
                System.out.println(bme.getMessage());
            } catch (BadDay bde) {
                System.out.println(bde.getMessage());
            }

        } while(!mnth.equalsIgnoreCase("Quit"));

    }

    public static void testMonth(String msg, int  num) throws BadMonth, BadDay {
        //`try {
            try {
                //System.out.println("The entered Month is:" + Months.valueOf(msg));
                int daysIndex = Months.valueOf(msg).ordinal();
                //System.out.println(daysIndex +"----" + daysInMonth[daysIndex]);
                if(num != daysInMonth[daysIndex]) {
                    //`try {
                        throw new BadDay("The Entered Integer is not the number of days in the Entered Month String");
                    //`} catch (BadDay badDay) {
                    //`    badDay.printStackTrace();
                    //'}
                }
                System.out.println("Valid Combination");
            } catch (IllegalArgumentException iae) {
                //throw new BadMonth("Entered String is Not PResent in the Enum");
                throw new BadMonth("Exception thrown by BadMonth\n",iae);
            }
        //`} catch(BadMonth be) {
        //`    System.out.println(be);
        //`}
    }
}
