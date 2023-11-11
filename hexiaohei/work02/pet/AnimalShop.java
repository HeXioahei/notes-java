package com.hexiaohei.work02.pet;

/**
 * @version 1.0 2023.10.13
 * @author hexiaohei
 */
public interface AnimalShop {
    void buyNewAnimal(Animal animal);
    void treatCustomer(Customer customer, Animal animalSold);
    void closeShop();
}
