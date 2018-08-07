import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TelaCliente extends JFrame {
	JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, label;
	JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
	public TelaCliente(){
		super("Exemplo de Janela");
		Container tela = getContentPane();
		setLayout(null);
		
		label = new JLabel ("Cadastro de clientes");
		rotulo1 = new JLabel ("Nome");
		rotulo2 = new JLabel ("CPF");
		rotulo3 = new JLabel ("RG");
		rotulo4 = new JLabel ("Endereço");
		rotulo5 = new JLabel ("Cidade");
		rotulo6 = new JLabel ("Estado");
		rotulo7 = new JLabel ("CEP");
		texto1 = new JTextField(50);
		texto2 = new JTextField(11);
		texto3 = new JTextField(9);
		texto4 = new JTextField(50);
		texto5 = new JTextField(20);
		texto6 = new JTextField(20);
		texto7 = new JTextField(8);
		
		texto1.requestFocus();
		label.setBounds(150, 10, 200, 20);
		rotulo1.setBounds(50, 30, 80, 20);
		rotulo2.setBounds(50, 70, 80, 20);
		rotulo3.setBounds(50, 110, 80, 20);
		rotulo4.setBounds(50, 150, 80, 20);
		rotulo5.setBounds(50, 190, 80, 20);
		rotulo6.setBounds(50, 230, 80, 20);
		rotulo7.setBounds(50, 270, 80, 20);
		
		texto1.setBounds(50, 50, 200, 20);
		texto2.setBounds(50, 90, 200, 20);
		texto3.setBounds(50, 130, 80, 20);
		texto4.setBounds(50, 170, 80, 20);
		texto5.setBounds(50, 210, 80, 20);
		texto6.setBounds(50, 250, 80, 20);
		texto7.setBounds(50, 290, 80, 20);
		
		
		tela.setBackground(new Color(201,200,100));
		tela.add(label);
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		tela.add(rotulo5);
		tela.add(rotulo6);
		tela.add(rotulo7);
		
		tela.add(texto1);
		tela.add(texto1);
		tela.add(texto2);
		tela.add(texto3);
		tela.add(texto4);
		tela.add(texto5);
		tela.add(texto6);
		tela.add(texto7);
		setSize(450, 450);
		setVisible(true);
		setLocationRelativeTo(null);
	}

}
