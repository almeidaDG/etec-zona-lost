import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio02 extends JFrame{
	JLabel rotulo1, rotulo2, valorA, valorB, hipotenusa;
	JTextField campo1, campo2, campo3;
	JButton calcular;
	
	public Exercicio02(){
		super("Teorema de Pitágoras");
		Container tela = getContentPane();
		setLayout(null);
		
		//label
		
		rotulo1 = new JLabel("Teorema de Pitágoras");
		rotulo2 = new JLabel("c² = a² + b²");
		
		valorA = new JLabel("Valor do cateto A:");
		valorB = new JLabel("Valor do cateto B:");
		hipotenusa = new JLabel("Hipotenusa:");
		
		//textfield
		
		campo1 = new JTextField(5);
		campo2 = new JTextField(5);
		campo3 = new JTextField(5);
		
		//button
		
		calcular = new JButton("Calcular");
		
		//dimensoes
		
		rotulo1.setBounds(75, 10, 200, 10);
		rotulo2.setBounds(110, 30, 200, 10);
		valorA.setBounds(50, 60, 100, 10);
		valorB.setBounds(50, 83, 100, 10);
		hipotenusa.setBounds(50, 103, 100, 10);


		
		campo1.setBounds(160, 60, 50, 17);
		campo2.setBounds(160, 80, 50, 17);
		campo3.setBounds(120, 100, 90, 17);

		
		calcular.setBounds(50, 130, 170, 30);
		
		//calcular
		
		calcular.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						double a, b, hip, hipo, catetos;
						a = 0; b = 0; hip = 0; hipo = 0;
						a = Double.parseDouble(campo1.getText());
						b = Double.parseDouble(campo2.getText());
						hip = Double.parseDouble(campo3.getText());
						
						if(a != 0 || b != 0) {
							catetos = Math.pow(a, 2) + Math.pow(b, 2);
							hipo = Math.sqrt(catetos);
						}
						
						campo1.setVisible(true);

						campo3.setText("" + hipo);
					}
				}
				);
		
		//configuracao tela
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(valorA);
		tela.add(valorB);
		tela.add(hipotenusa);
		tela.add(campo1);
		tela.add(campo2);
		tela.add(campo3);
		tela.add(calcular);
		
		
		setSize(290, 250);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Exercicio02 app = new Exercicio02();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
