package com.xy.algorithm.xiaoyu;

/**
 * 一个数组中有一个数出现了K次，其他数都出现了M次， M>1, K < M ,找到出现了K次的数
 */
public class FindKNumFromMNum {

    public int findKNumFromMNum(int[] arr, int m) {
        int[] tmpArr = new int[32];
        for (int num : arr){
            for (int i = 0; i < 32; i++){
                if (((num >> i) & 1) != 0 ){
                    tmpArr[i] += 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++){
            if ((tmpArr[i] % m) != 0 ){
                result |= (1<<i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,4,4,4,4,5,5,5,5,2,2};
        FindKNumFromMNum findKNumFromMNum = new FindKNumFromMNum();
        int result = findKNumFromMNum.findKNumFromMNum(arr, 4);
        System.out.println(result);

        System.out.println(4%4);
    }
}
