package com.fitin.patterns.c.FactoryMethod.dialog;

import com.fitin.patterns.c.FactoryMethod.button.Button;
import com.fitin.patterns.c.FactoryMethod.button.HTMLButton;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
