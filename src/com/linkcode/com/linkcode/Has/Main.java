package com.linkcode.com.linkcode.Has;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(23,250,"v4");

        Bike bike = new Bike(2222,"Street Triple",3,engine);
        bike.display();

        System.out.println(engine.type);

        Human human = new Human();
        human.live();
    }
}
