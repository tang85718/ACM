package com.company.algorithms.sort;

import java.util.Random;

public class Insertion extends Example {
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {

        Random random = new Random();

        Integer[] a = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = random.nextInt(100000);
        }

        Insertion shell = new Insertion();
        shell.sort(a);
        shell.show(a);
    }
}
