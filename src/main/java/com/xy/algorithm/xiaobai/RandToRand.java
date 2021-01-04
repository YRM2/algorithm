package com.xy.algorithm.xiaobai;

public class RandToRand {

    public static void main(String[] args) {
        System.out.println("測試開始");
        // Math.random() -> double -> [0,1)      0,1 均匀分布伪随机返回
        double ans = Math.random();


        System.out.println(ans);

        System.out.println("--------------");

        int testTimes = 100000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++){
            if (Math.random() < 0.75){
                count++;
            }
        }
        System.out.println((double) count /(double) testTimes);
        System.out.println((double) count);


        System.out.println("-----------------------------------------------");

        count = 0;
        for (int i = 0; i < testTimes; i++){
            if (Math.random() * 8 < 4){
                count++;
            }
        }
        System.out.println((double)count/(double)testTimes);

        System.out.println("-----------------------------------------------");

        int K = 9;
        int[] counts = new int[9];
        for (int i = 0; i < testTimes; i++){
            int ians = (int)(Math.random() * K);
            counts[ians]++;
        }

        for (int i = 0; i < K; i++){
            System.out.println((i + "这个数出现了 " + counts[i] + "次"));
        }
    }

}
