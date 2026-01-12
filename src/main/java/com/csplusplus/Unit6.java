package com.csplusplus;

public class Unit6 {

    // 1. Implement a method that takes an array of integers and returns the sum of all elements.
    // Instructions: Use a for-each loop to iterate through the array and calculate the sum.
    public static int sumArray(int[] array) {
        // Handle null arrays by returning 0
        if (array == null) {
            return 0;
        }
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum;
    }

    // 2. Implement a method that finds the maximum element in an array of integers.
    // Instructions: Iterate through the array and track the largest number found.
    public static int maxElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = array[0];
        for (int n : array) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    // 3. Implement a method that takes an array and returns a new array with the elements in reverse order.
    // Instructions: Create a new array of the same size, and fill it with elements from the original array in reverse order.
    public static int[] reverseArray(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int[] rev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rev[i] = array[array.length - 1 - i];
        }
        return rev;
    }

    // 4. Implement a method that checks whether the given array is sorted in ascending order.
    // Instructions: Iterate through the array and check if each element is greater than or equal to the previous element.
    public static boolean isSorted(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // 5. Implement a method that counts how many times a given number appears in the array.
    // Instructions: Use a for-each loop to iterate through the array and count the occurrences of the given number.
    public static int countOccurrences(int[] array, int number) {
        if (array == null) {
            return 0;
        }
        int count = 0;
        for (int n : array) {
            if (n == number) {
                count++;
            }
        }
        return count;
    }
}
