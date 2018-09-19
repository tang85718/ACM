package com.company;

import java.util.Scanner;

/**
 * 无向图
 */
public class Map_BFS_2 {

    class City {
        int id; // 编号
        int count; // 转机次数

        public City(int id, int count) {
            this.id = id;
            this.count = count;
        }
    }

    City[] queue = new City[100];
    int[][] map = new int[100][100];
    int[] trace = new int[100];
    int head = 0;
    int tail = 0;

    int numOfCity;

    int startCity;
    int endCity;


    public Map_BFS_2() {
        boolean done = false;
        Scanner scanner = new Scanner(System.in);
        numOfCity = scanner.nextInt();
        int n = scanner.nextInt();

        startCity = scanner.nextInt() - 1;
        endCity = scanner.nextInt() - 1;

        for (int r = 0; r < numOfCity; r++) {
            for (int c = 0; c < numOfCity; c++) {
                if (r == c) {
                    map[r][c] = 0;
                } else {
                    map[r][c] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            map[a][b] = 1;
            map[b][a] = 1;
        }


        queue[tail++] = new City(startCity, 0);
        trace[0] = startCity;

        int curCityID;
        while (head < tail) {
            curCityID = queue[head].id;

            for (int i = 0; i < numOfCity; i++) {
                if (map[curCityID][i] >= 0 && trace[i] == 0) {
                    City newCity = new City(i, queue[head].count + 1);
                    queue[tail++] = newCity;
                    trace[i] = 1;
                }

                if (queue[tail-1].id == endCity) {
                    done = true;
                    break;
                }
            }

            if (done) {
                break;
            }

            head++;
        }

        System.out.printf("转机次数:%d", queue[tail - 1].count);
    }

    public static void main(String[] args) {
        Map_BFS_2 c = new Map_BFS_2();
    }
}
