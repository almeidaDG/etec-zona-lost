// douglas almeida 18894
// importa uma biblioteca do java para fazer aparecer a caixa de texto gr�fica 
import javax.swing.JOptionPane;
// cria uma classe p�blica 
public class Exemplo02Comentado {
	// m�todo principal do pacote de n�cleo java 
	public static void main(String[] args) {
		// cria uma vari�veis double chamada vnum e utiliza uma inst�ncia 
		double vnum[] = new double [5];
		// cria duas vari�veis double e associa o valor nulo a elas 
		double md = 0, acum = 0;
		// cria variaveis tipo inteiras e associa o valor delas como nulo 
		int qtd = 0, i = 0, l = 0;
		// cria um for dizendo que i � nulo, e se o i for menor igual a quatro 
		// ele roda o programa at� chegar a 3, depois ele atribuir 1 n�mero a mais at� chegar 
		for (i = 0; i <= 4; i++)
		{
			// 1 recebe i + 1
			l = i + 1; 
			// esse comando � pra aparecer uma caixa para o usu�rio digitar o n�mero 
			vnum[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o" + l,"� n�mero"));
			// acum est� recebendo o valor da variavel vnum
			acum += vnum[i];
		}
		// a variavel md recebe acum dividido por 5
		md = acum / 5;
		// cria outro for dizendo que o i  recebe 0, e se o i for menor igual a 4 ele roda o programa
		// associando +1 sempre que passar
		for (i=0; i <= 4; i++)
		{
			// aqui � um se o vnum[i] for maior que md
			if (vnum[i] > md)
			{
				// ele atribui um a qtd
				qtd ++;
			}
		}
		// aparece uma mensagem na tela dizendo a m�dia e a quantidade de valores acima da m�dia
		JOptionPane.showMessageDialog(null, "A m�dia �: " +md
				+ "\nA quantidade de valores acima da m�dia �: " + qtd);
	}
}
