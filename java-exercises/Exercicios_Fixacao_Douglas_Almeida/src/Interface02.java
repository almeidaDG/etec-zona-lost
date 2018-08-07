import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.text.*;

public class Interface02 extends JFrame{
	JTextField rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8, rotulo9, rotulo10;
	JLabel label2, label3, label4, label5, label6, label7, label8, label9, label10;
	JButton botao1, botao2, botao3;
	public Interface02() {
		super("Cadastro de clientes");
		Container tela = getContentPane();
		setLayout (null);
		
		label2 = new JLabel("Código:");
		label3 = new JLabel("Nome:");
		label4 = new JLabel("CPF:");
		label5 = new JLabel("Telefone:");
		label6 = new JLabel("Logradouro:");
		label7 = new JLabel("N°");
		label8 = new JLabel("Bairro:");
		label9 = new JLabel("Cidade:");
		label10 = new JLabel("Estado:");
		
		rotulo1 = new JTextField("");
		rotulo2 = new JTextField("");
		rotulo3 = new JTextField("");
		rotulo4 = new JTextField("");
		rotulo5 = new JTextField("");
		rotulo6 = new JTextField("");
		rotulo7 = new JTextField("");
		rotulo8 = new JTextField("");
		rotulo9 = new JTextField("");
		rotulo10 = new JTextField("");
		
		botao1 = new JButton("Busca");
		botao2 = new JButton("Limpar");
		botao3 = new JButton("Inserir");
		
		botao1.setMargin(new Insets(5,5,5,5));
		botao2.setMargin(new Insets(5,5,5,5));
		botao3.setMargin(new Insets(5,5,5,5));
		
		
		label2.setBounds(30, 15, 50, 10);
		label3.setBounds(30, 45, 50, 10);
		label4.setBounds(30, 70, 50, 10);
		label5.setBounds(300, 70, 170, 10);
		label6.setBounds(30,200,100,20);
		label7.setBounds(530,200,50,10);
		label8.setBounds(30,240,50,10);
		label9.setBounds(30,270,50,10);
		label10.setBounds(450,270,50,10);
		
		rotulo1.setBounds(80,10,100,20);
		rotulo2.setBounds(80,40,580,20);
		rotulo3.setBounds(80,65,170,20);
		rotulo4.setBounds(370,65,170, 20);
		rotulo5.setBounds(110,200,400,20);
		rotulo6.setBounds(560,200,100,20);
		rotulo7.setBounds(80,235,430,20);
		rotulo8.setBounds(80,265,350,20);
		rotulo9.setBounds(500,265,100,20);
		rotulo10.setBounds(1,1,1,1);
		
		botao1.setBounds(30, 315, 60, 20);
		botao2.setBounds(520, 315, 60, 20);
		botao3.setBounds(600, 315, 60, 20);
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		tela.add(rotulo5);
		tela.add(rotulo6);
		tela.add(rotulo7);
		tela.add(rotulo8);
		tela.add(rotulo9);
		tela.add(rotulo10);
		
		tela.add(label2);
		tela.add(label3);
		tela.add(label4);
		tela.add(label5);
		tela.add(label6);
		tela.add(label7);
		tela.add(label8);
		tela.add(label9);
		tela.add(label10);
		
		tela.add(botao1);
		tela.add(botao2);
		tela.add(botao3);

		
		setSize(700, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
	public static void main(String[] args) {
		Interface02 app = new Interface02();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
