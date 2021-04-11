package com.xy.algorithm.xiaoyu;

public class DichotomySelect {

    public boolean dichotomySelect(int[] arr, int tar){
        int left = 0;
        int right = arr.length - 1;
        int middleIndex;
        while (left < right){
            middleIndex = left + (right - left) / 2;
            if (arr[middleIndex] == tar){
                return true;
            } else if (arr[middleIndex] > tar){
                right = middleIndex - 1;
            } else {
                left = middleIndex + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,7,8,9};
        DichotomySelect dichotomySelect = new DichotomySelect();
        boolean isexist =  dichotomySelect.dichotomySelect(arr, 40);
        System.out.println(isexist);
    }
}
