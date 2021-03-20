package com.awsymbols;

public class Exclamachine extends Superhero {

    // fields
    private String name = "Exclamachine";
    private String primaryColor = "yellow";
    private String secondaryColor = "white";
    private char sex = 'U';
    private String logo = "Spider";

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

    public String getLogo() { return logo; }

    // methods

    public void throwBracelet() {
        System.out.println("Whoosh");
    }



}
