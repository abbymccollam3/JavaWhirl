package com.example.java;

public class Olive {

    OliveName name = OliveName.KALAMATA;
    private long color = 0x2E0854;
    private int oil = 3;

    //constructor method
    public Olive(){}

    public Olive(OliveName name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }
    
    //getters return the value
    //setters receive an argument
    //this is used to distinguish the variable that is a member of the instance

    public OliveName getName() { return name; }

    public void setName(OliveName name) { this.name = name; }

    public long getColor() { return color; }

    public void setColor(long color) { this.color = color; }

    public int cursh() {
        System.out.println("Crushed");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

}
