import java.util.Scanner;

public class Primo{
	public static void main (String []args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int i = teclado.nextInt(); 

		int j = 2;
        int verificador = 0;

		while(j < i){
			if(i % j == 0){
                verificador = 1;
				break;
			}			
			j = j + 1;
		}

        if(verificador == 0){
		    System.out.println("Eh primo.");
        }
        else{
            System.out.println("Nao eh primo");
        }
	}
}