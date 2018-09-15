package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {

    public static int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int length = Math.max(A.length, B.length);
        int[] tmp = new int[length];

        for (int v : A) {
            tmp[v - 1]++;
        }

        for (int v : B) {
            tmp[v - 1]++;
        }


        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int count = tmp[i];
            if (count == 0) {
                continue;
            }

            for (int j = 0; j < count; j++) {
                ret.add(i + 1);
            }
        }

        int[] C = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            C[i] = ret.get(i);
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{2, 4, 5, 6};
        mergeSortedArray(A, B);
    }


}
