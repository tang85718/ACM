package com.company;

public class huiwen {

    public static void main(String[] args) {
        check("werhrew");
        check("ahha");

        check("werhraw");
    }

    private static void check(String in) {
        int top = 0;
        int length = in.length();
        int mid = length / 2;
        int next = (length % 2 == 0) ? mid : mid + 1;

        char[] stack = new char[mid];

        for (int i = 0; i < mid; i++) {
            stack[top++] = in.charAt(i);
        }

        for (int i = next; i < length; i++) {
            top--;
            if (in.charAt(i) != stack[top]) {
                break;
            }
        }

        System.out.printf("%s:%s\n", in, (top == 0) ? "YES" : "NO");
    }
}
