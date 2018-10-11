package com.company.leetcode;

public class TitleToNumber {

    public static int titleToNumber(String s) {
        int len = s.length()-1;

        int ret = 0;
        for (char c : s.toCharArray()) {
            int count = c - 'A' + 1;
            int pow = (int) Math.pow(26, len--);
            ret += pow * count;
        }

        return ret;
    }

    public static void main(String[] args) {

        int ret = titleToNumber("AZ");
        System.out.println(ret);
    }
}
