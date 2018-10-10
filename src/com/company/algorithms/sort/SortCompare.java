package com.company.algorithms.sort;

import java.util.Random;

public class SortCompare {

    public long time(Example example, Comparable[] a) {
        long st = System.currentTimeMillis();
        example.sort(a);
        return System.currentTimeMillis() - st;
    }

    public double timeRandomInput(Example e, int N, int T) {
        double total = 0.0;
        Integer[] a = new Integer[N];
        Random random = new Random();
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = random.nextInt(10000);
            }

            total += time(e, a);
        }

        return total;
    }

    public static void main(String[] args) {
        SortCompare compare = new SortCompare();

    }
}
