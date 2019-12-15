package com.company;

public class Cat {
    private int age;
    String color;
    String name;

    public Cat() {
        this.color = "Неизвестный цвет";
        this.name = "Неизвестное имя";
//    вот это конструктор

    }

    public Cat (int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;

        }
    }

    public int getAge() {
        return age;
    }

    public void meow() {
        System.out.println("Meow");
        repeate("Meow", 3);
        this.repeate(color, 2);
    }

    private void repeate(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }


    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
