import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio03 extends JFrame{
	JLabel rotulo1, rotulo2, valorA, valorB, valorC, ms;
	JTextField campo1, campo2, campo3, resposta;
	JButton calcular;
	
	public Exercicio03(){
		super("MUV");
		Container tela = getContentPane();
		setLayout(null);
		
		//label
		
		rotulo1 = new JLabel("Movimento Uniformemente Variado");
		rotulo2 = new JLabel("MUV");
		
		ms = new JLabel("m/s: ");
		
		valorA = new JLabel("Velocidade inicial:");
		valorB = new JLabel("Aceleração:");
		valorC = new JLabel("Tempo:");
		
		//textfield
		
		campo1 = new JTextField(5);
		campo2 = new JTextField(5);
		campo3 = new JTextField(5);
		resposta = new JTextField(5);
		
		//button
		
		calcular = new JButton("Calcular");
		
		//dimensoes
		
		rotulo1.setBounds(35, 10, 200, 10);
		rotulo2.setBounds(110, 30, 200, 10);
		valorA.setBounds(50, 60, 150, 10);
		valorB.setBounds(50, 83, 100, 10);
		valorC.setBounds(50, 103, 100, 10);
		ms.setBounds(50, 185, 30, 10);

		
		campo1.setBounds(160, 60, 70, 17);
		campo2.setBounds(130, 80, 100, 17);
		campo3.setBounds(130, 100, 100, 17);
		resposta.setBounds(80, 180, 50, 20);
		
		calcular.setBounds(50, 130, 170, 30);
		
		//calcular
		
		calcular.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						double vIni, vFinal, t, ace;
						
						vIni = 0; vFinal = 0; t = 0; ace = 0;
						
						vIni = Double.parseDouble(campo1.getText());
						ace = Double.parseDouble(campo2.getText());
						t = Double.parseDouble(campo3.getText());
						
						vFinal = vIni + (ace * t); 
						
						resposta.setVisible(true);
						
						resposta.setText("" + vFinal);
						
					}
				}
				);
		
		//configuracao tela
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(valorA);
		tela.add(valorB);
		tela.add(valorC);
		tela.add(campo1);
		tela.add(campo2);
		tela.add(campo3);
		tela.add(calcular);
		tela.add(ms);
		tela.add(resposta);
		
		setSize(300, 270);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Exercicio03 app = new Exercicio03();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
