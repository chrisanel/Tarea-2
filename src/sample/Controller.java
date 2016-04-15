package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class Controller {
    //@FXML private Button btn1;
    @FXML
    private Label n1;
    @FXML
    private Label ed1;
    @FXML
    private Label vot1;
    @FXML
    private Label n2;
    @FXML
    private TextArea t1;
    @FXML
    private TextArea t2;

    @FXML
    protected void imprimir (ActionEvent evento) {
        String n1=t1.getText();
        n2.setText(n1);
        String valor = t2.getText();
        int ed1 = Integer.parseInt(valor);

        if (ed1 >= 18) {
            vot1.setText("Puede Votar");
        }
        else if (ed1 < 18){
            vot1.setText("No Puede Votar");
        }



    }
}