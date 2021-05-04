package com.company;

public class starbucksLogManager implements ıStarbucksLogManager {

    @Override
    public void addToDataBase(StarbucksCustomer starbucksCustomer) {
        System.out.println("Müşteri veritabanına eklendi: "+starbucksCustomer.getFirstName()+" "+starbucksCustomer.getLastName());
    }

    @Override
    public void removeFromDataBase(StarbucksCustomer starbucksCustomer) {
        System.out.println("Müşteri veritabanından silindi: "+starbucksCustomer.getFirstName()+" "+starbucksCustomer.getLastName());
    }

    @Override
    public void updateInDataBase(StarbucksCustomer starbucksCustomer) {
        System.out.println("Müşteri veritabanında güncellendi: "+starbucksCustomer.getFirstName()+" "+starbucksCustomer.getLastName());
    }
}
