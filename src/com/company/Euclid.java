package com.company;


/**
 * 计算最大公因数
 */
public class Euclid {

    static int euclid(int x, int y) {
        if (y == 0) {
            return x;
        }

        return euclid(y, x % y);
    }

    public static void main(String[] args) {

        int ret = euclid(100, 76);
        System.out.println(ret);
    }
}
