package com.company;

public class Main {


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(2);
        cat.color = "red";
        cat.name = "Eva";
        Cat cat2 = cat;
        System.out.println(cat2.name);
        cat.meow();
        cat.setAge(-50);
        System.out.println(cat.getAge());
    }

}

