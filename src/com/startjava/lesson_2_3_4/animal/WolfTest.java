package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("самец");
        wolf.setNickname("Белый Клык");
        wolf.setWeight(80);
        wolf.setAge(8);
        wolf.setColor("серый");

        System.out.println("Пол  - " + wolf.getGender());
        System.out.println("Кличка - " + wolf.getNickname());
        System.out.println("Вес - " + wolf.getWeight());
        System.out.println("Возраст - " + wolf.getAge());
        System.out.println("Окрас - " + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}