package com.company.algorithms;

public class Shell extends Example {
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        int c = 4;
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

        Integer[] a = new Integer[] {23, 32, 12, 1, 2, 3, 5, 10, 11, 88, 44, 33, 2};
        Shell shell = new Shell();
        shell.sort(a);
        shell.show(a);
    }
}
