package com.example.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Hand> players;
    private Deck deck;

    public Table(){
        players = new ArrayList<>();
        players.add(new Player());
        players.add(new Dealer());
        deck = new Deck();
    }
    public void start(){
        Card takenCard = deck.giveCard();
        for(Hand p : players){
            p.getStartCards(takenCard);
        }
    }

    public void hit(){
        Card takenCard = deck.giveCard();
        
    }
    public String toString(){
        String result = "";
        for(Hand p : players){
             result += p.toString() + "\n";
        }
        return result;
    }




}

