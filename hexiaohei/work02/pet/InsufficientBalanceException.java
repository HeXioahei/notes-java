package com.hexiaohei.work02.pet;

/**
 * @version 1.0 2023.10.13
 * @author hexiaohei
 */
public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){}
    public InsufficientBalanceException(String gripe){
        super(gripe);
    }
}
