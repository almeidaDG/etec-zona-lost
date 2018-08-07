import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class botaoUsuario extends JFrame{
	ImageIcon iconeCad, iconeVol;
	JLabel login, senha, confirmacao, email;
	JTextField campoLogin, campoEmail;
	JPasswordField campoSenha, campoConfirmacao;
	JButton cadastrar, voltar;
	
	public botaoUsuario(){
		super("Cadastro de Usuários");
		Container tela = getContentPane();
		setLayout(null);
		iconeCad = new ImageIcon("cadastrar.png"); 
		iconeVol = new ImageIcon("voltar.png");
		//label
		
		login = new JLabel("Usuário:");
		senha = new JLabel("Senha:");
		confirmacao = new JLabel("Confirmação:");
		email = new JLabel("E-mail:");

		//textfield
		
		campoLogin = new JTextField(20);
		campoSenha = new JPasswordField(30);
		campoConfirmacao = new JPasswordField(20);
		campoEmail = new JTextField(50);
		//button
		
		cadastrar = new JButton("Cadastrar", iconeCad);
		voltar = new JButton("Voltar", iconeVol);
		
		//dimensoes
		
		login.setBounds(20, 30, 50, 15);
		senha.setBounds(20, 60, 100, 15);
		confirmacao.setBounds(20, 90, 150, 15);
		email.setBounds(20, 120, 120, 15);
		
		campoLogin.setBounds(70, 30, 100, 18);
		campoSenha.setBounds(65, 60, 120, 18);
		campoConfirmacao.setBounds(100, 90, 150, 18);
		campoEmail.setBounds(60, 120, 300, 18);
		
		cadastrar.setBounds(70, 160, 130, 30);
		voltar.setBounds(220, 160, 130, 30);
		
		//cadastrar
		
		cadastrar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						 
						 JFrame cadastrado = new JFrame("");
						 
						 JOptionPane.showMessageDialog(cadastrado,
							        "Usuário cadastrado com sucesso!",
							        "Cadastro concluído",
							        JOptionPane.INFORMATION_MESSAGE);
						 
						 			campoLogin.setText(null);
									campoSenha.setText(null);
									campoConfirmacao.setText(null);
									campoEmail.setText(null);
									
					}
				}
				);
		
		voltar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						SistCad app = new SistCad();
						app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setVisible(false);
						app.setVisible(true);
					}
				}
				);
		
		
		//configuracao tela
		
		tela.add(login);
		tela.add(senha);
		tela.add(confirmacao);
		tela.add(email);
		
		tela.add(campoLogin);
		tela.add(campoSenha);
		tela.add(campoConfirmacao);
		tela.add(campoEmail);
		
		tela.add(cadastrar);
		tela.add(voltar);
		
		setSize(450, 250);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
}