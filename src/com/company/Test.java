package com.company;

public class Test {

    public static int hammingDistance(int x, int y) {
        if (x == 0 && y == 0) {
            return 0;
        }

        int distance = 0;

        for (int i=0; i<32; i++) {
            int a = (x >> i) & 1;
            int b = (y >> i) & 1;
            int r = a ^ b;
            if (r == 1) {
                distance ++;
            }
        }

        return distance;
    }

    public static int peakIndexInMountainArray(int[] A) {
        int len = A.length;
        int mid = len % 2 == 0 ? len / 2-1 : len /2;

        int max = mid;
        int l = 1;
        int r = 1;
        boolean turn = false;

        while (!(A[max-1] < A[max] && A[max] > A[max+1])) {
            max = turn ? mid - (l++) : mid + (r++);
            turn = !turn;
        }

        return max;
    }

    public static void main(String[] args) {

        peakIndexInMountainArray(new int[] { 24,69,100,99,79,78,67,36,26,19});
    }
}
