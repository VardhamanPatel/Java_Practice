package com.company;
import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

       /* boolean isSunup = true;
        if(isSunup == false)
            System.out.println("Day");
        else
            System.out.println("Night"); */

       Scanner Age = new Scanner(System.in);
        System.out.println("Enter your age....");
       int FinalAge = Age.nextInt();
       if(FinalAge >= 18)
           System.out.println("You can vote");
       else
           System.out.println("You are not eligibale to vote");


    }
}
