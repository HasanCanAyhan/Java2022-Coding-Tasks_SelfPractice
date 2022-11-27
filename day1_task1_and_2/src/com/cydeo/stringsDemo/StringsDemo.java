package com.cydeo.stringsDemo;

public class StringsDemo {

    public static void main(String[] args) {

        String msg = "Today the weather is so lovely";
        System.out.println(msg);

        /*
         * System.out.println("Number Of Element : " + msg.length());
         * System.out.println("5. Element : " + msg.charAt(4));
         *
         * System.out.println(msg.concat(" Yaşasın!"));
         *
         * System.out.println(msg.startsWith("B"));
         *
         * System.out.println(msg.endsWith("."));
         *
         * char[] karakterler= new char[5];
         * msg.getChars(0, 5, karakterler, 0);
         * System.out.println(karakterler);
         *
         * System.out.println(msg.indexOf("av"));
         * System.out.println(msg.lastIndexOf("a"));
         */

        String yeniMesaj = msg.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(msg.substring(2, 5));

        for (String word : msg.split(" ")) {
            System.out.println(word);
        }

        System.out.println("-----------------------");
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());
    }

}
