package com.company;

public class Exceptionhanddling {

    public static void main(String[] args) {
        //Try-catch in exception handling

        int[] marks = {97,23,56};
        try {
            System.out.println(marks[5]);
        }catch (Exception exception) {
            //do something  after catch
        }
        System.out.println("The name is vardhmaan");
    }
}
