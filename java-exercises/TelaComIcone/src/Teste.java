import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Teste extends JFrame{
	JButton botao, botao2, botao3;
	ImageIcon icone, icone2, icone3;
	public Teste(){
		super("Exemplo com JButton");
		Container tela = getContentPane();
		setLayout(null);
		icone = new ImageIcon("freebsd.gif");
		icone2 = new ImageIcon("Dollar.gif");
		icone3 = new ImageIcon("motoconadobruno.gif");
		botao = new JButton ("Capetinha",icone);
		botao2 = new JButton (icone2);
		botao3 = new JButton (icone3);
		botao.setBounds(130,30,130,30);
		botao2.setBounds(130,75,130,30 );
		botao3.setBounds(0,0,300,250);
		
		
		tela.add(botao);
		tela.add(botao2);
		tela.add(botao3);
		
		setSize(300,250);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Teste app = new Teste();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
