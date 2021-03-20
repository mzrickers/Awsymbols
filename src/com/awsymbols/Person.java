package com.awsymbols;

public class Person implements CanMove, CanSpeak
{

    // fields

    public void move() {
        System.out.println("Moving");
    }

    public void speak() {
        System.out.println("Speaking");
    }

}
