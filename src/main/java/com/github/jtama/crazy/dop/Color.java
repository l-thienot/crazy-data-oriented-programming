package com.github.jtama.crazy.dop;

public enum Color {
    SPADES("♠"),
    HEARTS("♥"),
    CLUBS("♣"),
    DIAMONDS("♦");

    private final String symbol;

    Color(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
