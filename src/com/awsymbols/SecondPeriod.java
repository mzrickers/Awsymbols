package com.awsymbols;

public class SecondPeriod extends Superhero
{

    // fields
    private String name = "Second Period";
    private String primaryColor = "grey";
    private char sex = 'M';

    // Getters

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrimaryColor() {
        return primaryColor;
    }

    @Override
    public char getSex() {
        return sex;
    }

    // Methods
    public void shootLaser() {
        System.out.println("Pew Pew Pew");
    }

}
