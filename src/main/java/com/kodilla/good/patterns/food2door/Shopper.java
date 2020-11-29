package com.kodilla.good.patterns.food2door;

public class Shopper {
    private String shopperName;
    private String shopperAddress;

    public Shopper (final String shopperName,
                 final String shopperAddress){
        this.shopperName = shopperName;
        this.shopperAddress = shopperAddress;

    }

    public String getShopperName() {
        return shopperName;
    }

    public String getShopperAddress() {
        return shopperAddress;
    }
}

