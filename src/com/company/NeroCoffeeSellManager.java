package com.company;

public class NeroCoffeeSellManager{
    public void buyCoffeeOnNero(NeroCustomer neroCustomer){
        if (neroCustomer.getFirstName().length()>=2 && neroCustomer.getLastName().length()>=2){

        System.out.println(neroCustomer.getFirstName()+" "+neroCustomer.getLastName()+" Nero'dan kahve satın aldı");
        System.out.println("MÜŞTERİ DOĞRULAMASI BAŞARILI");

        }else {
            System.out.println("MÜŞTERİ DOĞRULAMASI BAŞARISIZ");
        }
    }
}
