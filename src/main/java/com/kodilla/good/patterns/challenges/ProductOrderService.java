package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {

    public OrderRequest orderRequest;

    public boolean order(final User user,
                         final Product product,
                         final LocalDate orderDate) {
        System.out.println("Order for: " + user.getFirstName() + user.getLastName() +
                ". Product: " + product.getProductName() +
                ". Order date: " + orderDate.toString());
        return true;
    }
}
