package com.company;

public class StarbucksCustomerManager extends StarbucksCustomer implements ıStarbucksCustomer{

    @Override
    public void addStarbucksCustomer(StarbucksCustomer starbucksCustomer) {
        System.out.println(starbucksCustomer.getFirstName()+" "+starbucksCustomer.getLastName()+" isimli müşteri" +
                " Starbucks müşteri sistemine eklendi");
    }

    @Override
    public void removeStarbucksCustomer(StarbucksCustomer starbucksCustomer) {
        System.out.println(starbucksCustomer.getFirstName()+" "+starbucksCustomer.getLastName()+" isimli müşteri" +
                " Starbucks müşteri sisteminden silindi");
    }

    @Override
    public void updateStarbucksCustomer(StarbucksCustomer starbucksCustomer) {
        System.out.println(starbucksCustomer.getFirstName()+" "+starbucksCustomer.getLastName()+" isimli müşteri" +
                " Starbucks müşteri sisteminde güncellendi");
    }

    @Override
    public void addStar(StarbucksCustomer starbucksCustomer) {
        if (starbucksCustomer.getFirstName().length()>=2 && starbucksCustomer.getLastName().length()>=2){

            System.out.println("MÜŞTERİ DOĞRULAMASI BAŞARILI");

            int newStarAmount = 1;
            newStarAmount = starbucksCustomer.getStarAmount() + newStarAmount;

        System.out.println("Hesabınıza 1 yeni yıldız eklendi! Güncel yıldız miktarınız: "+newStarAmount);
        }else{
            System.out.println("MÜŞTERİ DOĞRULAMASI BAŞARISIZ");
        }
    }

}
