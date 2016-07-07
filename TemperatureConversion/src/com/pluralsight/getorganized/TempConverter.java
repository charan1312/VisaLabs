package com.pluralsight.getorganized;
import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double f = Double.parseDouble(sc.nextLine());
        double c = 5*(f-32)/9;
        System.out.println("Temperature in celsius:" +c);
        sc.close();

    }
}
