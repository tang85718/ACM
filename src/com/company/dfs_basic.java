package com.company;

public class dfs_basic {


    static int[][] map = new int[][]{
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0},
            {0, 1, 2, 0, 1},
            {0, 1, 0, 1, 1}
    };

    int[][] book = new int[5][5];

    int[][] next = new int[][]{
            {0, 1},  // right
            {1, 0},  // bottom
            {0, -1}, // left
            {-1, 0}  // up
    };

    boolean DFS(int x, int y, int step) {
        int tx = 0;
        int ty = 0;

        for (int i = 0; i < 4; i++) {
            tx = x + next[i][0];
            ty = y + next[i][1];

            // 检查边界
            if (tx < 0 || tx >= 5 || ty < 0 || ty >= 5) {
                continue;
            }

            if (map[tx][ty] == 2) {
                System.out.printf("found target:[%d,%d] use:%d]\n", tx, ty, step);
                book[tx][ty] = step;
                showBook();
                return true;
            }

            if (map[tx][ty] == 0 && book[tx][ty] == 0) {
                book[tx][ty] = step;
                if (DFS(tx, ty, step + 1)) {
                    return true;
                }
                book[tx][ty] = 0;
            }
        }

        return false;
    }

    void showBook() {
        System.out.println("Begin");

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.printf("%d ", book[x][y]);
            }

            System.out.println("");
        }

        System.out.println("End");
    }

    public static void main(String[] args) {
        dfs_basic dfs = new dfs_basic();
        dfs.DFS(4, 0, 1);
    }
}
