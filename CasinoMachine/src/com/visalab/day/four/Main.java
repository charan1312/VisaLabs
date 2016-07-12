package com.visalab.day.four;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public enum MachineState {
        BAR,
        MEDAL,
        COIN,
        TRIPLEBAR,
        CHERRY;
    }


    public static int[] randomNumberGenerator(){
        int[] random = new int[3];
        for(int i = 0 ; i < random.length; i++) {
            random[i] = ThreadLocalRandom.current().nextInt(0,MachineState.values().length);
        }

        return random;
    }


    public static void main(String[] args) {
	// write your code here
        int[] spinValues = randomNumberGenerator();
        for( int i = 0 ; i < spinValues.length ; i++ ){
            System.out.print(MachineState.values()[spinValues[i]]);
            if(i==spinValues.length-1)
                break;
            else
                System.out.print(":");
        }
    }
}
