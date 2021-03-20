package com.awsymbols;

public class Supervillian extends Person
{

    // fields
    private static int superVillianCount = 0;
    private String name;
    private String primaryColor;
    private String secondaryColor;
    private char sex;

    // Constructors

    public Supervillian() {
        Supervillian.superVillianCount++;
    }

    public Supervillian(String name, String primaryColor, char sex, String secondaryColor) {
        this.name = name;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.sex = sex;
        Supervillian.superVillianCount++;
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

    public void evilLaugh() {
        System.out.println("Muah Ha Ha Ha Ha Ha");
    }

    public void destroy() {
        System.out.println("Death is inevitable");
    }

    public static void main(String[] args) {

        Supervillian zach = new Supervillian("Super Zach", "Purple", 'M', "Orange");

        System.out.println(zach.name);
        zach.evilLaugh();
        zach.destroy();

    }

}
