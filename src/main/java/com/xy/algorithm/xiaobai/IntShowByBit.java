package com.xy.algorithm.xiaobai;

/**
 * 观察int类型二进制表示，简单理解一下位运算
 */
public class IntShowByBit {

    public static void main(String[] args) {
//        System.out.print("1的二进制表示：");
        int2Bit(1);
//        System.out.print("int类型最大值的二进制表示：");
        int2Bit(Integer.MAX_VALUE);
//        System.out.print("int类型最小值的二进制表示：");
        int2Bit(Integer.MIN_VALUE);
        System.out.println("-----------------------------");
        System.out.println((1<<31) - 1);
        System.out.println(Integer.MAX_VALUE);
    }

    private static void int2Bit(int number){
        for (int i = 31; i > 0; i--){
            System.out.print((number & (1<<i)) == 0 ? 0 : 1);
        }
        System.out.println();
    }
}