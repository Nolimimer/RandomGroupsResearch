package mschottGenerator;

import java.util.Random;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MainAppController
{
    @FXML
    TextArea textArea;
    @FXML
    TextField inputTextField;
    private static StringBuilder sb;
    private static final String intervention = "Interventionsgruppe";
    private static final String control = "Kontrollgruppe";
    private final Random random;
    
    static {
        MainAppController.sb = new StringBuilder("");
    }
    
    public MainAppController() {
        this.random = new Random();
    }
    
    @FXML
    public void generateClicked() {
        this.addElement(this.inputTextField.getText().split(","));
    }
    
    private void addElement(final String... strings) {
        for (final String s : strings) {
            final String string = String.valueOf(s) + " " + RandomString.getAlphaNumericString(8) + " " + this.next() + " \n";
            MainAppController.sb.append(string);
            this.textArea.setText(MainAppController.sb.toString());
        }
    }
    
    private String next() {
        if (this.random.nextBoolean()) {
            return "Interventionsgruppe";
        }
        return "Kontrollgruppe";
    }
}
