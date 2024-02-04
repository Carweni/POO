import java.util.Scanner;

public class RationalDemo{
    public static void main (String []args){
        Rational r1 = new Rational(3, 6);
        Rational r2 = new Rational();

        // Testando inicializações e a impressão em forma de fração:
        r1.imprimir();
        r2.imprimir();

        int num, den = 0;
        Scanner tec = new Scanner(System.in);

        System.out.println("\nInforme o numerador do número racional que passará por operações aritméticas junto com 1/2 (Se for 0, a operação de divisão não será executada): ");
        num = tec.nextInt();

        while(den == 0){
            System.out.println("\nInforme o denominador do número (não pode ser 0): ");
            den = tec.nextInt();
        }
        
        Rational r3 = new Rational(num, den);
        System.out.println("\nEste foi o número informado: ");
        r3.imprimir();

        System.out.println("\nCom quantas casas decimais você quer a precisão dos resultados? ");
        int precisao = tec.nextInt();

        System.out.println("\nOPERAÇÕES:\n\n=== SOMA ===");
        Rational sum = new Rational();
        sum = r1.somar(r3);
        sum.imprimirPontoFlutuante(precisao);

        System.out.println("\n=== SUBTRAÇÃO ===");
        Rational sub = new Rational();
        sub = r1.subtrair(r3);
        sub.imprimirPontoFlutuante(precisao);

        System.out.println("\n=== MULTIPLICAÇÃO ===");
        Rational mult = new Rational();
        mult = r1.multiplicar(r3);
        mult.imprimirPontoFlutuante(precisao);

        if(num != 0){
            System.out.println("\n=== DIVISÃO ===");
            Rational div = new Rational();
            div = r1.dividir(r3);
            div.imprimirPontoFlutuante(precisao);
        }
    }
}