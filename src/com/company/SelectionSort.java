package com.company;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length; i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    j=minIndex;
                }
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}