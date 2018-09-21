package com.company;

import java.util.Scanner;

//todo:
public class Map_Dijkstra {

    int[][] map = new int[10][10];
    int[] distance = new int[10];
    int[] trace = new int[10];
    int count = 0;
    private int min;
    int u = 0;

    public Map_Dijkstra() {
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int m = sc.nextInt();

        for (int r = 0; r < count; r++) {
            for (int c = 0; c < count; c++) {
                map[r][c] = (r == c) ? 0 : Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            map[a][b] = c;
        }

        printMap();

        for (int i = 1; i < count; i++) {
            distance[i] = map[0][i];
        }

        trace[0] = 1;

        for (int i = 0; i < count - 1; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < count; j++) {
                if (trace[j] == 0 && distance[j] < min) {
                    min = distance[j];
                    u = j;
                }
            }

            trace[u] = 1;

            for (int v = 0; v < count; v++) {
                if (map[u][v] < Integer.MAX_VALUE) {  // 可以联通的边
                    if (distance[v] > distance[u] + map[u][v])
                        distance[v] = distance[u] + map[u][v];
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.printf("%d ", distance[i]);
        }
    }

    void printMap() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%s ", map[i][j] == Integer.MAX_VALUE ? "#" : String.valueOf(map[i][j]));
            }
            System.out.println("");
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        Map_Dijkstra dijkstra = new Map_Dijkstra();
    }
}
