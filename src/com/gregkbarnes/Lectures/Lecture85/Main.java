package com.gregkbarnes.Lectures.Lecture85;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter count:");
        int numInts = sc.nextInt();
        sc.nextLine();

        int[] myArray = readIntegers(numInts);
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("min is : " + findMin(myArray));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        System.out.print("Enter " + count + " ints:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                min = array[i];
            }
        }
        return min;
    }
}
