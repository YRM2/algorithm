package com.xy.algorithm.xiaobai;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SelectSort {

    public static void selectSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }

        for (int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr,int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 23, 23, 1, 212,1344};
        printArr(arr);
        selectSort(arr);
        printArr(arr);
    }
}
