package com.cydeo.switchDemo;

public class SwitchDemo {

    public static void main(String[] args) {

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("very good : passed!");
                break;
            case 'B':
            case 'C':
                System.out.println("good : passed!");
                break;
            case 'D':
                System.out.println("not bad : passed!");
                break;
            case 'F':
                System.out.println("sorry : not passed!");
                break;
            default:
                System.out.println("Value is not valid.Try again pls!");

        }

    }

}
