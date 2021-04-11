package com.xy.algorithm.xiaoyu;

public class LocalMinimum {

    public int find(int[] arr, int tag) {
        if (arr == null) {
            return -1;
        }
        if (arr[0] < arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }
        int L = 0;
        int R = arr.length - 1;
        int minddle = 0;
        while (L < R) {
            minddle = L + (R - L) / 2;
            if (arr[minddle] > arr[minddle + 1]) {
                L = minddle + 1;
            } else if (arr[minddle] < arr[minddle + 1]){
                R = minddle;
            }else {
                return arr[minddle];
            }
        }
        return arr[L];
    }

    public static void main(String[] args) {
        LocalMinimum localMinimum = new LocalMinimum();
        int[] arr = {3,2 ,2, 1, 4};
        int a = localMinimum.find(arr, 2);
        System.out.println(a);


    }
}
