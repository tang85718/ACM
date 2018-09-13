package com.company;




public class Main {

    public static void main(String[] args) {

        Out out = new Out(4, 3);
        Out.Inner inner = out.new Inner();
        inner.print();
    }

}
