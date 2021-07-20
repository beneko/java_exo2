package org.afpa.gui;

import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.InputMethodEvent;

public class FormController {

    public TextField inputText;
    public TitledPane choix;
    public TitledPane casse;
    public TitledPane texte;
    public TitledPane fond;

    public void saisir(InputMethodEvent inputMethodEvent) {
        choix.setDisable(false);
    }
}
