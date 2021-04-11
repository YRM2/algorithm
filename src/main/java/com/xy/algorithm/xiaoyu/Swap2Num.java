package com.xy.algorithm.xiaoyu;

/**
 * 不用额外变量交换两个数
 */
public class Swap2Num {

    /*
    异或运算： 相同为0，不同为1（位运算）
    即：0^N = N ，  N^N = 0  (10进制显示)
     */
    public void swap(int[] arr, int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    public static void main(String[] args) {
        Swap2Num swap2Num = new Swap2Num();
        int[] arr = {2,4};

        System.out.println(arr[0]+ " " + arr[1]);
        swap2Num.swap(arr, 0 , 1);
        System.out.println(arr[0]+ " " + arr[1]);
    }
}
