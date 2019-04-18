package com.company;

import java.util.Scanner;

public class BubblyTea {

    public void bottles() {
        int beverageNum = 99;                       //
        String word = "bottles";                    //
        String opt = "";                            //
        Scanner scanner = new Scanner(System.in);   //

        if (beverageNum == 1) {
            word = "bottle"; // singular, as in ONE bottle.
        }

        System.out.println(beverageNum + " " + word + " of bubble tea on the wall.");
        System.out.println(beverageNum + " " + word + " of bubble tea.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");

        System.out.print("Continue? ");
        opt = scanner.nextLine().toLowerCase();

        //while loop to continue song flow
        while((!opt.equals("n")) && (beverageNum != 0)){

            beverageNum = beverageNum - 1;

            System.out.println(beverageNum + " " + word + " of bubble tea on the wall");
            System.out.println(beverageNum + " " + word + " of bubble tea on the wall");
            System.out.println(beverageNum + " " + word + " of bubble tea.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            System.out.println("Continue? ");
            opt = scanner.nextLine().toLowerCase();


        } // end of while loop

        System.out.println("No more bottles of bubble tea on the wall");

    } // end of bottles()

}// end of BubblyTea {}
