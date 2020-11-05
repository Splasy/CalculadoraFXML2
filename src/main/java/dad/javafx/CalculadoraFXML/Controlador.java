package dad.javafx.CalculadoraFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class Controlador implements Initializable {

	Calculadora cal = new Calculadora();
	FXMLLoader loader;

	public Controlador() throws IOException {
		loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
		loader.setController(this);
		loader.load();

	}

	@FXML
	private GridPane view;

	
	
	@FXML
	private TextField numerosText;

	@FXML
	private Button ochoBoton;

	@FXML
	private Button sieteBoton;

	@FXML
	private Button nueveBoton;

	@FXML
	private Button cuatroBoton;

	@FXML
	private Button cincoBoton;

	@FXML
	private Button seisBoton;

	@FXML
	private Button borrarTodo;

	@FXML
	private Button multBoton;

	@FXML
	private Button borrar;

	@FXML
	private Button igualBoton;

	@FXML
	private Button comaBoton;

	@FXML
	private Button masBoton;

	@FXML
	private Button ceroBoton;

	@FXML
	private Button divBoton;

	@FXML
	private Button unoBoton;

	@FXML
	private Button dosBoton;

	@FXML
	private Button tresBoton;

	@FXML
	private Button restaBoton;

	@FXML
	void onBorrarAction(ActionEvent event) {
		cal.borrar();
		numerosText.setText(cal.getPantalla());

	}

	@FXML
	void onBorrarTodoAction(ActionEvent event) {
		cal.borrarTodo();
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onCeroAction(ActionEvent event) {
		cal.insertar('0');
		numerosText.setText(cal.getPantalla());

	}

	@FXML
	void onCincoAction(ActionEvent event) {
		cal.insertar('5');
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onComaAction(ActionEvent event) {
		cal.insertarComa();
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onCuatroAction(ActionEvent event) {
		cal.insertar('4');
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onDivisionAction(ActionEvent event) {
		cal.operar(Calculadora.DIVIDIR);
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onDosAction(ActionEvent event) {
		cal.insertar('2');
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onIgualAction(ActionEvent event) {
		cal.operar(Calculadora.IGUAL);
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onMultiplicacionAction(ActionEvent event) {
		cal.operar(Calculadora.MULTIPLICAR);
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onNueveAction(ActionEvent event) {
		cal.insertar('9');
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onOchoAction(ActionEvent event) {
		cal.insertar('8');
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onRestaAction(ActionEvent event) {
		cal.operar(Calculadora.RESTAR);
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onSeisAction(ActionEvent event) {
		cal.insertar('6');
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onSieteAction(ActionEvent event) {
		cal.insertar('7');
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onSumaAction(ActionEvent event) {
		cal.operar(Calculadora.SUMAR);
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onTresAction(ActionEvent event) {
		cal.insertar('3');
		numerosText.setText(cal.getPantalla());
	}

	@FXML
	void onUnoAction(ActionEvent event) {
		cal.insertar('1');
		numerosText.setText(cal.getPantalla());
	}

	public GridPane getView() {
		return view;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
