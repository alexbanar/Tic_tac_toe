package edu.alex.java;

/**
 * Created by Alex on 27-Jan-17.
 */
import java.util.Scanner;

public class IO {
    static Scanner scan = new Scanner(System.in);
    /**
     * This method prints an array of integers
     * @param arr an integer array that we want to print
     */
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
    }
    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            print(arr[i]);
        }
    }

    static void print(String string){
        System.out.println(string);
    }

    static void print(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4s", arr[i]);
        }
        System.out.println();
    }
    static void print(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            print(arr[i]);
        }
    }

    static void printBoard(String[] arr){
        System.out.printf("|");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4s|", arr[i]);
        }
        System.out.printf("\n________________\n");
    }
    static void printBoard(String[][] arr){
        System.out.printf("\n________________\n");
        for (int i = 0; i < arr.length; i++) {
            printBoard(arr[i]);
        }
    }

    static int getInt(String prompt){
        System.out.println(prompt);
        int n = scan.nextInt(); //alt + Enter here...
        return n;
    }

    static String getString(String prompt){
        System.out.println(prompt);
        return scan.next();
    }

    static int[] getIntArray(String prompt){
        //ask the user for the size:
        int n = getInt("Enter the array size");
        //init an array of the requested size:
        int[] result = new int[n];
        //loop through the array and fill it:
        for (int i = 0; i < n; i++) {
            result[i] = getInt(prompt);
        }
        return result;
    }

    static int getInt(String prompt, int from, int to){
//        boolean isValid = false;
//        int result = 0;
//        while(!isValid){
//             result = getInt(prompt);
//             if (result >= from && result <= to){
//                 isValid = true;
//             }
//        }
//
//        return result;

        int result;

        do {
            result = getInt(prompt);
        }
        while((result < from) || (result > to));

        return result;

    }
}