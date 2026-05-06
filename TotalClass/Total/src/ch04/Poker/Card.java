package ch04.Poker;

import java.util.Arrays;
import java.util.Random;

class Card {
    private int pattern;
    private int number;

    public Card(int p, int n) {
        pattern = p;
        number=n;
    }
    public String toString() {
        String[] p={"♠","◆","♣","♥"};
        String[] n={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        return p[pattern] + n[number];
    }
}

class Deck {
    Card[] cards = new Card[52];
    private Random r = new Random();
    Deck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[i*13+j] = new Card(i,j);
            }
        }
    }

    void shuffle() {
        for (int i = cards.length-1; i >0; i--) {
            int j = r.nextInt(i+1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public String toString() { //배열에있는거 싹다 문자열로 리턴
        return Arrays.toString(cards);
    }
}

class Players {
    private Card[] hand;
    Players(int size) {
        hand = new Card[size];
    }

    void setHand(int i, Card card) {
        hand[i] = card;
    }

    public String toString() {
        return Arrays.toString(hand);
    }
}