package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class PrincipalController {
	
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
		private StackPane stack;
	    
	    @FXML
		void onCliente(ActionEvent event) {
	    //	AbreTela("Cliente.fxml");
	    }
	    
	    
	    
	  
	    public void AbreTela(String tela) {
			stack.getChildren().clear();
			stack.getChildren().add(getNode(tela));
		}

		public Node getNode(String node) {
			Node no = null;
			try {
				no = FXMLLoader.load(getClass().getResource(Main.PATH_VIEW + node));
			} catch (Exception e) {
			}
			return no;

		}
	}


