package com.example.blackjack;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.List;

public class BlackJackController {
    @FXML
    private VBox menu, mainStage;
    @FXML
    private Text DealerCard1, DealerCard2, DealerCard3, PlayerCard1, PlayerCard2, PlayerCard3;
    @FXML
    private HBox dealerCardsBox, playerCardsBox;
    @FXML
    private Button stand;
    private Table table;


    @FXML
    protected void onStartButtonClick() {

        menu.setVisible(false);
        table = new Table();
        table.startNewGame();
        DealerCard1.setText(table.getDealerCard(0).toString());
        PlayerCard1.setText(table.getPlayerCard(0).toString());
        PlayerCard2.setText(table.getPlayerCard(1).toString());

        mainStage.setVisible(true);

    }

    @FXML
    protected void onHitClick() {
        table.hitPlayer();
        UpdateUI();
        if(table.ifCanContinue()){

        }

    }

    @FXML
    protected void onStandClick() {
        stand.setDisable(true);
        table.getDealer().addHiddenCardToList();
        UpdateUI();
        while(table.getDealer().getPoints() < 17) {
            table.hitDealer();
            UpdateUI();
        }
        System.out.println(table.checkWinCondition());


    }

    @FXML
    protected void UpdateUI() {
        dealerCardsBox.getChildren().clear();

        List<Card> cards = table.getDealer().getCards();

        for (Card c : cards) {
            Text cardText = new Text(c.toString());
            cardText.setStyle("-fx-border-color: black; -fx-padding: 5; -fx-font-size: 16;");
            dealerCardsBox.getChildren().add(cardText);
        }

        playerCardsBox.getChildren().clear();

        List<Card> cards1 = table.getPlayer().getCards();

        for (Card c : cards1) {
            Text cardText = new Text(c.toString());
            cardText.setStyle("-fx-border-color: black; -fx-padding: 5; -fx-font-size: 16;");
            playerCardsBox.getChildren().add(cardText);
        }
    }
}
