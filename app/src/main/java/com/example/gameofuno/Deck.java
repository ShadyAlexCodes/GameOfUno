package com.example.gameofuno;

import java.util.ArrayList;

public class Deck {

    private ArrayList<String> unoDeck = new ArrayList<>();
    private ArrayList<String> usedDeck = new ArrayList<>();


    public void populateDeck() {
        //0's
        unoDeck.add("Red 0");
        unoDeck.add("Yellow 0");
        unoDeck.add("Blue 0");
        unoDeck.add("Green 0");
        //1's
        unoDeck.add("Red 1");
        unoDeck.add("Red 1");
        unoDeck.add("Yellow 1");
        unoDeck.add("Yellow 1");
        unoDeck.add("Blue 1");
        unoDeck.add("Blue 1");
        unoDeck.add("Green 1");
        unoDeck.add("Green 1");
        //2's
        unoDeck.add("Red 2");
        unoDeck.add("Red 2");
        unoDeck.add("Yellow 2");
        unoDeck.add("Yellow 2");
        unoDeck.add("Blue 2");
        unoDeck.add("Blue 2");
        unoDeck.add("Green 2");
        unoDeck.add("Green 2");
        //3's
        unoDeck.add("Red 3");
        unoDeck.add("Red 3");
        unoDeck.add("Yellow 3");
        unoDeck.add("Yellow 3");
        unoDeck.add("Blue 3");
        unoDeck.add("Blue 3");
        unoDeck.add("Green 3");
        unoDeck.add("Green 3");
        //4's
        unoDeck.add("Red 4");
        unoDeck.add("Red 4");
        unoDeck.add("Yellow 4");
        unoDeck.add("Yellow 4");
        unoDeck.add("Blue 4");
        unoDeck.add("Blue 4");
        unoDeck.add("Green 4");
        unoDeck.add("Green 4");
        //5's
        unoDeck.add("Red 5");
        unoDeck.add("Red 5");
        unoDeck.add("Yellow 5");
        unoDeck.add("Yellow 5");
        unoDeck.add("Blue 5");
        unoDeck.add("Blue 5");
        unoDeck.add("Green 5");
        unoDeck.add("Green 5");
        //6's
        unoDeck.add("Red 6");
        unoDeck.add("Red 6");
        unoDeck.add("Yellow 6");
        unoDeck.add("Yellow 6");
        unoDeck.add("Blue 6");
        unoDeck.add("Blue 6");
        unoDeck.add("Green 6");
        unoDeck.add("Green 6");
        //7's
        unoDeck.add("Red 7");
        unoDeck.add("Red 7");
        unoDeck.add("Yellow 7");
        unoDeck.add("Yellow 7");
        unoDeck.add("Blue 7");
        unoDeck.add("Blue 7");
        unoDeck.add("Green 7");
        unoDeck.add("Green 7");
        //8's
        unoDeck.add("Red 8");
        unoDeck.add("Red 8");
        unoDeck.add("Yellow 8");
        unoDeck.add("Yellow 8");
        unoDeck.add("Blue 8");
        unoDeck.add("Blue 8");
        unoDeck.add("Green 8");
        unoDeck.add("Green 8");
        //9's
        unoDeck.add("Red 9");
        unoDeck.add("Red 9");
        unoDeck.add("Yellow 9");
        unoDeck.add("Yellow 9");
        unoDeck.add("Blue 9");
        unoDeck.add("Blue 9");
        unoDeck.add("Green 9");
        unoDeck.add("Green 9");
        //skip's
        unoDeck.add("Red Skip");
        unoDeck.add("Red Skip");
        unoDeck.add("Yellow Skip");
        unoDeck.add("Yellow Skip");
        unoDeck.add("Blue Skip");
        unoDeck.add("Blue Skip");
        unoDeck.add("Green Skip");
        unoDeck.add("Green Skip");
        //reverse's
        unoDeck.add("Red Reverse");
        unoDeck.add("Red Reverse");
        unoDeck.add("Yellow Reverse");
        unoDeck.add("Yellow Reverse");
        unoDeck.add("Blue Reverse");
        unoDeck.add("Blue Reverse");
        unoDeck.add("Green Reverse");
        unoDeck.add("Green Reverse");
        //draw 2's
        unoDeck.add("Red Draw 2");
        unoDeck.add("Red Draw 2");
        unoDeck.add("Yellow Draw 2");
        unoDeck.add("Yellow Draw 2");
        unoDeck.add("Blue Draw 2");
        unoDeck.add("Blue Draw 2");
        unoDeck.add("Green Draw 2");
        unoDeck.add("Green Draw 2");
        //wild's
        unoDeck.add("Wild");
        unoDeck.add("Wild");
        unoDeck.add("Wild");
        unoDeck.add("Wild");
        //draw 4's
        unoDeck.add("Draw 4");
        unoDeck.add("Draw 4");
        unoDeck.add("Draw 4");
        unoDeck.add("Draw 4");
    }

    public ArrayList<String> getUnoDeck() {
        return unoDeck;
    }

    public ArrayList<String> getUsedDeck() {
        return usedDeck;
    }

    public void setUsedDeck(ArrayList<String> usedDeck) {
        this.usedDeck = usedDeck;
    }
}
