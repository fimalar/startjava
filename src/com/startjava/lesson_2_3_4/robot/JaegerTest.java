package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        jaeger1.setHeight(76.2f);
        jaeger1.setWeight(1.850f);
        jaeger1.setSpeed(10);
        jaeger1.setStrength(10);
        jaeger1.setArmor(9);
        jaeger1.setWeapon("Assault Mount 3.25 \"Sting-Blades\"");

        System.out.println("\n" + jaeger1);
        System.out.print(jaeger1.getModelName() + " использует оружие? ");
        System.out.println(jaeger1.useWeapon());
        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 9,8,6, 
                "IB22 Plasmacaster");
        System.out.println("\n" + jaeger2);
        System.out.println("Кто сильнее? " + jaeger1.getModelName() + " или " + jaeger2.getModelName() + "? "
                + (jaeger1.getStrength() > jaeger2.getStrength() ? jaeger1.getModelName() : jaeger2.getModelName()));
        System.out.println("Увеличить силу " + jaeger2.getModelName());
        jaeger2.setStrength(12);
        System.out.println("Сила " + jaeger2.getModelName() + " повышена до " + jaeger2.getStrength());
        System.out.println("Кто сильнее? " + (jaeger1.getStrength() > jaeger2.getStrength() ? 
                jaeger1.getModelName() : jaeger2.getModelName()));
        System.out.print(jaeger1.getModelName() + " владеет IB22 Plasmacaster" + " - " 
                + jaeger1.hasWeapon("IB22 Plasmacaster"));
    }
}