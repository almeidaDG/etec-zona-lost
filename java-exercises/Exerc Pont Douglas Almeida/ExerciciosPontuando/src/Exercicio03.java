import java.util.Scanner;

public class Exercicio03 {

	private static Scanner input;

	public static void main(String[] args) {
		
		double prestacao, taxa, valor;
		
		input = new Scanner(System.in);
		
		System.out.println("Informe o valor da prestação: ");
		valor = input.nextDouble();
		
		System.out.println("Informe a taxa de juros: ");
		taxa = input.nextDouble();
		
		prestacao = valor + (valor + taxa / 100);
		
		System.out.println("O valor da prestação em atraso é de: " + prestacao);
	}

}
