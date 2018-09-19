package com.company;

import java.util.Scanner;

public class Map_Min_Lujing {

    int min = Integer.MAX_VALUE;
    int[] trace = new int[101];
    int cityCount = 0;
    int[][] map = new int[100][100];


    void dfs(int cur, int dis) {
        if (dis > min) {
            return;
        }

        if (cur == cityCount) {
            if (dis < min) {
                min = dis;
            }
            return;
        }

        for (int i = 0; i < cityCount; i++) {

            if (map[cur][i] != Integer.MAX_VALUE && trace[i] == 0) {
                trace[i] = 1;
                dfs(i, dis + map[cur][i]);
                trace[i] = 0;
            }
        }
    }

    public Map_Min_Lujing() {
        Scanner scanner = new Scanner(System.in);
        cityCount = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 0; i < cityCount; i++) {
            for (int j = 0; j < cityCount; j++) {
                if (i == j) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int i = 0; i < y; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            map[a - 1][b - 1] = c;
        }

        // 从0出发
        trace[0] = 1;
        dfs(0, 0);
        System.out.printf("最短路径 %d", min);
    }

    public static void main(String[] args) {
        Map_Min_Lujing map = new Map_Min_Lujing();
    }
}
