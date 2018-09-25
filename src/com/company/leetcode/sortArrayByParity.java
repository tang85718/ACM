package com.company.leetcode;

public class sortArrayByParity {

    public sortArrayByParity() {
        int[] A = new int[]{1, 3, 2, 4};
        sortArrayByParity(A);
    }

    public int[] sortArrayByParity(int[] A) {
        if (A.length == 0) {
            return A;
        }

        int[] ret = new int[A.length];

        int begin = 0;
        int end = A.length-1;
        for (int n : A) {
            if (n % 2 == 0) {
                ret[begin++] = n;
            } else {
                ret[end--] = n;
            }
        }

        return ret;
    }


    public static void main(String[] args) {
        sortArrayByParity number = new sortArrayByParity();
    }
}
