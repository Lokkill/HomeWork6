package ru.ourcompany;

public abstract class Animal {
    private final String name;
    private final String color;
    private final int age;
    private double heightJump;
    private int lengthRun;
    private int lengthSwim;

    Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info(){
        System.out.printf("Имя: %s\n"
        + "Цвет: %s\n"
        + "Возраст: %d\n"
        + "Максимальаня высота прыжка: %.1f\n"
        + "Максимальная длина бега: %d\n"
        + "Максимальная длина плавания: %d\n",
                name, color, age, heightJump, lengthRun, lengthSwim);
    }

    public void run(int value){
        System.out.println(name + " run: " + (value <= lengthRun));
    }

    public void swim(int value){
        if (this instanceof Cat){
            System.out.println(name + " swim: " + false);
        } else {
            System.out.println(name + " swim: " + (value <= lengthSwim));
        }
    }

    public void jump(int value){
        System.out.println(name + " jump: " + (value <= heightJump));
    }

    public double rangeRandom(double min, double max, int multiplier){

        return ((Math.random() * ((max - min) + 1)) + min) * (double)multiplier;
    }

    public void setHeightJump(double heightJump) {
        this.heightJump = heightJump;
    }

    public void setLengthRun(int lengthRun) {
        this.lengthRun = lengthRun;
    }

    public void setLengthSwim(int lengthSwim) {
        this.lengthSwim = lengthSwim;
    }
}
