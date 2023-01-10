package com.fitin.patterns.c.FactoryMethod.api;

import com.fitin.patterns.c.FactoryMethod.dialog.Dialog;
import com.fitin.patterns.c.FactoryMethod.dialog.WebDialog;
import com.fitin.patterns.c.FactoryMethod.dialog.WindowsDialog;

import java.util.HashMap;
import java.util.Map;

public class FactoryMethodService {
    private final Map<ClientRequest, Dialog> dialogs = new HashMap<>();

    {
        dialogs.put(ClientRequest.WIN, new WindowsDialog());
        dialogs.put(ClientRequest.WEB, new WebDialog());
    }

    public Dialog initialize(ClientRequest request) {
        return dialogs.get(request);
    }
}
