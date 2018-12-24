package com.dzc.learn.spi;


/**
 * 用这种标号 label 的形式; 可以方便的退出几重循环； 以前竟然都不知道
 */
public class TestLabel {

    public static void main(String[] args) {

//        for (int k = 1; k <= 10; k++) {
//            // 标号在哪里 就代表跳出哪层 循环
//            LBL_PTS:
//            for (int i = 1; i <= 10; i++) {
//                for (int j = 1; j <= 10; j++) {
//                    System.out.println("i = " + i + ", j = " + j);
//                    if (j == 2) {
//                        break LBL_PTS;
//                    }
//                }
//            }
//        }
//        System.out.println("done");


//        for (int k = 1; k <= 10; k++) {
            // 标号在哪里 就代表跳出哪层 循环
            LBL_PTS:
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    if (j == 2) {
                        continue LBL_PTS;
                    }
                    System.out.println("i = " + i + ", j = " + j);
                }
            }
//        }
        System.out.println("done");
    }
}
