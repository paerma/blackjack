package com.example.blackjack;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class CardController {
    @FXML private Text rankLabel1, rankLabel2;

    public void setCardData(Card card) {
        if(card.getSuit().getColor().equals("red")) {
            rankLabel1.setFill(Color.RED);
            rankLabel2.setFill(Color.RED);
        }
            else {
            rankLabel1.setFill(Color.BLACK);
            rankLabel2.setFill(Color.BLACK);
        }
        rankLabel1.setText(card.getValue() + " " + card.getSuit().getSymbol());
        rankLabel2.setRotate(180);
        rankLabel2.setText(card.getValue() + " " + card.getSuit().getSymbol());
    }
}
