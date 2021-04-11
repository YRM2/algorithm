package com.xy.algorithm.xiaoyu;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public void bubbleSort(int[] arr){
        //数组长度N
        int N = arr.length;
        for (int i = N-1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        bubbleSort.systemOut(arr);
    }

    public void systemOut(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
