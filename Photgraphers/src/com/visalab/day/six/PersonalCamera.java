package com.visalab.day.six;

/**
 * Created by caware on 7/14/2016.
 */
public class PersonalCamera implements  Photographer{

    @Override
    public void prepareScene() {
        System.out.println("Hello people, Stand still and smile");
    }

    @Override
    public String takePhotoGraph() {
        return "That's a nice photograph of the entire family";
    }
}
