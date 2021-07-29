package edu.uopeople.cs3303datastructures.UNIT6InternalSorting;


import java.util.ArrayList;
import java.util.Random;

public class QuickSortAlgorithm {
    private int arr[];
    public static int c = 0;

    public void sort(int[] inArr) {

        if (inArr == null || inArr.length == 0) {
            return;
        }
        this.arr = inArr;
        qSort(0, arr.length - 1);
    }

    private void qSort(int low, int high) {
//        check the range
        if (low < high) {
//            find the right position for the chosen pivot
            int pi = partition(low, high);
//            quick sort the fist half
            qSort(low, pi - 1);
//            quick sort the second half
            qSort(pi + 1, high);
        }
    }

    private int partition(int init, int end) {

//        the chosen pivot, last element of the array
        int pivot = arr[end];
//        the found index right before the position of pivot
        int i = init - 1;

        for (int k = init; k < end; k++) {
            if (arr[k] < pivot) {
//                move the found index to the next one, and set the element smaller than pivot in position 'i'
                i++;
                exchElements(i, k);
            }
        }
        exchElements(i + 1, end);
        return i + 1;

    }

    // function to swap the two values
    private void exchElements(int b, int t) {
        // Increment exchange count when values are not equal & exchange values
        if (b != t) {
            System.out.println(" Exch values:  " + arr[b] + " and " + arr[t]);
            c++;
            int temp = arr[b];
            arr[b] = arr[t];
            arr[t] = temp;
        }
    }

    public static void main(String a[]) {
        QuickSortAlgorithm sorter = new QuickSortAlgorithm();
        // Unsorted Input
        int[] input = {12, 9, 4, 99, 120, 1, 3, 10, 23, 45, 75, 69, 31, 88, 101, 14, 29, 91, 2, 0, 77};
        // Sorted Inut
//         int[ ] input = {0,1,2,3,4,9,10,12,14,23,29,31,45,69,75,77,88,91,99,101,120};
        // Reverse Sorted input
//         int[ ] input = {120,101,99,91,88,77,75,69,45,31,29,23,14,12,10,9,4,3,2,1,0};


//       random input with 10000 elements
        int n =100000;
        input= new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = (int) (Math.random() * n);
        }

        System.out.println("\n>> Quick Sort Input <<");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println("\n");
        // Sort Input file
        sorter.sort(input);
        // Display sorted results
        System.out.println("\n\n>> Quick Sort Sorted output <<");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println("\n\n Value Exchange occurred " + c + " times");
    }
}

