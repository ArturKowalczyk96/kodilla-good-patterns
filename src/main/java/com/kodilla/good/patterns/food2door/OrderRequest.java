package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRequest {

    private Shopper shopper;
    private Product product;

    public OrderRequest (Shopper shopper,
                         Product product){
        this.shopper = shopper;
        this.product = product;
    }

    public Shopper getShopper() {
        return shopper;
    }

    public Product getProduct() {
        return product;
    }

}
