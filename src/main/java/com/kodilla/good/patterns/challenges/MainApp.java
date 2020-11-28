package com.kodilla.good.patterns.challenges;

import java.util.stream.*;

public class MainApp {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String theMovieStoreTitles = movieStore.getMovies().values().stream()
                .flatMap(m -> m.stream())
                .collect(Collectors.joining("!"," "," "));
        System.out.println(theMovieStoreTitles);
    }
}
