import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main(String[]args) {
		
		double pnum[] = new double [4];
		double md = 0, acum = 0;
		int qtd = 0, i = 0, l = 0;
				
		for (i = 0; i <= 3; i++)
		{	
			l = i + 1; 
					
			pnum[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + l + "° número."));
			
			acum += pnum[i];
		}
				
			md = acum / 4;
				
			for (i=0; i <= 3; i++)
			{
					
				if (pnum[i] > md)
			{
						
				qtd ++;
			}
			}
				
			if(md > 6) {
				System.out.println("Aprovado.");
			}
			
			else if(md < 3) {
				System.out.println("Retido.");
			}
			
			else if(md > 3 & md < 6) {
				System.out.println("Exame.");
			}

	}
}

