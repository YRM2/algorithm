package com.xy.algorithm.xiaoyu;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    public void insertSort(int[] ar){
        // 数组长度N
        int N = ar.length;
        for (int i = 1; i < N; i++){
            for (int j = i; j > 0 && ar[j-1] > ar[j]; j--){
                int tmp = ar[j-1];
                ar[j-1] = ar[j];
                ar[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int testTime = 500000;
        int maxSize = 5;
        int maxValue = 50;
        for (int i = 0; i < testTime; i++){
            int[] arr = genRandomArray(maxSize, maxValue);
            int arr1[] = Arrays.copyOf(arr, arr.length);
            int arr2[] = Arrays.copyOf(arr, arr.length);
            Arrays.sort(arr1);
            insertSort.insertSort(arr2);
            if(!Arrays.equals(arr1, arr2)){
                System.out.println("The 算法 is failed!");
                insertSort.systemOut(arr);
                break;
            }
        }
        System.out.println("hahaha , Ok");
    }

    public void systemOut(int[] ar){
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
    }

    /**
     * 生产随机长度，
     * @param maxSize
     * @param maxValue
     * @return
     */
    public static int[] genRandomArray(int maxSize, int maxValue){
        //
//        Math.random() 等概率生成【0,1）范围内数
//        Math.random() * N 等概率生成【0, N) 范围内数
//        (int)(Math.random() * N) 等概率生成【0, N-1] 范围内数
        int[] arr = new int[(int)(Math.random() * (maxSize + 1))];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * (maxValue + 1)) - (int)(Math.random() * maxValue);
        }
        return arr;
    }
}
