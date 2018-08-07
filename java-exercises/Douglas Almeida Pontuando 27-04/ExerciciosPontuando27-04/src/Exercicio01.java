import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio01 extends JFrame{
	JLabel rotulo1, rotulo2, valorA, valorB, valorC, valorX1, valorX2;
	JTextField campo1, campo2, campo3, campo4, campo5;
	JButton calcular;
	
	public Exercicio01(){
		super("Fórmula de Bhaskara");
		Container tela = getContentPane();
		setLayout(null);
		
		//label
		
		rotulo1 = new JLabel("Fórmula de Bhaskara");
		rotulo2 = new JLabel("ax² + bx + c = 0");
		
		valorA = new JLabel("Valor de A:");
		valorB = new JLabel("Valor de B:");
		valorC = new JLabel("Valor de C:");
		valorX1 = new JLabel("X'");
		valorX2 = new JLabel("X''");
		
		//textfield
		
		campo1 = new JTextField(5);
		campo2 = new JTextField(5);
		campo3 = new JTextField(5);
		campo4 = new JTextField(5);
		campo5 = new JTextField(5);
		
		//button
		
		calcular = new JButton("Calcular");
		
		//dimensoes
		
		rotulo1.setBounds(75, 10, 200, 10);
		rotulo2.setBounds(90, 30, 200, 10);
		valorA.setBounds(50, 60, 100, 10);
		valorB.setBounds(50, 83, 100, 10);
		valorC.setBounds(50, 103, 100, 10);
		valorX1.setBounds(125, 170, 20, 20);
		valorX2.setBounds(125, 190, 20, 20);
		
		campo1.setBounds(120, 60, 100, 17);
		campo2.setBounds(120, 80, 100, 17);
		campo3.setBounds(120, 100, 100, 17);
		campo4.setBounds(145, 170, 50, 20);
		campo5.setBounds(145, 190, 50, 20);
		
		calcular.setBounds(50, 130, 170, 30);
		
		//calcular
		
		calcular.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						double valorA, valorB, valorC, delta, x1, x2;
						valorA = 0; valorB = 0; valorC = 0; x1 = 0; x2 =0;
						valorA = Double.parseDouble(campo1.getText());
						valorB = Double.parseDouble(campo2.getText());
						valorC = Double.parseDouble(campo3. getText());
						
						delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
						
						if(delta > 0){
							x1 = ((-valorB + Math.sqrt(delta)) / (2 * valorA));
							x2 = ((-valorB - Math.sqrt(delta)) / (2 * valorA));
						}
						
						campo4.setVisible(true);
						campo5.setVisible(true);
						campo4.setText("" +x1);
						campo5.setText("" +x2);
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
		tela.add(valorX1);
		tela.add(valorX2);
		tela.add(campo4);
		tela.add(campo5);
		
		
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Exercicio01 app = new Exercicio01();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
