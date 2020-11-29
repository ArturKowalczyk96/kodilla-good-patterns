package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class ProductOrderService {

    public OrderRequest orderRequest;

    public boolean order(final Shopper shopper,
                         final Product product) {
        System.out.println("Order for: " + shopper.getShopperName() +
                ". Product: " + product.getProductName());
        return true;
    }
}
