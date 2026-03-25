package com.linkcode.polymorphism;

public class main {
    public static void main(String[] args) {

        //upcasting
//        Puppy puppy = new Puppy();
//        puppy.play();
//        puppy.bark();
//        puppy.sleep();
//        Dog dog = puppy;
//        dog.bark();
//        dog.sleep();
//  dog.play();
//        Animal animal = dog;
//        animal.sleep();
//        animal.bark();
//        animal.play();

        //downcasting

        Animal animal = new Puppy();
        animal.sleep();
        Dog dog = (Dog) animal;
        dog.sleep();
        dog.bark();
        Puppy puppy =(Puppy) dog;
        puppy.sleep();
        puppy.bark();
        puppy.play();
    }
}
