package com.xy.algorithm.xiaoyu;

/**
 * 求小和
 *
 * 说明；利用归并排序实现
 */
public class SmallSum {

    public int smallSum(int[] arr){
        if (arr == null || arr.length < 2){
            return 0;
        }
        return process(arr, 0 , arr.length - 1);
    }

    private int process(int[] arr, int l, int r){
        if (l == r){
            return 0;
        }
        int mid = l + ((r - l) >> 1);
        return process(arr, l, mid)
                + process(arr, mid + 1, r)
                + mergerArr(arr, l, mid, r);
    }

    private int mergerArr(int[] arr, int l, int mid, int r){
        int result = 0;
        int[] tmpArr = new int[arr.length];
        int l_p = l;
        int r_p = mid + 1;
        int i = 0;
        while (l_p <= mid && r_p <= r){
            result += arr[l_p] < arr[r_p] ? (arr[l_p] * (r - r_p + 1)) : 0;
            tmpArr[i++] = arr[l_p] < arr[r_p] ? arr[l_p++] : arr[r_p++];
        }
        while (l_p <= mid){
            tmpArr[i++] = arr[l_p++];
        }
        while (r_p <= r){
            tmpArr[i++] = arr[r_p++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        SmallSum smallSum = new SmallSum();
        System.out.println(smallSum.smallSum(arr));
    }
}
