package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PrincipalController {

	@FXML
	private StackPane stack1;

	@FXML
	private BorderPane Tela2;

	@FXML
	private MenuItem miCliente;

	@FXML
	private MenuItem miFuncionario;

	@FXML
	private MenuItem miProduto;

	@FXML
	private MenuItem miServico;

	@FXML
	private MenuItem miPCadastro;

	@FXML
	private StackPane stack;

	@FXML
	void onCadastro(ActionEvent event) {
		Node node2 = (Node) event.getSource();
		Stage stage = (Stage) node2.getScene().getWindow();
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));

		} catch (IOException ex) {
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	void onCliente(ActionEvent event) {
		Node node3 = (Node) event.getSource();
		Stage stage = (Stage) node3.getScene().getWindow();
		Parent root = null;
		try {
			if (LoginController.getStage() != null) {
				LoginController.getStage().close();
			}
			root = FXMLLoader.load(getClass().getResource("Cliente.fxml"));

		} catch (IOException ex) {
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void onFuncionario(ActionEvent event) {
		Node node = (Node) event.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("Funcionario.fxml"));

		} catch (IOException ex) {
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void onProduto(ActionEvent event) {
		/*Node node = (Node) event.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("Produto.fxml"));

		} catch (IOException ex) {
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();*/
		AbreTela("Produto.fxml");
	}

	@FXML
	void onServico(ActionEvent event) {
		// Node node = (Node) event.getSource();
		// Stage stage = (Stage) node.getScene().getWindow();
		// Parent root = null;
		// try {
		// if(LoginController.getStage() != null){
		// LoginController.getStage().close();
		// }
		// root = FXMLLoader.load(getClass().getResource("Servico.fxml"));
		//
		// } catch (IOException ex) {
		// }
		// Scene scene = new Scene(root);
		// stage.setScene(scene);
		// stage.show();
		AbreTela("Servico.fxml");
	}

	public void AbreTela(String tela) {
		stack.getChildren().clear();
		try {
			Node no = FXMLLoader.load(getClass().getResource(Main.PATH_VIEW + tela));
			stack.getChildren().add(no);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
