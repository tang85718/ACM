package com.company;

/**
 * 临接表
 * 没有使用真正的指针链表，而是使用数组
 */
public class Map_Dijkstra_2 {

    int[] u = new int[]{1, 4, 1, 2, 1, -1};
    int[] v = new int[]{4, 3, 2, 4, 3, -1};
    int[] w = new int[]{9, 8, 5, 6, 7, -1};

    int[] first = new int[]{5, 4, -1, 2, -1}; // 存储顶点的第一条边的编号
    int[] next = new int[]{-1, -1, 1, -1, 3};  // 存储"编号为i的边"的"下一条边"的编号

    /**
     * 数据输入阶段
     * next[i] = first[u[i]];
     * first[u[i]] = i;
     */

    public Map_Dijkstra_2() {

        for (int i = 0; i < next.length; i++) {
            int k = first[i] - 1;
            while (k >= 0) {
                System.out.printf("%d %d %d\n", u[k], v[k], w[k]);
                k = next[k];
            }
        }
    }

    public static void main(String[] args) {
        Map_Dijkstra_2 dijkstra = new Map_Dijkstra_2();
    }
}
