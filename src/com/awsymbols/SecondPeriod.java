package com.awsymbols;

public class SecondPeriod extends Superhero
{

    // fields
    private String name = "Second Period";
    private String primaryColor = "grey";
    private String secondaryColor = "light grey";
    private char sex = 'M';
    private String logo = "SP";

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
    public String getSecondaryColor() {
        return secondaryColor;
    }

    @Override
    public char getSex() {
        return sex;
    }

    public String getLogo() {
        return logo;
    }

    // Methods
    public void shootLaser() {
        System.out.println("Pew Pew Pew");
    }

}
