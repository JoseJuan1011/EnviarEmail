package dad.enviarEmail.controller;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import dad.enviarEmail.model.Model;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class Controller {

	private View view;
	
	private Model model;
	
	public Controller() {
		view = new View();
		
		model = new Model();
		
		view.getEnviarButton().setOnAction(e -> onEnviarAction());
		
		view.getVaciarButton().setOnAction(e -> onVaciarAction());
		
		view.getCerrarButton().setOnAction(e -> onCerrarAction());
		
		Bindings();
	}

	private void Bindings() {	
		view.getNombreServidorTextField().textProperty().bindBidirectional(model.nombreServidorPropertyProperty());
		view.getPuertoTextField().textProperty().bindBidirectional(model.puertoPropertyProperty(), new NumberStringConverter());
		
		view.getSslCheckBox().selectedProperty().bindBidirectional(model.SSLConexionPropertyProperty());
		
		view.getRemitenteTextField().textProperty().bindBidirectional(model.emailRemitentePropertyProperty());
		view.getContraseñaTextField().textProperty().bindBidirectional(model.contraseñaRemitentePropertyProperty());
		
		view.getDestinatarioTextField().textProperty().bindBidirectional(model.emailDestinatarioPropertyProperty());
		
		view.getAsuntoTextField().textProperty().bindBidirectional(model.asuntoPropertyProperty());
		
		view.getMensajeTextArea().textProperty().bindBidirectional(model.mensajePropertyProperty());
	}

	private void onEnviarAction() {
		try {
			Email email = new SimpleEmail();
			email.setHostName(model.getNombreServidorProperty());
			email.setSmtpPort(model.getPuertoProperty());
			
			email.setAuthenticator(new DefaultAuthenticator(model.getEmailRemitenteProperty(),model.getContraseñaRemitenteProperty()));
			
			email.setSSLOnConnect(model.isSSLConexionProperty());
			
			email.setFrom(model.getEmailRemitenteProperty());
			
			email.setSubject(model.getAsuntoProperty());
			email.setMsg(model.getMensajeProperty());
			
			email.addTo(model.getEmailDestinatarioProperty());
			
			email.send();
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("Mensaje enviado con éxito a "+"\""+model.getEmailDestinatarioProperty()+"\"");
			alert.showAndWait();
		} catch (EmailException e) {
			Alert alert = new Alert(AlertType.ERROR, e.getMessage());
			alert.setHeaderText("No se pudo enviar el email.");
			alert.showAndWait();
		}
	}

	private void onVaciarAction() {
		view.getNombreServidorTextField().clear();
		view.getPuertoTextField().clear();
		
		view.getSslCheckBox().setSelected(false);
		
		view.getRemitenteTextField().clear();
		view.getContraseñaTextField().clear();
		
		view.getDestinatarioTextField().clear();
		
		view.getAsuntoTextField().clear();
		
		view.getMensajeTextArea().clear();
	}

	private void onCerrarAction() {
		System.exit(0);
	}	
	
	public GridPane getView() {
		return view.getView();
	}
}
