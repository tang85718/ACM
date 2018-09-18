package com.company;

import java.util.Scanner;

public class Lemon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int cases = 0; cases < n; cases++) {

            int days = scanner.nextInt();    // 天
            int lemon = scanner.nextInt();  // 个
            int sucar = scanner.nextInt();  // 盎司


            Day[] allDays = new Day[days];
            for (int d = 0; d < days; d++) {
                allDays[d].sellCount = scanner.nextInt();   // 卖出多少个
                allDays[d].lemonPrice = scanner.nextInt();  // 一个柠檬的价格
                allDays[d].sugarPrice = scanner.nextInt();  // 一袋糖的价格5磅 一磅16盎司
            }

        }

    }
}


class Day {
    public int lemonPrice;
    public int sugarPrice;
    public int sellCount;
}
