package com.xy.algorithm.xiaoyu;

/**
 * 查找数组中逆序数的个数
 * 说明：比如{1,3,2,1}，那么逆序数个数为 3-2、3-1、2-1一共3组
 */
public class ReverseOrderNum {

    public int reverseOrderNum(int[] arr){
        if (arr == null || arr.length < 2){
            return 0;
        }
        return process(arr, 0, arr.length - 1);
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

    // {2, 3, 2, 1}
    //  0  1  2  3
    private int mergerArr(int[] arr, int l, int mid, int r){
        int tmpArr[] = new int[r -l + 1];
        int i = tmpArr.length - 1;
        int l_p = mid;
        int r_p = r;
        int sum = 0;
        while (l_p >= l && r_p >= mid + 1){
            sum += arr[l_p] > arr[r_p] ? (r_p - (mid + 1) + 1) * 1 : 0;
            tmpArr[i--] = arr[l_p] > arr[r_p] ? arr[l_p--] : arr[r_p--];
        }
        while (l_p >= l){
            tmpArr[i--] = arr[l_p--];
        }
        while (r_p >= mid + 1){
            tmpArr[i--] = arr[r_p--];

        }
        for (i = 0; i < tmpArr.length; i++) {
            arr[l + i] = tmpArr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2,3, 2, 1};
        ReverseOrderNum reverseOrderNum = new ReverseOrderNum();
        int result = reverseOrderNum.reverseOrderNum(arr);
        System.out.println(result);
    }
}
