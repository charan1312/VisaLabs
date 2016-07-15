package com.visalab.day.six;

/**
 * Created by caware on 7/14/2016.
 */
public class SecurityCamera implements Photographer{
    @Override
    public void prepareScene() {
        System.out.println("Security Camera at Oval office");
    }

    @Override
    public String takePhotoGraph() {
        return "Picture depicting everything Under Control";
    }
}
