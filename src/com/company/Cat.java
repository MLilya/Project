package com.company;

public class Cat {
    int age;
    String color;
    String name;

    public void meow() {
        System.out.println("Meow");
        repeate("Meow", 3);
        repeate(color, 2);
    }

    private void repeate(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

}
