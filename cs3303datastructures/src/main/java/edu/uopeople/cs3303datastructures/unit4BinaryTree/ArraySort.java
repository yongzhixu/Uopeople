package edu.uopeople.cs3303datastructures.unit4BinaryTree;

// Optimized java implementation
// of Bubble sort

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.time.Clock;
import java.util.Date;
import java.util.stream.IntStream;

/**
 * @author ：mmzs
 * @date ：Created in 2021/7/12 17:42
 * @description：ArraySort
 * @modified By：
 * @version: 1$
 */
@Slf4j
public class ArraySort {

    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n) {
        long start = System.currentTimeMillis();
        int count = 0;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    count += 4;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        log.info("it takes {} steps and {} miniseconds", count, System.currentTimeMillis() - start);
    }

    // Function to print an array
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int length = 10000000;
        int arr[] = new int[length];
        IntStream.range(1, length).forEach(i -> arr[i]= length-i);
        int n = arr.length;
        bubbleSort(arr, n);
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }


// This code is contributed
// by Nikita Tiwari.

}
