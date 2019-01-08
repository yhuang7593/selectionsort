package com.company;

public class SelectionSort {
    public static void Swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[j] = arr[i];
        arr[j] = t;
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j + 1]) {


                }
            }
        }
    }
}