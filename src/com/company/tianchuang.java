package com.company;

import java.util.Scanner;

public class tianchuang {

    public final static double PI = 3.14159265358979;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gc = scanner.nextInt();

        for (int i = 0; i < gc; i++) {
            int s = scanner.nextInt();
            int r = scanner.nextInt();

            if (r * 2 < s) {
                // 圆在正方形里面
                System.out.printf("%.2f\n", (double) r * r * PI);
            } else if (s / Math.sqrt(2) < r) {
                // 正方形在圆里面
                System.out.printf("%.2f\n", (double) s * s);
            } else {
                double leg1 = s / 2.0;

                // Get the hypotenuse of the triangle
                double hypot = r;

                // Get the opposite leg of the triangle
                double leg2 = Math.sqrt(hypot * hypot - leg1 * leg1);

                // Find angle of the point of intersection on the circle
                double theta = Math.atan2(leg2, leg1);

                // Get the area of the 8 triangles in the intersection
                double triArea = 8.0 * (leg1 * leg2 / 2.0);

                // Get the area of the 4 arcs
                double arcArea = (r * r / 2) * ((PI * 2.0) - 8.0 * theta);
                System.out.printf("%.02f%n", triArea + arcArea);
            }
        }
    }
}
