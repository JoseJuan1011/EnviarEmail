package dad.enviarEmail.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class View implements Initializable {
	
	@FXML
    private TextField asuntoTextField;

    @FXML
    private Button cerrarButton;

    @FXML
    private TextField contraseñaTextField;

    @FXML
    private TextField destinatarioTextField;

    @FXML
    private Button enviarButton;

    @FXML
    private TextArea mensajeTextArea;

    @FXML
    private TextField nombreServidorTextField;

    @FXML
    private TextField puertoTextField;

    @FXML
    private TextField remitenteTextField;

    @FXML
    private CheckBox sslCheckBox;

    @FXML
    private Button vaciarButton;

    @FXML
    private GridPane view;

    public View() {	
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EnviarEmail.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
    
    public TextField getAsuntoTextField() {
		return asuntoTextField;
	}

	public Button getCerrarButton() {
		return cerrarButton;
	}

	public TextField getContraseñaTextField() {
		return contraseñaTextField;
	}

	public TextField getDestinatarioTextField() {
		return destinatarioTextField;
	}

	public Button getEnviarButton() {
		return enviarButton;
	}

	public TextArea getMensajeTextArea() {
		return mensajeTextArea;
	}

	public TextField getNombreServidorTextField() {
		return nombreServidorTextField;
	}

	public TextField getPuertoTextField() {
		return puertoTextField;
	}

	public TextField getRemitenteTextField() {
		return remitenteTextField;
	}

	public CheckBox getSslCheckBox() {
		return sslCheckBox;
	}

	public Button getVaciarButton() {
		return vaciarButton;
	}

	public GridPane getView() {
		return view;
	}
}
