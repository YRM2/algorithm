package com.xy.algorithm.xiaoyu;

public class SelectSort {

    public void selectSort(int[] arr){
        // 数组长度N
        int N = arr.length;
        for (int i =0; i < N -1; i++){
            int minIndex = i;
            for (int j = minIndex; j < N - 1; j++){
                if(arr[minIndex] > arr[j+1]){
                    minIndex = j+1;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3, 5, 4, 2};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(arr);
        selectSort.systemOut(arr);
    }

    public void systemOut(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
