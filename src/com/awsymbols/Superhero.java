package com.awsymbols;

public class Superhero extends Person
{

    // fields
    private static int superHeroCount = 0;
    private String name;
    private String primaryColor;
    private String secondaryColor;
    private char sex;

    // Constructors

    public Superhero() {
        Superhero.superHeroCount++;
    }

    public Superhero(String name, String primaryColor, char sex, String secondaryColor) {
        this.name = name;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.sex = sex;
        Superhero.superHeroCount++;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    // methods

    public void contentedChuckle() {
        System.out.println("Ha Ha Ha");
    }


}
