package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyEvent;

public class Controller {


    @FXML
    private Label idLabel1;
    @FXML
    private Label idLabel2;
    @FXML
    private PasswordField idPassword;

    private String textoLabel1;
    private String textoLabel2;
    private String textoPassword;



    @FXML
    private void onMouseEntredInLabel1(){
        idLabel1.setText("Ahora mi contenido es este");
        idLabel2.setText("Dentro");
    }

    @FXML
    private void onMouseExitedInLabel1(){
        idLabel1.setText("Ahora pongo otra cosa");
        idLabel2.setText("Fuera");
    }

    @FXML
    private void onMouseEntredInLabel2(){
        idLabel1.setText(idPassword.getText());
    }

    @FXML
    private void onMouseExitedInLabel2(){
        idLabel1.setText("Otra cosa");
    }

    @FXML
    private void onBotonPulsado(){
        textoLabel1 = idLabel1.getText();
        textoLabel2 = idLabel2.getText();
        textoPassword = idPassword.getText();
        idLabel1.setText("");
        idLabel2.setText("");
        idPassword.setText("");
    }

    @FXML
    private void onBotonSoltado(){
        idLabel1.setText(textoLabel1);
        idLabel2.setText(textoLabel2);
        idPassword.setText(textoPassword);
    }

    @FXML
    private void onKeyPressed(KeyEvent key){
        idLabel2.setText(key.getCharacter());
    }
}
