package com.xy.algorithm.xiaoyu;

public class FindOddNumber {

    public int findOddNumber(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++){
            tmp ^= arr[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        FindOddNumber findOddNumber = new FindOddNumber();
        int[] arr = {4, 4, 4, 3, 3, 3, 3, 4, 2, 2, 2, 1,1,2, 3};
        int a = findOddNumber.findOddNumber(arr);
        System.out.println(a);
    }
}
