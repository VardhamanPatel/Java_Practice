package com.company;
import java.util.Scanner;
public class loooops {

    public static void main(String[] args) {
        //Loops
        //print n numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values..");
        int Numb = sc.nextInt();

        //for loop********************************************
     /*   for(int i = 1; i <= Numb; i++){
            System.out.println(i);
        }*/

        //while loop********************************************
  /*      int i = 1;
        while(i <= Numb){
            System.out.println(i);
            i = i + 1;
        } */

        //do while loop*****************************************
        int i = 1;
        do {
            System.out.println(i);
            i = i + 1;
        }while(i<=Numb);


    }


}
