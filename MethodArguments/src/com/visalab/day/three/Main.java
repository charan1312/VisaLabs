package com.visalab.day.three;

public class Main {

    static String[] smallNumbers = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

/*    public static int addUp(int a,int b) {
        System.out.println("Adding Int");
        return a + b;
    }
    public static double addUp(double a,double b) {
        System.out.println("Adding Double");
        return a + b;
    }
    public static int addUp(String a,String b) {
        System.out.println("Adding String");
        return toNumber(a) + toNumber(b);
    }*/

    public static int addUp(int... intArgs) {
        int sum = 0;
        System.out.println("Adding Int");
        for(int a : intArgs) {
            sum += a;
        }
        return sum;
    }
    public static double addUp(double... doubleArgs) {
        double sum = 0;
        System.out.println("Adding Double");
        for(double a : doubleArgs) {
            sum += a;
        }
        return sum;
    }
    public static int addUp(String... stringArgs ) {
        int sum = 0;
        System.out.println("Adding String");
        for(String a : stringArgs) {
            sum += toNumber(a);
        }
        return sum;
    }

    public static int toNumber(String a) {
        for(int i=0;i<smallNumbers.length;i++) {
            if (a.equalsIgnoreCase(smallNumbers[i]))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(addUp(3.2, 2.2));
        System.out.println(addUp(1, 4));
        System.out.println(addUp("one", "three","four"));
        System.out.println(addUp(2, 3.5, 2, 2, 1));
        //System.out.println(addUp());        -- Zero Args are not compiling

        //System.out.println(addUp(1, "three"));      -- this wont run because we don't have the method defined for it
    }
}
