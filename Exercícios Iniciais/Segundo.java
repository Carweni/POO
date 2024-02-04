import java.util.Scanner;
import java.util.Random;
import java.io.Console;

public class Segundo{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        Console console = System.console();

        System.out.print("Digite um numero inteiro: ");
        int i = teclado.nextInt();
        System.out.print("Digite um numero real: ");
        double r = teclado.nextDouble();
        String s = teclado.nextLine();
        s = teclado.nextLine();

        System.out.println("\n\ninteiro: " + i + ", real: " + r);
        System.out.println("Frase: " + s);

        Random x = new Random();
        int j = x.nextInt(10);
        System.out.println("\nUm numero inteiro pseudo-aleatoria: " + j);

    }
}
