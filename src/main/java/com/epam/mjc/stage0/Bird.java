package com.epam.mjc.stage0;

class Bird extends Animal {
    public Bird(){
        setColor("blue");
        getNumberOfPaws(2);
        setHasFur(false);
    }
    public Bird(String color, int numberOfPaws, boolean hasFur){
        super(color,numberOfPaws, hasFur);
    }

    @Override
    public String getDescription(){
        if(numberOfPaws() > 1 ) {
            if (hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paws and a fur. Moreover, it has 2 wings and can fly.";
            } else if (!hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paws and no fur. Moreover, it has 2 wings and can fly.";
            }
        }else if (numberOfPaws() == 1){
            if (hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paw and a fur. Moreover, it has 2 wings and can fly.";
            } else if (hasFur()) {
                return "This animal is mostly " + getColor() + ". It has " + numberOfPaws() + " paw and no fur. Moreover, it has 2 wings and can fly.";
            }
        }else {
            return "Error";
        }
        return null;
    }
}
