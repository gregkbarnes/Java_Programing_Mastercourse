package com.gregkbarnes.Lectures.Lecture80;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] intArray = getIntegers(5);

    int[] sortedArray = sortIntegers(intArray);
    printArray(sortedArray);
  }

  public static int[] getIntegers(int numIntegers) {
    int[] ints = new int[numIntegers];

    System.out.println("Please type " + numIntegers + " integers:\r");

    for (int i=0; i < numIntegers; i++) {
      ints[i] = scanner.nextInt();
    }

    return ints;
  }

  public static void printArray(int[] ints) {
    for (int i=0; i < ints.length; i++) {
      System.out.println("Element " + i + " = " + ints[i]);
    }
  }

  public static int[] sortIntegers(int[] ints) {
    int tempInt;
    int[] sortedArray = new int[ints.length];
    boolean isSorted = false;

//    for (int i = 0; i < ints.length; i++) {
//      sortedArray[i] = ints[i];
//    }
    sortedArray = Arrays.copyOf(ints,ints.length);

    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i+1]) {

          tempInt = sortedArray[i];
          sortedArray[i] = sortedArray[i+1];
          sortedArray[i+1] = tempInt;
          isSorted = false;
        }
      }
    }


    return sortedArray;
  }
}


