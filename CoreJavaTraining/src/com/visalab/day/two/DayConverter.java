package com.visalab.day.two;

import java.util.Scanner;

/**
 * Created by CAWARE on 7/6/2016.
 */
public class DayConverter {
    public static void main(String[] args) {
        int day, month, initmonth, year;
        boolean timeToQuit;
        Scanner sc = new Scanner(System.in);
        timeToQuit = false;
        while(!timeToQuit) {
            System.out.println("Enter the Day(D/DD):");
            String line=sc.nextLine();
            timeToQuit = line.equalsIgnoreCase("quit");
            if (!timeToQuit) {
                day = Integer.parseInt(line);

                //sc.nextLine();
                System.out.println("Enter the Month(M/MM):");
                month = Integer.parseInt(sc.nextLine());
                initmonth = month;
                //sc.nextLine();
                System.out.println("Enter the Year(YYYY):");
                year = Integer.parseInt(sc.nextLine());

                //sc.nextLine();
                if (month == 1 || month == 2) {
                    month += 12;
                    year -= 1;
                }

                int a = (26 * (month + 1)) / 10;
                int b = year / 4;
                int c = 6 * (int) (year / 100);
                //System.out.println("The c is :" + c);
                //int c1 = 6 * (year / 100);
                //System.out.println("The c1 is :" + c1);
                int d = year / 400;

                int res = (a + b + c + d + day + year) % 7;

                String resString;

                switch (res) {
                    case 0:
                        resString = "Saturday";
                        break;
                    case 1:
                        resString = "Sunday";
                        break;
                    case 2:
                        resString = "Monday";
                        break;
                    case 3:
                        resString = "Tuesday";
                        break;
                    case 4:
                        resString = "Wednesday";
                        break;
                    case 5:
                        resString = "Thursday";
                        break;
                    case 6:
                        resString = "Friday";
                        break;
                    default:
                        resString = "Error";
                        break;
                }

                System.out.println("The day of the date " + day + "-" + initmonth + "-"+ year +  " is :" + resString);
            } else {
                //System.out.println("Bye bye!!");
            }
        }
    }
}
