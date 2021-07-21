package org.afpa.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

public class FormController {

    public TextField inputText;
    public TitledPane choix;
    public TitledPane casse;
    public TitledPane texte;
    public TitledPane fond;
    public CheckBox couleurFond;
    public CheckBox couleurTexte;
    public CheckBox choixCasse;
    public RadioButton minuscule;
    public RadioButton majuscule;
    public RadioButton rougeTexte;
    public RadioButton blancTexte;
    public RadioButton noirTexte;
    public RadioButton rougeFond;
    public RadioButton vertFond;
    public RadioButton bleuFond;
    public Label label;
    public ToggleGroup group1;
    public ToggleGroup group2;
    public ToggleGroup group3;

    public void saisir(KeyEvent inputMethodEvent) {

        inputText = (TextField) inputMethodEvent.getSource();
        String fieldTexte = inputText.getText();
        label.setVisible(true);
        label.setText(fieldTexte);
        choix.setDisable(false);
        change();
    }

    public void activBlocs(ActionEvent actionEvent) {

        fond.setDisable(!couleurFond.isSelected());
        texte.setDisable(!couleurTexte.isSelected());
        casse.setDisable(!choixCasse.isSelected());

    }

    public void activeCasse(ActionEvent actionEvent) {

        if(minuscule.isSelected()){
            label.setText(inputText.getText().toLowerCase());
        }
        if(majuscule.isSelected()){
            label.setText(inputText.getText().toUpperCase());
        }
    }

    public void activeStyle(ActionEvent actionEvent) {
        change();
    }


    public void change(){
        String style = "";
        if (rougeFond.isSelected()){
            style += "-fx-background-color: red; ";
        }
        if(vertFond.isSelected()){
            style += "-fx-background-color: green; ";
        }
        if(bleuFond.isSelected()){
            style += "-fx-background-color: blue; ";
        }

        if (blancTexte.isSelected()){
            style += "-fx-text-fill: white; ";
        }
        if(rougeTexte.isSelected()){
            style += "-fx-text-fill: red; ";

        }
        if(noirTexte.isSelected()){
            style += "-fx-text-fill: black; ";
        }


        label.setStyle(style);
    }
}
