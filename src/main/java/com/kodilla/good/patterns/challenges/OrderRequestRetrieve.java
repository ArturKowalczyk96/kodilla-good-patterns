package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetrieve {

    public OrderRequest retrieve(){

        User user = new User("john1", "John", "Smith");

        Product product = new Product("Book", 19.50);

        //LocalDate orderDate = new LocalDate.of(2020, 12, 10);

        return new OrderRequest(user, product);
    }
}
