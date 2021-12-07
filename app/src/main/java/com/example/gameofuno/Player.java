package com.example.gameofuno;

import java.util.ArrayList;

public class Player {

    private String playerName;
    private ArrayList<String> playerHand = new ArrayList<>();

    public Player(String playerName, ArrayList<String> playerHand) {
        this.playerName = playerName;
        this.playerHand = playerHand;
    }

    public void setPlayerName(String playerName)
    {
        if(playerName == null || playerName.isEmpty()) {
            throw new IllegalArgumentException("A player name must be set for the game to continue!");
        }

        this.playerName = playerName;
    }

    public void setPlayerHand(ArrayList<String> playerHand) {
        this.playerHand = playerHand;
    }

    public String getPlayerName() {
        return playerName;
    }

    public ArrayList<String> getPlayerHand() {
        return playerHand;
    }
}
