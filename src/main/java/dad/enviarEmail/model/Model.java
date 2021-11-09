package dad.enviarEmail.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	private StringProperty nombreServidorProperty;
	
	private IntegerProperty puertoProperty;
	
	private BooleanProperty SSLConexionProperty;
	
	private StringProperty emailRemitenteProperty;
	
	private StringProperty contraseñaRemitenteProperty;
	
	private StringProperty emailDestinatarioProperty;
	
	private StringProperty asuntoProperty;
	
	private StringProperty mensajeProperty;
	
	public Model() {
		nombreServidorProperty = new SimpleStringProperty();
		puertoProperty = new SimpleIntegerProperty();
		
		SSLConexionProperty = new SimpleBooleanProperty();
		
		emailRemitenteProperty = new SimpleStringProperty();
		contraseñaRemitenteProperty = new SimpleStringProperty();
		
		emailDestinatarioProperty = new SimpleStringProperty();
		
		asuntoProperty = new SimpleStringProperty();
		
		mensajeProperty = new SimpleStringProperty();
	}

	public final StringProperty nombreServidorPropertyProperty() {
		return this.nombreServidorProperty;
	}
	

	public final String getNombreServidorProperty() {
		return this.nombreServidorPropertyProperty().get();
	}
	

	public final void setNombreServidorProperty(final String nombreServidorProperty) {
		this.nombreServidorPropertyProperty().set(nombreServidorProperty);
	}
	

	public final IntegerProperty puertoPropertyProperty() {
		return this.puertoProperty;
	}
	

	public final int getPuertoProperty() {
		return this.puertoPropertyProperty().get();
	}
	

	public final void setPuertoProperty(final int puertoProperty) {
		this.puertoPropertyProperty().set(puertoProperty);
	}
	

	public final BooleanProperty SSLConexionPropertyProperty() {
		return this.SSLConexionProperty;
	}
	

	public final boolean isSSLConexionProperty() {
		return this.SSLConexionPropertyProperty().get();
	}
	

	public final void setSSLConexionProperty(final boolean SSLConexionProperty) {
		this.SSLConexionPropertyProperty().set(SSLConexionProperty);
	}
	

	public final StringProperty emailRemitentePropertyProperty() {
		return this.emailRemitenteProperty;
	}
	

	public final String getEmailRemitenteProperty() {
		return this.emailRemitentePropertyProperty().get();
	}
	

	public final void setEmailRemitenteProperty(final String emailRemitenteProperty) {
		this.emailRemitentePropertyProperty().set(emailRemitenteProperty);
	}
	

	public final StringProperty contraseñaRemitentePropertyProperty() {
		return this.contraseñaRemitenteProperty;
	}
	

	public final String getContraseñaRemitenteProperty() {
		return this.contraseñaRemitentePropertyProperty().get();
	}
	

	public final void setContraseñaRemitenteProperty(final String contraseñaRemitenteProperty) {
		this.contraseñaRemitentePropertyProperty().set(contraseñaRemitenteProperty);
	}
	

	public final StringProperty emailDestinatarioPropertyProperty() {
		return this.emailDestinatarioProperty;
	}
	

	public final String getEmailDestinatarioProperty() {
		return this.emailDestinatarioPropertyProperty().get();
	}
	

	public final void setEmailDestinatarioProperty(final String emailDestinatarioProperty) {
		this.emailDestinatarioPropertyProperty().set(emailDestinatarioProperty);
	}
	

	public final StringProperty asuntoPropertyProperty() {
		return this.asuntoProperty;
	}
	

	public final String getAsuntoProperty() {
		return this.asuntoPropertyProperty().get();
	}
	

	public final void setAsuntoProperty(final String asuntoProperty) {
		this.asuntoPropertyProperty().set(asuntoProperty);
	}
	

	public final StringProperty mensajePropertyProperty() {
		return this.mensajeProperty;
	}
	

	public final String getMensajeProperty() {
		return this.mensajePropertyProperty().get();
	}
	

	public final void setMensajeProperty(final String mensajeProperty) {
		this.mensajePropertyProperty().set(mensajeProperty);
	}
}
