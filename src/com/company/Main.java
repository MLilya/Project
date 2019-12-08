package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("start main");
        int b = 3;
        some();
        System.out.println("end main");


    }

    public static void some() {
        System.out.println("  start some");
        int b = 2;
        some2();
        System.out.println("  end some");
    }

    public static void some2() {
        int b = 1;
        System.out.println("  start some2");
        System.out.println("  end some2");
    }
}
