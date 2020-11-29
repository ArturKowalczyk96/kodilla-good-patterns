package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main (String[] args) {

        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new InformationServices(),
                new ProductOrderService(),
                new OrderRepository());
        orderProcessor.proces(orderRequest);
    }
}
