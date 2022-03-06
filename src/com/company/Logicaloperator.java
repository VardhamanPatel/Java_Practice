package com.company;
import java.util.Scanner;
public class Logicaloperator {

    public static void main(String[] args) {
        //logical operator
        //&& operator ********************************
/*
        int a = 60;
        int b = 40;
        if(a < 50 && b < 50)
            System.out.println("Value is less than 50");
        else
            System.out.println("value is greater than 50");
        */
        // || logical or
/*
        int a = 60;
        int b = 40;
        if(a < 50 || b < 50)
            System.out.println("Atleast one is less than 50");
        */
        // pen= 10 , eraser =50
        Scanner price = new Scanner(System.in);
        System.out.println("Please Enter the amount ");
        int cash = price.nextInt();
        if (cash < 10) {
            System.out.println("you can not buy anaything");
            System.out.println("Please bring the cash");
        }
        else if(cash > 10 && cash <50) {
            System.out.println("you can buy only one product");
        }
        else
            System.out.println("you cam buy both the products");

        }


    }

