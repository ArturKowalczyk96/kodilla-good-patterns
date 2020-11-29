package com.kodilla.good.patterns.challenges;

import java.util.stream.*;

public class MainApp {
    public static void main(String[] args) {

        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new InformationService(),
                new ProductOrderService(),
                new OrderRepository());
        orderProcessor.proces(orderRequest);
    }
}
/*
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String theMovieStoreTitles = movieStore.getMovies().values().stream()
                .flatMap(m -> m.stream())
                .collect(Collectors.joining("!","",""));
        System.out.println(theMovieStoreTitles);
    }
 */