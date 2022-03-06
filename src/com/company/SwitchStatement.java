package com.company;
import java.util.Scanner;
public class SwitchStatement {

    public static void main(String[] args) {
        //Switch statement
        //1 = monday , 2= tuesday , 3 = wed-sund

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the values.....");
   int Days = sc.nextByte();
   switch (Days){
       case 1:
           System.out.println("Monday");
           break;
       case 2:
           System.out.println("Tuesday");
           break;
       default:
           System.out.println("Wed-Sunday");

   }

    }
}
