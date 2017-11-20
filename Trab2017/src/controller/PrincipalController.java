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
    private BorderPane Tela2;

    @FXML
    private MenuItem miPCadastro;

    @FXML
    private StackPane stack1;

    @FXML
    private MenuItem miProduto;

    @FXML
    private MenuItem miServico;

    @FXML
    private MenuItem miCliente;

    @FXML
    private MenuItem miFuncionario;

    @FXML
    void onCliente(ActionEvent event) {

    }
	    
	 
    
    
    
    
	    
	  //esquece e tentar fazer depois
	    /*public void AbreTela(String tela) {
			stack1.getChildren().clear();
			stack1.getChildren().add(getNode(tela));
		}

		public Node getNode(String node) {
			Node no = null;
			try {
				no = FXMLLoader.load(getClass().getResource(Main.PATH_VIEW + node));
			} catch (Exception e) {
			}
			return no;

		}*/
	}


