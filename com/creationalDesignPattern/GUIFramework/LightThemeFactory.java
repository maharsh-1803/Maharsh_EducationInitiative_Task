package com.creationalDesignPattern.GUIFramework;

public class LightThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightTextBox();
    }
}

