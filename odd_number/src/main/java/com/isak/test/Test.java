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
    }
}
