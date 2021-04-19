package com.xy.algorithm.xiaoyu;

public class Find2OddNumber {

    public int[] find2OddNumber(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++){
            tmp ^= arr[i];
        }
        // 此时tmp即两个奇数异或后结果

        // 取到最右侧1对应数值
        int right1 = tmp & (-tmp);
        int firstOddNumber = 0;

        for (int i = 0; i < arr.length; i++){
            if ((arr[i] & right1) != 0){
                firstOddNumber ^= arr[i];
            }
        }
        int secondOddNumber = tmp ^ firstOddNumber;

        return new int[] {firstOddNumber, secondOddNumber};
    }

    public static void main(String[] args) {
        Find2OddNumber find2OddNumber = new Find2OddNumber();
        int[] arr = {4,4,4,4,2,2,2,2,1,3,3,3};
        int[] resultArr = find2OddNumber.find2OddNumber(arr);
        System.out.println(resultArr[0] + "   " +resultArr[1]);
    }
}
