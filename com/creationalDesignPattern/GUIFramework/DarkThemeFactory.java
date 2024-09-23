package com.creationalDesignPattern.GUIFramework;

public class DarkThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkTextBox();
    }
}

