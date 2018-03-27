package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
    public Label label;
    public Button sendButton;
    public Label contactNameLabel;
    public Label textLabel;
    public TextArea newText;

    public void sendText(ActionEvent actionEvent) {
        if (textLabel.getText() == null || textLabel.getText() == ""){
            textLabel.setText(newText.getText());
        } else {
            textLabel.setText(textLabel.getText() + "\n" + newText.getText());
        }
    }
}
