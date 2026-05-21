package com.example.blackjack;

public enum Suits {
    HEARTS("♥", "red"),
    DIAMONDS("♦", "red"),
    CLUBS("♣", "black"),
    SPADES("♠", "black");

    private final String symbol;
    private final String color;

    Suits(String symbol, String color){
        this.color = color;
        this.symbol = symbol;
    }
    public String getSymbol(){
        return symbol;
    }
    public String getColor(){
        return color;
    }
}
