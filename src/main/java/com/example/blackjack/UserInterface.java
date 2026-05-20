package com.example.blackjack;

import java.util.Scanner;

public class UserInterface {
    Table table;
    Scanner scanner;

    public UserInterface(Table table, Scanner scanner){
        this.table = table;
        this.scanner = scanner;
    }



    public void startGame(){
        boolean isRunning = true;
        while(isRunning) {
            table.startNewGame();
            System.out.println(table);

            boolean playerTurn = true;
            while(playerTurn) {

                if(!table.ifCanContinue()){
                    break;
                }
                System.out.println("1. hit \n2.stand");
                int output = Integer.parseInt(scanner.nextLine());
                if (output == 1) {
                    table.hitPlayer();
                    System.out.println(table.playerCards());
                    if(!table.ifCanContinue()) playerTurn = false;

                } else playerTurn = false;
            }
            table.getDealer().addHiddenCardToList();
            System.out.println(table.dealerCards());
            table.hitDealer();
            System.out.println(table.dealerCards());
            System.out.println(table.checkWinCondition() + " wins!");
            System.out.println("\n wanna continue? 1. yes 2. no");
            int output = Integer.parseInt(scanner.nextLine());
            if (output == 2) isRunning = false;
        }
    }
}
