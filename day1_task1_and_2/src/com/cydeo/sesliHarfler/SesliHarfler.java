package com.cydeo.sesliHarfler;

public class SesliHarfler {

    public static void main(String[] args) {

        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf + " Kalın sesli harf");
                break;
            default:
                System.out.println(harf + " İnce sesli harf");

        }

    }

}
