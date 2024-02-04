import java.util.Scanner;

public class Impares{
	public static void main (String []args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int i = teclado.nextInt(); 

		int j = 0;

		while(j <= i){
			if(j % 2 != 0){
				System.out.println(j);
			}			
			j = j + 1;
		}
	}
}