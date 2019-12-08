package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("start main");

        some();
        System.out.println("end main");


    }

    public static void some() {
        System.out.println("  start some");
        some2();
        System.out.println("  end some");
    }

    public static void some2() {
        System.out.println("  start some2");
        System.out.println("  end some2");
    }
}
