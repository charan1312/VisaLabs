package com.visalab.day.two;

import java.util.Scanner;

/**
 * Created by CAWARE on 7/6/2016.
 */
public class DataAnalysis {

    public static void main(String args[]) {

        int totalItems;
        double mean = 0.0 , largest = 0, smallest = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Data Items:");
        totalItems = Integer.parseInt(sc.nextLine());
        if (totalItems > 0) {
            double[] itemArray = new double[totalItems];
            for (int i = 0; i < totalItems; i++) {
                System.out.println("Enter the Data Item " + (i + 1) + ":");
                itemArray[i] = Double.parseDouble(sc.nextLine());
                if (i == 0) {
                    largest = itemArray[i];
                    smallest = itemArray[i];
                }
                mean += itemArray[i];
                largest = (largest > itemArray[i]) ? largest : itemArray[i];
                smallest = (smallest < itemArray[i]) ? smallest : itemArray[i];
            }
            System.out.println("Mean value of the Data Items:" + mean / totalItems);
            System.out.println("Largest of all Data Items:" + largest);
            System.out.println("Smallest of all Data Items:" + smallest);
        }
    }
}
