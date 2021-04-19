package com.xy.algorithm.xiaoyu;

public class Right1 {

    public void findRight1(int i){
        int result = i & (-i);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Right1 right1 = new Right1();
        System.out.println(Integer.bitCount(12));
        System.out.println(Integer.highestOneBit(12));
        System.out.println(Integer.lowestOneBit(12));
        right1.findRight1(12);
    }
}

