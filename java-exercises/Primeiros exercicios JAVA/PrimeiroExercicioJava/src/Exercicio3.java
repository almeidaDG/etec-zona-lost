// DIVIDIR UM N�MERO POR 2 SEM UTILIZAR O OPERADOR / //

import javax.swing.JOptionPane;

public class Exercicio3 {
public static void main(String[]args){
	double a= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A: "));
	double b = a*0.5;
	
	System.out.println("O n�mero divido por 2 �: " +b);
}
}
