import java.sql.*;

public class Conexao{
	public static void main(String args[]) {
	      int num1, num2;
	      //
	      try {
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	         System.out.println("Fim do bloco try");
	      }
	      catch (Exception e) {
	         System.out.println("Algum erro ocorreu");
	      }finally{
	         System.out.println("Eu sempre vou ser executado!");
	      }
	      System.out.println("Fora do bloco try catch finally");
	   }
	}