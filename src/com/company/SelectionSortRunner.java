package com.company;

public class SelectionSortRunner {
        public static void main(String[] args)
        {
            int[] testArr={8,6,7,5,3,0,9,10,1,2,3};
            System.out.print("Before:");
            for(int num:testArr)
                System.out.print(num+"");
            System.out.println();
            SelectionSort.selectionSort(testArr);
            System.out.print("After:");
            for(int num:testArr)
                System.out.print(num+"");
            System.out.println();
        }
    }
