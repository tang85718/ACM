package com.company.algorithms.sort;

import java.util.Random;

public class Shell extends Example {
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        int c = 5;
        while (h < N / c) {
            h = h * c + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exchange(a, j, j - h);
                }
            }
            h = h / c;
        }
    }

    public static void main(String[] args) {

        Random random = new Random();

        Integer[] a = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = random.nextInt(100000);
        }

        Shell shell = new Shell();
        shell.sort(a);
        shell.show(a);
    }
}
