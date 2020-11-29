package com.kodilla.good.patterns.food2door;

public class OrderDto {

    private Shopper shopper;
    private boolean isOrdered;

    public OrderDto (final Shopper shopper,
                     final boolean isOrdered){
        this.shopper = shopper;
        this.isOrdered = isOrdered;
    }

    public Shopper getShopper() {
        return shopper;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
