package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private String weapon;

    public Jaeger() {
        
    }

    public Jaeger(String modelName, String mark, String origin, float height, 
            float weight, int speed, int strength, int armor, String weapon) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    boolean useWeapon() {
        return true;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.print("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void userVortexCannon() {
        System.out.println("activated");
    }

    boolean hasWeapon(String weapon) {
        if (this.weapon.equals(weapon)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Модель: %s \nИмя: %s \nПроизводство: %s \nТехнические данные: \nРост - %.2f" +
            "\nВес - %.3f \nСкорость - %d \nСила - %d \nБроня %d \nОружие - %s\n",
            mark, modelName, origin, height, weight, speed, strength, armor, weapon);
    }
}