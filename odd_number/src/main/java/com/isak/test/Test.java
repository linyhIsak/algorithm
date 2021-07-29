package com.isak.test;

/**
 * 问题描述：在一个正整型数组里面，有一个数出现了奇数次，其它数都出现了偶数次，求这个出现了奇数次的值(数组里面不包含0)
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 3, 7, 9, 6, 5, 11, 9, 5, 11, 6};
        int result = 0;
        for (int i : arr) {
            result = result ^ i;
        }
        System.out.println(result);

        // 求i和j的中间数  int的范围为-(2^31)~(2^31-1) --->  -2147483648~2147483647
        System.out.println(getMidle1(2147483600,2147483647));
        System.out.println(getMidle2(2147483600,2147483647));
        System.out.println(getMidle3(2147483600,2147483647));

    }

    // 方法一   该方法在数据较大的时候容易出错
    private static int getMidle1(int a, int b) {
        return (a + b) / 2;
    }

    // 方法二    该方法不会出错，但是效率没有方法三快
    private static int getMidle2(int a, int b) {
        return a + (b - a) / 2;
    }

    // 方法三    安全快速
    private static int getMidle3(int a, int b) {
        return a + ((b - a) >> 1);
    }
}
