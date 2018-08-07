import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.text.*;

public class Interface01 extends JFrame{
	JTextField rotulo;
	JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botao10;
	JButton botao11, botao12, botao13, botao14, botao15, botao16, botao17, botao18, botao19, botao20;
	public Interface01() {
		super("Calculadora");
		Container tela = getContentPane();
		setLayout (null);
		
		rotulo = new JTextField("1000.0");
		
		botao1 = new JButton("1");
		botao2 = new JButton("2");
		botao3 = new JButton("3");
		botao4 = new JButton("-");
		botao5 = new JButton("C");
		botao6 = new JButton("4");
		botao7 = new JButton("5");
		botao8 = new JButton("6");
		botao9 = new JButton("+");
		botao10 = new JButton("CE");
		botao11 = new JButton("7");
		botao12 = new JButton("8");
		botao13 = new JButton("9");
		botao14 = new JButton("*");
		botao15 = new JButton("1/x");
		botao16 = new JButton("0");
		botao17 = new JButton("+/-");
		botao18 = new JButton(".");
		botao19 = new JButton("/");
		botao20 = new JButton("=");
		
		botao1.setMargin(new Insets(1,1,1,1));
		botao2.setMargin(new Insets(1,1,1,1));
		botao3.setMargin(new Insets(1,1,1,1));
		botao4.setMargin(new Insets(1,1,1,1));
		botao5.setMargin(new Insets(1,1,1,1));
		botao6.setMargin(new Insets(1,1,1,1));
		botao7.setMargin(new Insets(1,1,1,1));
		botao8.setMargin(new Insets(1,1,1,1));
		botao9.setMargin(new Insets(1,1,1,1));
		botao10.setMargin(new Insets(1,1,1,1));
		botao11.setMargin(new Insets(1,1,1,1));
		botao12.setMargin(new Insets(1,1,1,1));
		botao13.setMargin(new Insets(1,1,1,1));
		botao14.setMargin(new Insets(1,1,1,1));
		botao15.setMargin(new Insets(1,1,1,1));
		botao16.setMargin(new Insets(1,1,1,1));
		botao17.setMargin(new Insets(1,1,1,1));
		botao18.setMargin(new Insets(1,1,1,1));
		botao19.setMargin(new Insets(1,1,1,1));
		botao20.setMargin(new Insets(1,1,1,1));
		
		rotulo.setBounds(50,30, 230, 30);
		botao1.setBounds(50, 100, 30, 30);
		botao2.setBounds(100, 100, 30, 30);
		botao3.setBounds(150, 100, 30, 30);
		botao4.setBounds(200, 100, 30, 30);
		botao5.setBounds(250, 100, 30, 30);
		botao6.setBounds(50, 150, 30, 30);
		botao7.setBounds(100, 150, 30,30);
		botao8.setBounds(150, 150, 30,30);
		botao9.setBounds(200, 150, 30, 30);
		botao10.setBounds(250, 150, 30,30);
		botao11.setBounds(50, 200, 30, 30);
		botao12.setBounds(100, 200, 30, 30);
		botao13.setBounds(150, 200, 30, 30);
		botao14.setBounds(200, 200, 30, 30);
		botao15.setBounds(250, 200, 30,30);
		botao16.setBounds(50, 250, 30, 30);
		botao17.setBounds(100, 250, 30, 30);
		botao18.setBounds(150, 250, 30, 30);
		botao19.setBounds(200, 250, 30, 30);
		botao20.setBounds(250, 250, 30 ,30);
		
		
		tela.add(rotulo);
		tela.add(botao1);
		tela.add(botao2);
		tela.add(botao3);
		tela.add(botao4);
		tela.add(botao5);
		tela.add(botao6);
		tela.add(botao7);
		tela.add(botao8);
		tela.add(botao9);
		tela.add(botao10);
		tela.add(botao11);
		tela.add(botao12);
		tela.add(botao13);
		tela.add(botao14);
		tela.add(botao15);
		tela.add(botao16);
		tela.add(botao17);
		tela.add(botao18);
		tela.add(botao19);
		tela.add(botao20);
		
		setSize(330, 330);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
	public static void main(String[] args) {
		Interface01 app = new Interface01();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
