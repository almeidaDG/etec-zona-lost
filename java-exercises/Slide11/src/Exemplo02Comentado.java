// douglas almeida 18894
// importa uma biblioteca do java para fazer aparecer a caixa de texto gráfica 
import javax.swing.JOptionPane;
// cria uma classe pública 
public class Exemplo02Comentado {
	// método principal do pacote de núcleo java 
	public static void main(String[] args) {
		// cria uma variáveis double chamada vnum e utiliza uma instância 
		double vnum[] = new double [5];
		// cria duas variáveis double e associa o valor nulo a elas 
		double md = 0, acum = 0;
		// cria variaveis tipo inteiras e associa o valor delas como nulo 
		int qtd = 0, i = 0, l = 0;
		// cria um for dizendo que i é nulo, e se o i for menor igual a quatro 
		// ele roda o programa até chegar a 3, depois ele atribuir 1 número a mais até chegar 
		for (i = 0; i <= 4; i++)
		{
			// 1 recebe i + 1
			l = i + 1; 
			// esse comando é pra aparecer uma caixa para o usuário digitar o número 
			vnum[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o" + l,"° número"));
			// acum está recebendo o valor da variavel vnum
			acum += vnum[i];
		}
		// a variavel md recebe acum dividido por 5
		md = acum / 5;
		// cria outro for dizendo que o i  recebe 0, e se o i for menor igual a 4 ele roda o programa
		// associando +1 sempre que passar
		for (i=0; i <= 4; i++)
		{
			// aqui é um se o vnum[i] for maior que md
			if (vnum[i] > md)
			{
				// ele atribui um a qtd
				qtd ++;
			}
		}
		// aparece uma mensagem na tela dizendo a média e a quantidade de valores acima da média
		JOptionPane.showMessageDialog(null, "A média é: " +md
				+ "\nA quantidade de valores acima da média é: " + qtd);
	}
}
