package com.company;

public class BFS_Array {
    static int[][] map = new int[][]{
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0},
            {0, 1, 2, 0, 1},
            {0, 1, 0, 1, 1}
    };
    int[][] next = new int[][]{
            {0, 1},  // right
            {1, 0},  // bottom
            {0, -1}, // left
            {-1, 0}  // up
    };


}
