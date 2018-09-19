package com.company;

public class BFS_Array {

    private class Node {

        public int x;
        public int y;
        public int step;

        public Node(int x, int y, int step) {
            this.step = step;
            this.x = x;
            this.y = y;
        }
    }

    private Node[] queues = new Node[3000];
    private int head = 0;
    private int tail = 0;

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

    void BFS(int x, int y, int step) {

        Node node = new Node(x, y, step);
        queues[tail++] = node;
        book[x][y] = step;

        int next_x = 0;
        int next_y = 0;

        while (head < tail) {

            for (int i = 0; i < 4; i++) {
                next_x = queues[head].x + next[i][0];
                next_y = queues[head].y + next[i][1];

                if (next_x < 0 || next_x >= 5 || next_y < 0 || next_y >= 5) {
                    continue;
                }

                if (map[next_x][next_y] == 0 && book[next_x][next_y] == 0) {
                    book[next_x][next_y] = queues[head].step + 1;
                    queues[tail++] = new Node(next_x, next_y, queues[head].step + 1);
                }

                if (map[next_x][next_y] == 2) {
                    showBook();
                    Node tailNode = queues[tail-1];
                    System.out.printf("found target:[%d,%d] use:%d]\n", next_x, next_y, tailNode.step);
                    return;
                }
            }
            head++;
        }

    }

    public static void main(String[] args) {
        BFS_Array bfs = new BFS_Array();
        bfs.BFS(0, 0, 1);
    }
}
