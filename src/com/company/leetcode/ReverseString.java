package com.company.leetcode;


public class ReverseString {

    public static void main(String[] args) {

        String s = "hello";
        char[] chars = s.toCharArray();

        int lo = 0;
        int hi = chars.length - 1;

        while (lo < hi) {
            char tmp = chars[hi];
            chars[hi] = chars[lo];
            chars[lo] = tmp;

            lo ++;
            hi --;
        }

    }
}
