package ru.ourcompany;

public class Dog extends Animal{
    Dog(String name, String color, int age) {
        super(name, color, age);
        setHeightJump(rangeRandom(1,3,1));
        setLengthRun((int)rangeRandom(4,8,100));
        setLengthSwim((int)rangeRandom(1,5, 10));
    }
}
