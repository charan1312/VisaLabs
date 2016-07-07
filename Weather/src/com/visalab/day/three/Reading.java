package com.visalab.day.three;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by CAWARE on 7/7/2016.
 */
public class Reading {

    String dayOfTheWeek;
    int hourOfTheDay;
    int temperature;
    int windSpeed;

    public Reading(String line) {
        //System.out.println("Constructor called");
        String[] elements = line.split(", ");
        //for( i = 0 ; i < elements.length ; i++ ) {
        this.dayOfTheWeek = elements[0];
        this.hourOfTheDay = Integer.valueOf(elements[1]);
        this.temperature = Integer.valueOf(elements[2]);
        this.windSpeed = Integer.valueOf(elements[3]);
        //}
    }

    @Override
    public String toString() {
        return this.dayOfTheWeek + "-" + this.hourOfTheDay + "-" + this.temperature ;
    }

    public static void main(String[] args) throws Throwable {
        //System.out.println("Main called");
        BufferedReader br = Files.newBufferedReader(
                Paths.get("weather.csvx"));
        Reading[] readings = new Reading[12];
        String line;
        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());
        }
        // remaining code here
        for (int i = 0; i < readings.length; i++) {
            //System.out.println(readings[i]);
            System.out.println(readings[i].dayOfTheWeek + " " +readings[i].getTime() + " was " + readings[i].rateTemperature());
        }
    }

    public String rateTemperature() {
        if (this.temperature < 55 )
            return "Cold";
        else if (this.temperature > 55 && this.temperature < 65 )
            return "Mild";
        else if (this.temperature >= 65 && this.temperature < 80 )
            return "Warm";
        else if (this.temperature >=80 )
            return "Hot";
        else
            return "Dont know";
    }

    public String getTime() {
        if ( this.hourOfTheDay == 9 )
            return "Morning";
        if ( this.hourOfTheDay == 15 )
            return "Afternoon";
        if ( this.hourOfTheDay == 21 )
            return "Evening";

        return null;
    }
}


