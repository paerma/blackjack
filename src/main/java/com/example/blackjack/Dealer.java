package com.example.blackjack;

public class Dealer extends Hand {


    @Override
    public boolean wantsToHit() {
        return getPoints() < 17;
    }
}
