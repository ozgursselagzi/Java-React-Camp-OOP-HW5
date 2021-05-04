package com.company;

public class NeroCustomerManager implements ıNeroCustomerManager{

    @Override
    public void addNeroCustomer(NeroCustomer neroCustomer) {
        System.out.println(neroCustomer.getFirstName()+" "+neroCustomer.getLastName()+" isimli müşteri" +
                " Nero müşteri sistemine eklendi");
    }

    @Override
    public void removeNeroCustomer(NeroCustomer neroCustomer) {
        System.out.println(neroCustomer.getFirstName()+" "+neroCustomer.getLastName()+" isimli müşteri" +
                " Nero müşteri sisteminden silindi");
    }

    @Override
    public void updateNeroCustomer(NeroCustomer neroCustomer) {
        System.out.println(neroCustomer.getFirstName()+" "+neroCustomer.getLastName()+" isimli müşteri" +
                " Nero müşteri sisteminde güncellendi");
    }
}
