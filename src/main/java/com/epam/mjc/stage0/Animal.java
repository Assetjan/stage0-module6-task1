package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int numberOfPaws(){
        return numberOfPaws;
    }
    public void getNumberOfPaws(int numberOfPaws){
        this.numberOfPaws = numberOfPaws;
    }
    public boolean hasFur(){
        return hasFur;
    }
    public void setHasFur(boolean hasFur){
        this.hasFur = hasFur;
    }

    public String getDescription(){
        if(numberOfPaws > 1 ) {
            if (hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paws and a fur.";
            } else if (!hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paws and no fur.";
            }
        }else if (numberOfPaws == 1){
            if (hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paw and a fur.";
            } else if (!hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paw and no fur.";
            }
        }else {
            return "Error";
        }
        return null;
    }
}
