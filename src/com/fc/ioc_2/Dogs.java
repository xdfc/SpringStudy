package com.fc.ioc_2;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Dogs {
    private Animals animals;
    private String colour;
    public Animals getAnimals() {
        return animals;
    }

    public  Dogs(Animals animals){
        this.animals = animals;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public String info(){
        return "Name:"+animals.getName()+",move:"+animals.getMove()+",colour:"+colour;
    }
}
