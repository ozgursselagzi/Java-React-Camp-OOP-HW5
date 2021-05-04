package com.company;

public class NeroLogManager implements ıNeroLogManager{
    @Override
    public void addToDataBase(NeroCustomer neroCustomer) {
        System.out.println("Müşteri veritabanına eklendi: "+neroCustomer.getFirstName()+" "+neroCustomer.getLastName());
    }

    @Override
    public void removeFromDataBase(NeroCustomer neroCustomer) {
        System.out.println("Müşteri veritabanından silindi: "+neroCustomer.getFirstName()+" "+neroCustomer.getLastName());
    }

    @Override
    public void updateInDataBase(NeroCustomer neroCustomer) {
        System.out.println("Müşteri veritabanında güncellendi: "+neroCustomer.getFirstName()+" "+neroCustomer.getLastName());
    }
}
