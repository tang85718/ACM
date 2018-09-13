package com.company;

public class Out {

    private int a;
    private int b;

    public Out(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public class Inner {
        public void print() {
            System.out.println(a);
            System.out.println(b);
        }
    }
}
