package com.hxying.java_demos.data_structures_and_algorithms.algorithms.sort;

/*
* 冒泡排序
* */
public class SelectionSort {
    public static int[] sort(int[] arr){
        int temp;
        int pos;
        for (int i = 0; i < arr.length-1; i++) {
            pos = 0 ;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[pos]){
                     pos = j;
                }
            }
            temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[pos];
            arr[pos] = temp;


        }
        return arr;
    }

    public static void main(String[] args) {
        for (int i : sort(new int[]{22, 33, 4, 5, 1, 56, 34, 13, 99, 0, 2, 6, 13, 79, 35, 3, 7, 2, 7})) {
            System.out.println(i);

        }
    }
}
