import java.util.Scanner;
public class SomaSubMatriz {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int A[][] = new int [2] [2];
		int B[][] = new int [2] [2];
		int C[][] = new int [2] [2];
		int D[][] = new int [2] [2];
		
		System.out.println("1a. Matriz A!");
		
			for(int i = 0; i<2; ++i){
				System.out.println("Informe os elementos da %da linha: \n");
				for (int j=0; j<2; ++j){
					System.out.println("A [%d][%d]: ",i,j);
					A[i][j] = input.nextInt();
			}
		}
		
		System.out.println("2a. Matriz B!");
			for (int i=0; i<2; ++i){
				System.out.println("Informe os elementos da %da linha:\n", (i+1));
				for (int j = 0; j<2; ++j){
					System.out.println("B [%d][%d]: ",i,j);
					B[i][j] = input.nextInt();
				}
			}
			
		System.out.println("Soma das Matrizes A e B!\n");
			for (int i=0; i<2; ++i){
				for (int j=0; j<2; ++j){
					C[i][j] = A [i][j] + B[i][j];
					System.out.println("%d\t", C[i][j]);
				}
				
				System.out.println("\n")
			}
	}
}
