package com.example.MyBookShopApp.enums;

public enum Constants {
    ENGLISH_LETTERS("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");

    private final String letters;

    Constants(String letters) {
        this.letters = letters;
    }

    public String getLetters() {
        return letters;
    }
}
