package ru.ourcompany;

public class Cat extends Animal{
    Cat(String name, String color, int age) {
        super(name, color, age);
        setHeightJump(rangeRandom(1,3,1));
        setLengthRun((int)rangeRandom(2,6,100));
    }
}
