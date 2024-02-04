import java.util.Scanner;

public class Primos{
	public static void main (String []args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int i = teclado.nextInt(); 

		int p = 1, j;

        System.out.print("1 2 ");

        while(p <= i){
            j = 2;
            while(j < p){
                if(p % j == 0){
                    break;
                }			
                j = j + 1;
            }

            if(j == p){
                System.out.print(p + " ");
            }

            p = p + 2;
        }
	}
}