package com.example.blackjack;


public class Card {
    private final int value;
    private final Suits suit;

    public Card(int value, Suits cardSuit) {
        if(value < 1 || value > 11){
            throw new IllegalArgumentException("Illegal Card value: " + value + ". Must be in between from 1 to 11.");
        }
        this.value = value;
        this.suit = cardSuit;
    }
    public int getValue(){
        return value;
    }

    public Suits getSuit(){
        return suit;
    }
    public String toString(){
       return suit + " " + value;
    }
}