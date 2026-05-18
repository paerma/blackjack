package com.example.blackjack;


public class Card {
    private final int value;
    private final suits cardSuit;

    public Card(int value, suits cardSuit) {
        if(value < 1 || value > 11){
            throw new IllegalArgumentException("Неправильне значення карти: " + value + ". Має бути від 1 до 11.");
        }
        this.value = value;
        this.cardSuit = cardSuit;
    }
    public int getValue(){
        return value;
    }

    public String toString(){
       return cardSuit + " " + value;
    }
}