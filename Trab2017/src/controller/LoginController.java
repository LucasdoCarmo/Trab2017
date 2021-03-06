package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import application.Main;
import componente.Alerta;
import conexao.Conexao;
import conexao.ConexaoProducao;
import dao.UsuarioDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private TextField tfSenha;

	@FXML
	private Button btnCriarConta;

	@FXML
	private TextField tfLogin;

	@FXML
	private Hyperlink linkEsqueciSenha;

	@FXML
	private BorderPane bpPrincipal;

	@FXML
	private Button btnEntrar;
	private Conexao log;
	public static Stage stage;

	public static final String PATH_VIEW = "/telas/";

	@FXML
	private StackPane stack;

	public boolean logado = false;

	private UsuarioDAO usuarioDAO;

	public LoginController() {
		usuarioDAO = dao.DaoFactory.get().usuarioDAO();
		log = new ConexaoProducao();
	}

	@FXML
	void CriarConta(ActionEvent event) {
		// AbreTela("Principal.fxml");
		Node node = (Node) event.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("Principal.fxml"));

		} catch (IOException ex) {
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	void Entrar(ActionEvent event) throws SQLException {

		try {
			Connection connection = log.get();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select Nome, senha from usuario");
			if (tfLogin.getText().equals("") || (tfSenha.getText().equals(""))) {
				Alerta alerta = new Alerta();
				alerta.nulo();//
				return;
			}
			while (rs.next()) {
				if (tfLogin.getText().equals(rs.getString("Nome"))
						&& (tfSenha.getText().equals(rs.getString("senha")))) {
					Alerta alerta1 = new Alerta();
					alerta1.entrar();
					
					//Node node = (Node) event.getSource();
					//stage = (Stage) node.getScene().getWindow();
					//Parent root = null;
					AbreTela("Principal.fxml");
					/*try {
						/*if (Main.getStage() != null) {
							Main.getStage().close();
						}
						root = FXMLLoader.load(getClass().getResource("Principal.fxml"));

					} catch (IOException ex) {
					}*/
					//Scene scene = new Scene(root);
					//stage.setScene(scene);
					//stage.show();
					logado = true;
				}
				return;
			}
			Alerta alerta1 = new Alerta();
			alerta1.incorreto();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Stage getStage() {
		return stage;
	}

	@FXML
	void EsqueciSenha(ActionEvent event) {
		// AbreTela("EditaPerfil.fxml");
	}

	// Esquece isso fazer funcionar td depois se der tudo certo tentar fazer
	// deste modo

	// Metodo de abrir tela que fecha tela antiga e cria nova
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
