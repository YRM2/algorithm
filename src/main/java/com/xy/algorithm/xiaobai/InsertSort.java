package com.xy.algorithm.xiaobai;

public class InsertSort {

    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--){
                swap(arr, j, j-1);
            }
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
        insertSort(arr);
        printArr(arr);
    }
}
