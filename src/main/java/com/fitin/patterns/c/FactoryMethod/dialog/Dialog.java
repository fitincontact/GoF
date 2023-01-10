package com.fitin.patterns.c.FactoryMethod.dialog;

import com.fitin.patterns.c.FactoryMethod.button.Button;

public abstract class Dialog {
    public Button render() {
        var okButton = createButton();
        okButton.onClick();
        okButton.render();
        return okButton;
    }

    abstract Button createButton();
}
