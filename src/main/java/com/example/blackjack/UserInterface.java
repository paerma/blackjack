package com.example.blackjack;

public class UserInterface {
    Table table;

    public UserInterface(){
        table = new Table();
    }

    public void startGame(){
        table.start();
        System.out.println(table);
    }
}
