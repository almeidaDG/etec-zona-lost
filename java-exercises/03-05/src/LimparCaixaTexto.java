import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class LimparCaixaTexto extends JFrame{
	JLabel rotulo1, rotulo2, rotulo3, rotulo4;
	JTextField campoNome, campoEndereco;
	JFormattedTextField cpf, telefone;
	JButton cadastrar, limpar, ocultar, exibir, desabilitar, habilitar;
	MaskFormatter mascaracpf, mascaratel;
	
	public LimparCaixaTexto(){
		super("Cadastro de Clientes");
		Container tela = getContentPane();
		setLayout(null);
		
		//label
		
		rotulo1 = new JLabel("CPF:");
		rotulo2 = new JLabel("Nome:");
		rotulo3 = new JLabel("Endereço:");
		rotulo4 = new JLabel("Telefone");
		
		//textfield
		
		campoNome = new JTextField(5);
		campoEndereco = new JTextField(5);
		
		//button
		
		cadastrar = new JButton("Cadastrar");
		limpar = new JButton("Limpar");
		ocultar = new JButton("Ocultar");
		exibir = new JButton("Exibir");
		desabilitar = new JButton("Desabilitar");
		habilitar = new JButton("Habilitar");
		//dimensoes
		
		rotulo1.setBounds(20, 30, 200, 10);
		rotulo2.setBounds(20, 60, 200, 10);
		rotulo3.setBounds(20, 90, 150, 10);
		rotulo4.setBounds(20, 120, 100, 10);

		
		campoNome.setBounds(80, 90, 300, 20);
		campoEndereco.setBounds(80, 60, 300, 20);

		
		cadastrar.setBounds(120, 150, 100, 20);
		limpar.setBounds(230, 150, 100, 20);
		ocultar.setBounds(120, 200, 100, 20);
		exibir.setBounds(230, 200, 100, 20);
		desabilitar.setBounds(120, 250, 100, 20);
		habilitar.setBounds(230, 250, 100, 20);
		//mascara
		
		try {
			mascaracpf = new MaskFormatter("###.###.###-##");
			mascaratel = new MaskFormatter("(##)####-####");
			mascaracpf.setPlaceholderCharacter('_');
			mascaratel.setPlaceholderCharacter('_');
		}
		catch(ParseException excp) {}
		
		cpf = new JFormattedTextField(mascaracpf);
		telefone = new JFormattedTextField(mascaratel);
		cpf.setBounds(80, 30, 95, 20);
		telefone.setBounds(80, 120, 93, 20);
		
		//cadastrar
		
		cadastrar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						 
						 JFrame cadastrado = new JFrame("JOptionPane exemplo");
						 
						 JOptionPane.showMessageDialog(cadastrado,
							        "Cliente cadastrado com sucesso!",
							        "Cadastro concluído",
							        JOptionPane.INFORMATION_MESSAGE);
						 System.exit(0);
					}
				}
				);
		
		limpar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						campoNome.setText(null);
						campoEndereco.setText(null);
						cpf.setText(null);
						telefone.setText(null);
						
						campoNome.requestFocus();
					}
				}
				);
		
		ocultar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						rotulo1.setVisible(false);
						rotulo2.setVisible(false);
						rotulo3.setVisible(false);
						rotulo4.setVisible(false);

					}
				}
				);
		
		exibir.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						rotulo1.setVisible(true);
						rotulo2.setVisible(true);
						rotulo3.setVisible(true);
						rotulo4.setVisible(true);
					}
				}
				);
		
		desabilitar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						rotulo1.setEnabled(false);
						rotulo2.setEnabled(false);
						rotulo3.setEnabled(false);
						rotulo4.setEnabled(false);
					}
				}
				);
		
		habilitar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						rotulo1.setEnabled(true);
						rotulo2.setEnabled(true);
						rotulo3.setEnabled(true);
						rotulo4.setEnabled(true);
					}
				}
				);
		//configuracao tela
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		
		tela.add(cpf);
		tela.add(campoNome);
		tela.add(campoEndereco);
		tela.add(telefone);
		
		tela.add(cadastrar);
		tela.add(limpar);
		tela.add(ocultar);
		tela.add(exibir);
		tela.add(desabilitar);
		tela.add(habilitar);
		setSize(450, 350);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		LimparCaixaTexto app = new LimparCaixaTexto();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
