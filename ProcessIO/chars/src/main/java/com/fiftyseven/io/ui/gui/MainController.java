package com.fiftyseven.io.ui.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import com.fiftyseven.io.model.*;

/**
 * FXML Controller class
 *
 * @author jason
 */
public class MainController {

    @FXML
    private Label countResults;
    @FXML
    private TextField inputWord;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void initialize() {
        // TODO
    }

    @FXML
    private void countCharacters() {

        String word = inputWord.getText();

        if (word.isEmpty() || word.isBlank()) {
            countResults.setText("");
        } else {
            Counter c = Counter.valueOf(inputWord.getText());
            countResults.setText(c.getDetails());
        }
    }

}
