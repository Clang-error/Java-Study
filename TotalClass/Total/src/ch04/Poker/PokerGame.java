package ch04.Poker;

import java.util.Arrays;

public class PokerGame {
    int PLAYER = 5, CARDS = 7;
    Deck deck = new Deck();
    Players[] player=new Players[PLAYER];
    public PokerGame() {
        deck.shuffle();
        System.out.println(deck);
        createPlayers();
        deal();
        System.out.println(this);
    }

    void createPlayers() {
        for(int i = 0; i< PLAYER; i++) {
            player[i] = new Players(CARDS);
        }
    }

    void deal() {
        for(int i=0;i<CARDS;i++) {
            for(int j = 0; j< PLAYER; j++) {
                player[j].setHand(i, deck.cards[i*PLAYER+j]);
            }
        }
    }
    public String toString() {
        return Arrays.toString(player);
    }
    public static void main(String[] args) {
        new PokerGame();
    }
}
