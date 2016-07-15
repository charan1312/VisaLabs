package com.visalab.day.six;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Photographer[] cameras = new Photographer[3];
        cameras[0] = new PersonalCamera();
        cameras[1] = new TrafficCamera();
        cameras[2] = new SecurityCamera();


        for (int i = 0; i < cameras.length; i++) {
            cameras[i].prepareScene();
            System.out.println(cameras[i].takePhotoGraph());
            System.out.println();
        }
    }
}
