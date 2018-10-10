package com.company.leetcode;

public class FindComplement {

    public static int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) << 1) - 1;
    }

    public static void main(String[] args) {
        int ret = findComplement(5);
        System.out.println(ret);
    }
}
