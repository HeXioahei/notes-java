package com.hexiaohei.work02.pet;

/**
 * @version 1.0 2023.10.13
 * @author hexiaohei
 */
public class AnimalNotFoundException extends RuntimeException{
    public AnimalNotFoundException(){}
    public AnimalNotFoundException(String gripe){
        super(gripe);
    }
}
