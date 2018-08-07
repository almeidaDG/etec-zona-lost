import java.util.Scanner;
public class Exercicio02 {
	
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int numImp=0;
	int sm=0;
	 int n = 5;
	 int i, j, k;
	 int a [][] = new int[5][5];

	 
	 System.out.println("Matriz 5,5 int");
	 for(i = 0; i<n; i++) {
		 System.out.printf("Informe os dados da %dª Linha = \n",(i+1));
		 for(j=0; j<n; j++) {
			 System.out.printf("a[%d][%d] = ",i,j);
			 a[i][j] = input.nextInt();
			 
		 }
	 }
	     System.out.println();
		 System.out.println("Resultados da matriz\n");
		 for(i=0; i<n; i++) {
			 System.out.printf("%dªlinha = ",(i+1));
			 for(j=0;j<n;j++) {
				 System.out.printf("%d\t", a[i][j]);
			 }
		 }
		 
		 System.out.println();
		 System.out.println("Números pares = \n");
		 
		 for (i=0; i<n; i++) {
			 for (j=0; j<n; j++) {

			 if (a[i][j]%2==0) {
				 sm += a[i][j]; 
			 System.out.println(+a[i][j]);
			
			 
			     }
			    }
			   }
		 System.out.println();
		 System.out.println("A soma dos números pares é = "+sm+"\n\n");
		 
		 
		 System.out.println();
		 System.out.println("Números ímpares = \n");

		 for (i=0; i<n; i++) {
			 for (j=0; j<n; j++) {

			 if (a[i][j]%2!=0) {
			 System.out.println(+a[i][j]);
			 numImp++;
			
			     }
			    }
			   }
		 System.out.println();
		 System.out.println("A quantia de números impares é = \n"+numImp);
			 
	 
	}	
}
