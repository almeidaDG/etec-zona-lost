import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int acumQtd = 0; int acumPreco = 0;
		int qtd[] = new int [100];
	    double preco[] = new double [100];
		
	    
		for(int i=1; i<100; i++) {
			System.out.println("Número " + i + " - Quantidade vendida: ");
			qtd[i] = input.nextInt();
			
			acumQtd += qtd[i];
		}
		
		for(int i=1; i<100; i++) {
			System.out.println("Número " + i + "- Digite o preço da mercadoria: ");
			preco[i] = input.nextDouble();
			
			acumPreco += preco[i];
		}
		
		double faturamento = acumPreco * acumQtd;
		System.out.println("O faturamento mensal foi: " + faturamento);
	}

}
