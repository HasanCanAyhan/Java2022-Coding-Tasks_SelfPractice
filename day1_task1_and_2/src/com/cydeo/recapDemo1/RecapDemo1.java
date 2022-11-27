package com.cydeo.recapDemo1;

public class RecapDemo1 {

    public static void main(String[] args) {

        int num1 = 266;
        int num2 = 25;
        int num3 = 26;
        int greatest = num1;

        if (greatest < num2) {
            greatest = num2;
        }

        if (greatest < num3) {
            greatest = num3;
        }

        System.out.println("The greatest number is  = " + greatest);



    }

}
