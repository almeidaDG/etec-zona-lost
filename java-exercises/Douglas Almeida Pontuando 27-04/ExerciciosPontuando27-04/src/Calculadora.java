import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame{
	JLabel valorA, valorB, resultado;
	JTextField campo1, campo2;
	JButton somar, subtrair, dividir, multiplicar;
	
	public Calculadora(){
		super("Calculadora");
		Container tela = getContentPane();
		setLayout(null);
		
		//label
		
		valorA = new JLabel("1° Valor:");
		valorB = new JLabel("2° Valor:");
		resultado = new JLabel();
		
		//textfield
		
		campo1 = new JTextField(5);
		campo2 = new JTextField(5);
		
		//button
		
		somar = new JButton("Somar");
		subtrair = new JButton("Subtrair");
		dividir = new JButton("Dividir");
		multiplicar = new JButton("Multiplicar");
		
		//dimensoes
		
		valorA.setBounds(50, 30, 100, 10);
		valorB.setBounds(50, 50, 100, 10);
		resultado.setBounds(50, 210, 300, 20);
		
		campo1.setBounds(115, 28, 100, 17);
		campo2.setBounds(115, 48, 100, 17);
		
		somar.setBounds(50, 80, 170, 30);
		subtrair.setBounds(50, 110, 170, 30);
		dividir.setBounds(50, 140, 170, 30);
		multiplicar.setBounds(50, 170, 170, 30);
		
		//calcular
		
		somar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						double valorA, valorB, resposta;
						
						valorA = Double.parseDouble(campo1.getText());
						valorB = Double.parseDouble(campo2.getText());
						
						resposta = valorA + valorB;
						
						resultado.setVisible(true);
						
						resultado.setText("A soma é: " + resposta);
					}
				}
				);
		
		subtrair.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						double valorA, valorB, resposta;
						
						valorA = Double.parseDouble(campo1.getText());
						valorB = Double.parseDouble(campo2.getText());
						
						resposta = valorA - valorB;
						
						resultado.setVisible(true);
						
						resultado.setText("A subtração é: " + resposta);
					}
				}
				);
		
		dividir.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						double valorA, valorB, resposta;
						
						valorA = Double.parseDouble(campo1.getText());
						valorB = Double.parseDouble(campo2.getText());
						
						resposta = valorA / valorB;
						
						resultado.setVisible(true);
						
						resultado.setText("A divisão é: " + resposta);
					}
				}
				);
		
		multiplicar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						double valorA, valorB, resposta;
						
						valorA = Double.parseDouble(campo1.getText());
						valorB = Double.parseDouble(campo2.getText());
						
						resposta = valorA * valorB;
						
						resultado.setVisible(true);
						
						resultado.setText("A multiplicação é: " + resposta);
					}
				}
				);
		
		//configuracao tela
		

		tela.add(valorA);
		tela.add(valorB);
		tela.add(resultado);
		tela.add(campo1);
		tela.add(campo2);
		
		tela.add(somar);
		tela.add(subtrair);
		tela.add(dividir);
		tela.add(multiplicar);
		
		
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Calculadora app = new Calculadora();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
