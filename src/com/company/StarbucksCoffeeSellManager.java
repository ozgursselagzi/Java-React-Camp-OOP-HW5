package com.company;

public class StarbucksCoffeeSellManager{
    public void buyCoffeeOnStarbucks(StarbucksCustomer starbucksCustomer){

        System.out.println(starbucksCustomer.getFirstName()+" "+starbucksCustomer.getLastName()
                +" Starbucks'dan kahve satın aldı");

        StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager();
        starbucksCustomerManager.addStar(starbucksCustomer);

    }

}
