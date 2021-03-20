package com.awsymbols;

public class QuestionMarksWoman extends Superhero {

    // fields
    private String name = "Question Marks Woman";
    private String primaryColor = "blue";
    private String secondaryColor = "white";
    private char sex = 'F';
    private String logo = "Arrow";

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

    public void shootArrow() {
        System.out.println("Twang");
    }
}
