package com.company;

import java.util.Scanner;
import java.util.TreeMap;

public class intToRoman {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter your desired number to convert to Roman, num = ");

        int num = Integer.parseInt(myScanner.nextLine());
        String resultByArray = intToRomanArray(num);
        String resultByTreeMap = intToRomanTreeMap(num);
        System.out.println("Using the Array Method, the Integer " +  num + " is converted to " + resultByArray + " .");
        System.out.println("Using the TreeMap Method, the Integer " + num + " is converted to " + resultByArray + " .");

    }
    public static String intToRomanArray(int num){
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

    public static String intToRomanTreeMap(int num) {
        TreeMap<Integer, String> romans = new TreeMap<>();
        romans.put(1000, "M");
        romans.put(900, "CM");
        romans.put(500, "D");
        romans.put(400, "CD");
        romans.put(100, "C");
        romans.put(90, "XC");
        romans.put(50, "L");
        romans.put(40, "XL");
        romans.put(10, "X");
        romans.put(9, "IX");
        romans.put(5, "V");
        romans.put(4, "IV");
        romans.put(1, "I");

        StringBuilder returnVal = new StringBuilder();

        while (num!=0){
            int current = romans.floorKey(num);
            returnVal.append(romans.get(current));
            num -= current;
        }
        return returnVal.toString();
    }
}
