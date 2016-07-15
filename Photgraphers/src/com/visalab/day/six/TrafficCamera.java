package com.visalab.day.six;

/**
 * Created by caware on 7/14/2016.
 */
public class TrafficCamera implements Photographer{
    @Override
    public void prepareScene() {
        System.out.println("Traffic Pictures from Rural Road & university Drive");
    }

    @Override
    public String takePhotoGraph() {
        return "Thats a picture taken at a peak traffic time";
    }
}
