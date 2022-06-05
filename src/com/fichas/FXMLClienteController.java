package com.fichas;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author ravar
 */
public class FXMLClienteController implements Initializable {

    @FXML
    private Button buttonConectar;
    @FXML
    private Label labelClienteID;
    @FXML
    private Label labelClienteStatus;
    @FXML
    private TextField textFieldIP;
    @FXML
    private TextField textFieldPorta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void handleButtonConectar() throws IOException, ClassNotFoundException{
        String ip = this.textFieldIP.getText();
        int porta = Integer.parseInt(this.textFieldPorta.getText());

        ThreadSocketsCliente threadSocketsCliente = new ThreadSocketsCliente(ip, porta, this.labelClienteID, this.labelClienteStatus);
        threadSocketsCliente.start();
    }

}
