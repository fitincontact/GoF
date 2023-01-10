package com.fitin.patterns.c.FactoryMethod.dialog;

import com.fitin.patterns.c.FactoryMethod.button.Button;
import com.fitin.patterns.c.FactoryMethod.button.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
