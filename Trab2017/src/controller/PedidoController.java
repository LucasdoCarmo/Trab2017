package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class PedidoController {

    @FXML
    private StackPane stack;

    @FXML
    private MenuItem miPCadastro;

    @FXML
    private MenuItem miProduto;

    @FXML
    private MenuItem miServico;

    @FXML
    private MenuItem miCliente;

    @FXML
    private BorderPane bpPrincipal;

    @FXML
    private MenuItem miFuncionario;

    @FXML
	void onCadastro(ActionEvent event) {
		AbreTela("Cadastro.fxml");
	}

	@FXML
	void onCliente(ActionEvent event) {
		AbreTela("Cliente.fxml");
	}

	@FXML
	void onFuncionario(ActionEvent event) {
		AbreTela("Funcionario.fxml");
	}

	@FXML
	void onProduto(ActionEvent event) {
		
		AbreTela("Produto.fxml");
	}

	@FXML
	void onServico(ActionEvent event) {
		
		AbreTela("Servico.fxml");
	}

	public void AbreTela(String tela) {
		//limpa tela
		stack.getChildren().clear();
		try {
			//acha a tela
			Node no = FXMLLoader.load(getClass().getResource(Main.PATH_VIEW + tela));
			//adiciona a tela nova
			stack.getChildren().add(no);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
