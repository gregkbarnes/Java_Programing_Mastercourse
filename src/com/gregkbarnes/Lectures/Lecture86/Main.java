package com.gregkbarnes.Lectures.Lecture86;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
	  int[] myArray = {1,2,3,4,5,6,7,8,9,10};
	  reverseArray(myArray);
  }
  public static void reverseArray(int[] array) {
    System.out.println("Original Array: " + Arrays.toString(array));
    int[] reversedArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      reversedArray[array.length-1-i] = array[i];
    }
    System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
  }
}
