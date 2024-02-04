import java.util.Scanner;

public class TrianguloDeMatriz{
    public static void main(String []args){
        int num = 0;
        Scanner teclado = new Scanner(System.in);

        while(num % 2 == 0 || num < 0){
            System.out.println("Informe um numero impar positivo: ");
            num = teclado.nextInt();
        }

        int i = 0, f = 2 * num - 1;
        int cont = 0;

        while(cont < num){
            int n = 0;

            while(n < i){
                System.out.print("0 ");
                n++;
            }
            while(n < f){
                System.out.print("1 ");
                n++;
            }
            while(n < 2 * num - 1){
                System.out.print("0 ");
                n++;
            }
            
            System.out.println(" ");
            i += 1;
            f -= 1;
            cont += 1;
        }
    }
}