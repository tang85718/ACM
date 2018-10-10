package com.company.algorithms.sort;

public abstract class Example {
    private int exchange = 0;

    public abstract void sort(Comparable[] a);

    boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
        exchange ++;
    }

    void show(Comparable[] a) {
        for (Comparable v : a) {
            System.out.print(v + " ");
        }

        System.out.println();
        System.out.printf("size:%d exchange:%d\n", a.length, exchange);
    }

    boolean isSorted(Comparable[] a) {
        for (int i=1; i<a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }

        return true;
    }

    boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
