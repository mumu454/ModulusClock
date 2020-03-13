package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	modulusClock();

    }
    public static void modulusClock(){
        Scanner modulusClock;
        modulusClock = new Scanner(System.in);
        int hours;
        int minutes;
        System.out.println("Enter a value for hours");
          hours = modulusClock.nextInt();
        System.out.println("Enter a value for minutes");
         minutes = modulusClock.nextInt();

        System.out.println(" The time is: " + hours + ":" + minutes);
         hours = minutes >= 60 ? ++hours : hours ;
        hours = hours %12;
        minutes = minutes %60;
        





    }
}

