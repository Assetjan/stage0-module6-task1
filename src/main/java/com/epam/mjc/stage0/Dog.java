package com.epam.mjc.stage0;

public class Dog extends Animal {
    public Dog(){
        setColor("brown");
        getNumberOfPaws(4);
        setHasFur(true);
    }
    public Dog(String color, int numberOfPaws, boolean hasFur){
        super(color, numberOfPaws, hasFur);
    }
    public String getDescription(){
        if(numberOfPaws() > 1 ) {
            if (hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paws and a fur.";
            } else if (!hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paws and no fur.";
            }
        }else if (numberOfPaws() == 1){
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
