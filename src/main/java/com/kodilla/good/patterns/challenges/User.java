package com.kodilla.good.patterns.challenges;

public class User {

    private String nick;
    private String firstName;
    private String lastName;

    public User(final String nick, final String firstName,
                final String lastName){
        this.nick = nick;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
