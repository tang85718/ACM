package com.company.algorithms;

import java.util.Random;

public class Selection extends Example {
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exchange(a, i, min);
        }
    }

    public static void main(String[] args) {

        Random random = new Random();

        Integer[] a = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = random.nextInt(100000);
        }

        Selection shell = new Selection();
        shell.sort(a);
        shell.show(a);
    }
}
