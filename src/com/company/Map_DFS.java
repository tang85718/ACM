package com.company;

/**
 * 邻接矩阵存储法
 * 无向图
 */
public class Map_DFS {

    int[][] map = new int[][]{
            {0, 1, 1, -1, 1},
            {1, 0, -1, 1, -1},
            {1, -1, 0, -1, 1},
            {-1, 1, -1, 0, -1},
            {1, -1, 1, -1, 0}
    };
    int[] book = new int[30];

    int sum = 0;
    int n = 5;

    Map_DFS() {
        book[0] = 1;
    }

    public void dfs(int cur) {
        System.out.printf("%d", cur + 1);

        if (sum == n) {
            return;
        }

        for (int i = 1; i < n; i++) {
            if (map[cur][i] == 1 && book[i] == 0) {
                book[i] = 1;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Map_DFS map = new Map_DFS();

        map.dfs(0);
    }
}
