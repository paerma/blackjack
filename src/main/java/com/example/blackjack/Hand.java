package com.example.blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
    protected List<Card> cards = new ArrayList<>();
    private int points = 0;


    public void getStartCards(Card card){
        takeCard(card);
        takeCard(card);
    }
    public void takeCard(Card card){
        cards.add(card);
        countPoints();
    }

    public abstract boolean wantsToHit();



    public void countPoints(){
        for(Card i : cards){
            points += i.getValue();
        }
    }
    public int getPoints(){
        return points;
    }
    public String toString(){
        return "current cards: " + cards + "points: " + getPoints();
    }
    public List<Card> getCards(){
        return cards;
    }
}
