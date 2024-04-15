package SdetPro;

import java.util.Arrays;
import java.util.Scanner;

public class LAB_03 {
    public static void main(String[] args) {
/*
Lab 3.1:
Count how many odd, even number(s) in an integer array
int[] intArr = {1, 2, 3, 4, 5};
Even numders: 2
Odd numbers: 3

Lab 3.2:
Finding maximum value/minimum value from an integer array
int[] intArr = {1, 2, 3, 4, 5};
Minimum: 1
Maximum: 5

Lab 3.3:
Sort an integer array from min to max
Input: {12, 34, 1, 16, 28}
Expected output: {1, 12, 16, 28, 34}

Lab 3.4(optional):
Merge 2 SORTED integer array into one SORTED array
Array 01: {1, 12, 16, 28, 34}
Array 02: {1, 13, 16, 27, 99}
Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
*/
        //Lab 3.1
        System.out.println("Lab 3.1");
        int[] intArr1 = {1, 2, 3, 4, 5};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : intArr1) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("-------------------------------------");


        //Lab 3.2
        System.out.println("Lab 3.2");
        int[] intArr2 = {1, 2, 3, 4, 5};

        // Initializing max and min with the first element of the array
        int max = intArr2[0];
        int min = intArr2[0];

        // Iterating through the array to find the maximum and minimum values
        for (int i = 1; i < intArr2.length; i++) {
            if (intArr2[i] > max) {
                max = intArr2[i];
            }
            if (intArr2[i] < min) {
                min = intArr2[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("-------------------------------------");


        //Lab 3.3
        System.out.println("Lab 3.3");
        int[] arr = {3, 1, 4, 1, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------");


        //Lab 3.4
        System.out.println("Lab 3.4");
        int[] arr1 = {1, 12, 16, 28, 34};
        int[] arr2 = {1, 13, 16, 27, 99};

        // Merging the arrays
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Printing the merged sorted array
        System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
        System.out.println("-------------------------------------");

    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1[], if any
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2[], if any
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
