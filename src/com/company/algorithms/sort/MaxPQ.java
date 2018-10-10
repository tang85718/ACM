package com.company.algorithms.sort;

// 优先队列
public class MaxPQ<T extends Comparable<T>> {

    private T[] buffer;
    private int N = 0;

    public MaxPQ(int max) {
        buffer = (T[]) new Comparable[max + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(T v) {
        buffer[++N] = v;
        swim(N);
    }

    public T delMax() {
        T max = buffer[1];
        exchange(1, N--);
        buffer[N + 1] = null;
        sink(1);
        return max;
    }

    private boolean less(int i, int j) {
        return buffer[i].compareTo(buffer[j]) < 0;
    }

    private void exchange(int i, int j) {
        T t = buffer[i];
        buffer[i] = buffer[j];
        buffer[j] = t;
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exchange(k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exchange(k, j);
            k = j;
        }
    }
}
