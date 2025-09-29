package com.javajourney.coupling;

public class EngineFactory {

    public static Engine getEngine(String type) {
        if(type.equalsIgnoreCase("diesel")){
            return new DieselEngine();
        }else if(type.equalsIgnoreCase("petrol")){
            return new PetrolEngine();
        }else{
            throw new IllegalArgumentException("Invalid engine type");
        }
    }

}
