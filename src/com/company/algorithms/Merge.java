package com.company.algorithms;

import java.util.Random;

public class Merge extends Example {
    Comparable[] aux;

    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sortUB(a, 0, a.length - 1);
    }

    // 自底向上
    public void sortBU(Comparable[] a) {
        int N = a.length;

        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int low = 0; low < N - sz; low += sz + sz) {
                merge(a, low, low + sz - 1, Math.min(low + sz + sz - 1, N - 1));
            }
        }
    }

    /// 自顶向下
    private void sortUB(Comparable[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        sortUB(a, low, mid);
        sortUB(a, mid + 1, high);
        merge(a, low, mid, high);
    }


    private void merge(Comparable[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void main(String[] args) {

        Random random = new Random();

        final int SZ = 10;
        Integer[] a = new Integer[SZ];
        for (int i = 0; i < SZ; i++) {
            a[i] = random.nextInt(SZ);
        }

        Merge algothms = new Merge();
        algothms.sort(a);
        algothms.show(a);
    }
}
