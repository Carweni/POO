import java.util.Scanner;

public class NumeroPerfeito{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int num = teclado.nextInt();

        int j = 1, cont = 0;

        while(j < num){
            if (num % j == 0){
                cont += j;
            }
            j++;
        }

        if(cont == num){
            System.out.println("Eh perfeito.");
        }
        else{
            System.out.println("Nao eh perfeito.");
        }
    }
}