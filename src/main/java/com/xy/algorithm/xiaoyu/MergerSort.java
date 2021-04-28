package com.xy.algorithm.xiaoyu;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

/**
 * 归并排序
 * 复杂度：O(N*logN)
 */
public class MergerSort {

    public void mergerSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    private void process(int[] arr, int L, int R){
        if (L == R){
            return;
        }
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        mergerArr(arr, L, mid, R);
    }

    private void mergerArr(int[] arr, int L, int mid, int R){
        int[] tmpArr = new int[R - L + 1];
        int L_p = L;
        int R_p = mid + 1;
        int i = 0;
        
        while (L_p <= mid && R_p <= R){
            if (arr[L_p] <= arr[R_p]){
                tmpArr[i++] = arr[L_p++];
            } else {
                tmpArr[i++] = arr[R_p++];
            }
        }

        while (L_p <= mid){
            tmpArr[i++] = arr[L_p++];
        }
        while (R_p <= R){
            tmpArr[i++] = arr[R_p++];
        }

        for (i = 0; i < tmpArr.length; i++){
            arr[L + i] = tmpArr[i];
        }
    }

    public static void main(String[] args) {
       /* MergerSort mergerSort = new MergerSort();
        int[] arr = {3,4,2,1,3,4,3,2,1,4,5,6,7,};
        mergerSort.mergerSort(arr);
        sysOut(arr);*/
        MergerSort mergerSort = new MergerSort();
        int testTime = 100;
        int maxSize = 10;
        int maxValue = 100;
        for (int i = 0; i < testTime; i++){
            int[] arr = genRandomArray(maxSize, maxValue);
            int [] compareArr = new int[arr.length];
            System.arraycopy(arr, 0, compareArr, 0, arr.length);
            mergerSort.mergerSort(arr);
//            Arrays.sort(compareArr);
            mergerSort.mergerSort2(compareArr);
            if (!Arrays.equals(arr, compareArr)){
                System.out.println("排序算法失败了");
                return;
            }
        }
        System.out.println("恭喜,算法OK！");

    }

    private static void sysOut(int[] arr){
        for (int i : arr){
            System.out.print( i + " ");
        }
    }


    private static int[] genRandomArray(int maxSize, int MaxValue){
        // Math.random [0,1)
        // Math.randow() * N  [0,N)
        // (int) (Math.random() * N) [0, N-1]
        int[] arr = new int[(int) (Math.random() * maxSize)];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * MaxValue);
        }
        return arr;
    }


    public void mergerSort2(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        process2(arr, 0, arr.length - 1);
    }

    private void process2(int[] arr, int L, int R){
        if (L == R){
            return;
        }
        int mid = L + ((R - L) >> 1);
        process2(arr, L, mid);
        process2(arr, mid + 1, R);
        mergerArr2(arr, L , mid, R);
    }

    private void mergerArr2(int[] arr, int L, int mid, int R){
        int[] tmpArr = new int[R - L + 1];
        int i = 0;
        int L_p = L;
        int R_p = mid + 1;
        while (L_p <= mid && R_p <= R){
            if (arr[L_p] <= arr[R_p]){
                tmpArr[i++] = arr[L_p++];
            }else {
                tmpArr[i++] = arr[R_p++];
            }
        }
        while (L_p <= mid){
            tmpArr[i++] = arr[L_p++];
        }
        while (R_p <= R){
            tmpArr[i++] = arr[R_p++];
        }

        for (i = 0 ; i < tmpArr.length; i++){
            arr[L + i] = tmpArr[i];
        }
    }
}
