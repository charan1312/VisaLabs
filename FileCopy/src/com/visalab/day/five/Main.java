package com.visalab.day.five;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;


public class Main {


    public static void main(String[] args){
	// write your code here
        File source = null;
        File dest = null;
        FileInputStream input = null;
        FileOutputStream output = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first file name:");
        String file1 = sc.nextLine();
        System.out.println("Enter the second file name:");
        String file2 = sc.nextLine();
        source = new File(file1);
        dest = new File(file2);

        boolean dflag = true;
        boolean sflag= true;

        do {
            try {
                if (!sflag) {
                    System.out.println("Source File Not present.Re-Enter the first file name:");
                    source = new File(sc.nextLine());
                }
                input = new FileInputStream(source);
                sflag = true;
            } catch (FileNotFoundException fnfe) {
                sflag = false;
            }
        } while(!sflag);

        do {
            try{
                if(!dflag) {
                    System.out.println("Destination file not present. Re-Enter the second file name:");
                    dest = new File(sc.nextLine());
                }
                output = new FileOutputStream(dest);

                byte[] buf = new byte[1024];
                int bytesRead;
                while ((bytesRead = input.read(buf)) > 0) {
                    output.write(buf, 0, bytesRead);
                }
                System.out.println("Copied");
                dflag = true;
            } catch (FileNotFoundException fnfe) {
                dflag = false;
            } catch (IOException e) {
                dflag = false;
            }
        } while(!dflag);
    }
}