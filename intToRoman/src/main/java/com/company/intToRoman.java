package com.company;

import java.util.Scanner;

public class intToRoman {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter your desired number to convert to Roman, num = ");

        int num = Integer.parseInt(myScanner.nextLine());
        String result = intToRoman(num);
        System.out.println("Your desired Integer of " + num + " is converted to " + result);

    }
        public static String intToRoman(int num){
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
            String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
            StringBuilder returnVal = new StringBuilder();

            for (int i=0; i < values.length; i++){
                while (num >= values[i]){
                    returnVal.append(romans[i]);
                    num -= values[i];
                }
            }

            return returnVal.toString();
        }


}
