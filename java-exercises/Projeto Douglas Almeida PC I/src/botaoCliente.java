import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class botaoCliente extends JFrame{
	ImageIcon iconeCad, iconeVol;
	JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotuloBairro, rotuloCEP, rotuloEmail;
	JTextField campoNome, campoEndereco, campoBairro, campoCEP, campoEmail;
	JFormattedTextField cpf, telefone, cep;
	JButton cadastrar, voltar;
	MaskFormatter mascaracpf, mascaratel, mascaracep;
	
	public botaoCliente(){
		super("Cadastro de Clientes");
		Container tela = getContentPane();
		setLayout(null);
		
		iconeCad = new ImageIcon("cadastrar.png"); 
		iconeVol = new ImageIcon("voltar.png");
		//label
		
		rotulo1 = new JLabel("CPF:");
		rotulo2 = new JLabel("Nome:");
		rotulo3 = new JLabel("Endereço:");
		rotulo4 = new JLabel("Telefone:");
		rotuloBairro = new JLabel("Bairro:");
		rotuloCEP = new JLabel("CEP:");
		rotuloEmail = new JLabel("E-mail:");
		
		//textfield
		
		campoNome = new JTextField(20);
		campoEndereco = new JTextField(30);
		campoBairro = new JTextField(20);
		//campoCEP = new JTextField(9);
		campoEmail = new JTextField(30);
		
		//button
		
		cadastrar = new JButton("Cadastrar", iconeCad);
		voltar = new JButton("Voltar", iconeVol);
		
		//dimensoes
		
		rotulo1.setBounds(20, 30, 200, 10);
		rotulo2.setBounds(20, 60, 200, 10);
		rotulo3.setBounds(20, 90, 150, 10);
		rotulo4.setBounds(20, 203, 100, 10);
		rotuloBairro.setBounds(20, 120, 100, 10);
		rotuloCEP.setBounds(20, 145, 100, 10);
		rotuloEmail.setBounds(20, 170, 100, 10);
		
		campoEndereco.setBounds(80, 90, 300, 18);
		campoNome.setBounds(80, 60, 300, 18);
		campoBairro.setBounds(80, 120, 100, 18);
		campoEmail.setBounds(80, 168, 300, 18);
		
		cadastrar.setBounds(60, 250, 130, 30);
		voltar.setBounds(230, 250, 130, 30);
		
		//mascara
		
		try {
			mascaracpf = new MaskFormatter("###.###.###-##");
			mascaratel = new MaskFormatter("(##)####-####");
			mascaracep = new MaskFormatter("#####-###");
			mascaracpf.setPlaceholderCharacter('_');
			mascaratel.setPlaceholderCharacter('_');
			mascaracep.setPlaceholderCharacter('_');
		}
		catch(ParseException excp) {}
		
		cep = new JFormattedTextField(mascaracep);
		cpf = new JFormattedTextField(mascaracpf);
		telefone = new JFormattedTextField(mascaratel);
		cpf.setBounds(80, 30, 95, 20);
		telefone.setBounds(80, 200, 93, 18);
		cep.setBounds(80, 143, 70, 18);
		
		//cadastrar
		
		cadastrar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						 
						 JFrame cadastrado = new JFrame("");
						 
						 JOptionPane.showMessageDialog(null,
								    "Cadasto de cliente efetuado com sucesso!"+
								    "\nDados digitados:" +
							        "\nNome: " + campoNome.getText()+
							        "\nEndereço: " + campoEndereco.getText()+
							        "\nCPF:: " + cpf.getText()+
							        "\nTelefone: " + telefone.getText()+
							        "\nBairro:: " + campoBairro.getText()+
							        "\nCEP:: " + cep.getText()+
							        "\nE-mail: " + campoEmail.getText()
								 );
						 			campoNome.setText(null);
									campoEndereco.setText(null);
									cpf.setText(null);
									telefone.setText(null);
									campoBairro.setText(null);
									cep.setText(null);
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
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		tela.add(rotuloBairro);
		tela.add(rotuloCEP);
		tela.add(rotuloEmail);
		
		tela.add(cpf);
		tela.add(campoNome);
		tela.add(campoEndereco);
		tela.add(telefone);
		tela.add(campoBairro);
		tela.add(campoEmail);
		tela.add(cep);
		
		tela.add(cadastrar);
		tela.add(voltar);
		
		setSize(450, 350);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
}