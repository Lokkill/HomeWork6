package ru.ourcompany;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik", "Black", 3);
        Dog dog2 = new Dog("Rex", "White", 5);
        Cat cat1 = new Cat("Murzik", "Black", 1);
        Cat cat2 = new Cat("Vasya", "Gray", 2);

        dog1.info();
        dog2.info();
        cat1.info();
        cat2.info();

        dog1.jump(5);
        dog1.run(300);
        dog1.swim(60);

        cat1.jump(2);
        cat1.run(200);
        cat1.swim(10);
    }
}
