package com.hxying.java_demos.data_structures_and_algorithms.algorithms.sort;

/*
 * 冒泡排序
 * */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        int temp;
        boolean isChange;
        for (int i = 1; i < arr.length; i++) {
            isChange = false;
            for (int j = 0; j < arr.length - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isChange = true;

                }
            }
            if (!isChange) {
                System.out.println("提前结束");
                break;

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int i : sort(new int[]{0, 1, 2, 3, 4, 22, 33, 5, 56, 34, 13, 99, 13, 79, 35, 0,1,4,3,7, 7})) {
            System.out.println(i);

        }
    }
}
