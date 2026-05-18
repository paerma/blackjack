package com.example.blackjack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();
        UserInterface ui = new UserInterface(table, scanner);
        ui.startGame();

    }
}
