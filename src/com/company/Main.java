package com.company;

public class Main {

    public static void main(String[] args) {
	// Java & React Kampı 4. gün Ödev Kodları

        Customer customer = new Customer();
        StarbucksCustomer starbucksCustomer = new StarbucksCustomer();
        StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager();
        NeroCustomer neroCustomer = new NeroCustomer();
        NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
        StarbucksCoffeeSellManager starbucksCoffeeSellManager = new StarbucksCoffeeSellManager();
        NeroCoffeeSellManager neroCoffeeSellManager = new NeroCoffeeSellManager();
        starbucksLogManager starbucksLogManager = new starbucksLogManager();
        NeroLogManager neroLogManager = new NeroLogManager();

        starbucksCustomer.setFirstName("Özgür");
        starbucksCustomer.setLastName("SELAĞZI");
        starbucksCustomer.setId("12345");
        starbucksCustomer.setStarAmount(5);

        System.out.println("Müşteri adı: "+starbucksCustomer.getFirstName()+" "+starbucksCustomer.getLastName());
        System.out.println("Müşteri ID: "+starbucksCustomer.getId());
        System.out.println("Müşterinin yıldız sayısı: "+starbucksCustomer.getStarAmount());

        starbucksCustomerManager.addStarbucksCustomer(starbucksCustomer);
        starbucksCustomerManager.removeStarbucksCustomer(starbucksCustomer);
        starbucksCustomerManager.updateStarbucksCustomer(starbucksCustomer);
        starbucksCoffeeSellManager.buyCoffeeOnStarbucks(starbucksCustomer);

        starbucksLogManager.addToDataBase(starbucksCustomer);
        starbucksLogManager.removeFromDataBase(starbucksCustomer);
        starbucksLogManager.updateInDataBase(starbucksCustomer);

        System.out.println("-----------------------------------------------------------------------");

        neroCustomer.setFirstName("Engin");
        neroCustomer.setLastName("DEMİROĞ");
        neroCustomer.setId("67890");

        System.out.println("Müşteri adı: "+neroCustomer.getFirstName()+" "+neroCustomer.getLastName());
        System.out.println("Müşteri ID: "+neroCustomer.getId());

        neroCustomerManager.addNeroCustomer(neroCustomer);
        neroCustomerManager.removeNeroCustomer(neroCustomer);
        neroCustomerManager.updateNeroCustomer(neroCustomer);
        neroCoffeeSellManager.buyCoffeeOnNero(neroCustomer);

        neroLogManager.addToDataBase(neroCustomer);
        neroLogManager.removeFromDataBase(neroCustomer);
        neroLogManager.updateInDataBase(neroCustomer);

        System.out.println("-----------------------------------------------------------------------");


    }
}
