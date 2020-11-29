package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRequestRetrieve {
    public OrderRequest retrieve(){

        Shopper shopper = new Shopper("ExtraFoodShop", "Street 1, 00-000");

        Product product = new Product("Book", "ExtraFoodShop", 100);

        return new OrderRequest(shopper, product);
    }
}
