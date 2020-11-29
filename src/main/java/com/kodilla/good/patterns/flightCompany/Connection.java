package com.kodilla.good.patterns.flightCompany;

import java.util.Objects;

public class Connection {

    private City from;
    private City to;

    public Connection (final City from,
                       final City to){
        this.from = from;
        this.to = to;
    }

    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connection that = (Connection) o;
        return Objects.equals(from, that.from) &&
                Objects.equals(to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        return "Connection{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
