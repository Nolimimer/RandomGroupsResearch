import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LotteryController
{
    @FXML
    TextArea textArea;
    @FXML
    TextArea inputTextField;
    @FXML
    private static StringBuilder sb;

    static {
        LotteryController.sb = new StringBuilder();
    }

    @FXML
    public void generateClicked() throws ParseException {
        this.addElement(this.inputTextField.getText().split("\\r?\\n"));
    }

    @FXML
    public void change() {
        Main.primaryStage.setScene(Main.scene);
        Main.primaryStage.show();
    }

    private void addElement(final String... strings) throws ParseException {

        if (strings.length < 7) {
            LotteryController.sb.append(("Not enough participants" + "\n"));
            this.textArea.setText(LotteryController.sb.toString());
            return;
        } else {
            LotteryController.sb = new StringBuilder();
        }

        LinkedHashSet<Integer> winnerSet = new LinkedHashSet<>();

        for (int i = 0; i < 7; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt(strings.length)+1;
            System.out.println(randomNum);
            winnerSet.add(randomNum);
        }

        if (winnerSet.size() != 7) {
            System.out.println("Collision - New Try");
            addElement(strings);
            return;
        }

        for (int i = 0; i < 7; i++) {
            if (i < 5) {
                LotteryController.sb.append(winnerSet.toArray()[i] + ": Winner Amazon Coupon" +"\n");
                this.textArea.setText(LotteryController.sb.toString());
                continue;
            }
            if (i < 6) {
                LotteryController.sb.append( winnerSet.toArray()[i] + ": Winner Couples counseling" + "\n");
                this.textArea.setText(LotteryController.sb.toString());
                continue;
            }
            if (i < 7) {
                LotteryController.sb.append(winnerSet.toArray()[i] + ": Winner Candle Light Dinner" + "\n");
                this.textArea.setText(LotteryController.sb.toString());
                continue;
            }
        }
        LotteryController.sb.append("\n" + ("# Participants: " + strings.length));
        this.textArea.setText(LotteryController.sb.toString());

    }

}
