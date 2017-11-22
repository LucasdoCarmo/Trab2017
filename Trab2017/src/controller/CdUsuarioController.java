package controller;

import java.io.IOException;

import com.lowagie.text.pdf.TextField;

import application.Main;
import dao.DaoFactory;
import dao.UsuarioDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import model.Usuario;

public class CdUsuarioController {

    @FXML
    private Button btnSalvar;

    @FXML
    private StackPane stack;

    @FXML
    private MenuItem miPCadastro;

    @FXML
    private MenuItem miProduto;

    @FXML
    private MenuItem miServico;

    @FXML
    private Button Cancelar;

    @FXML
    private Button btnExcluir;
    
    @FXML
    private TextField tfSenha;
    
    @FXML
    private TextField tfNome;

    @FXML
    private MenuItem miCliente;

    @FXML
    private BorderPane bpPrincipal;

    @FXML
    private MenuItem miFuncionario;

    private UsuarioDAO usuarioDAO;

	public CdUsuarioController() {
		usuarioDAO = DaoFactory.get().usuarioDAO();
	}

	@FXML
	void Voltar(ActionEvent event) {
		AbreTela("Principal.fxml");
	}

	@FXML
	void FinalizaCadastro(ActionEvent event) {
		Usuario usuario = novoUsuario();
		usuarioDAO.salva(usuario);
		AbreTela("Login.fxml");
	}

	private Usuario novoUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome(tfNome.getText());
		usuario.setSenha(tfSenha.getText());
		
		return usuario;
		
	}
    
   // ---------------------------------------------
    @FXML
    void onSalvar(ActionEvent event) {
    	Usuario usuario = novoUsuario();
		usuarioDAO.salvar(usuario);
		AbreTela("Login.fxml");
    }

    @FXML
    void onExcluir(ActionEvent event) {

    }

    @FXML
    void onCancelar(ActionEvent event) {

    }
  
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
