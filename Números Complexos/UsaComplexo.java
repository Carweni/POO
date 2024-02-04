import java.util.Scanner;

public class UsaComplexo{
    public static void main(String[] args){
        Complexo numero = new Complexo(5);
        Complexo numero2 = new Complexo(9);
        Complexo numero3 = new Complexo();

        // Testes do método construtor de um parâmetro:
        numero.imprimeNumero();
        numero2.imprimeNumero();
        // Testes do método construtor padrão:
        numero3.imprimeNumero();
        
        numero.inicializaNumero(1, 2);
        numero2.inicializaNumero(1, 2);
        numero3.inicializaNumero(7, 8);

        // Teste do método inicializaNumero():
        numero.imprimeNumero();
       
        // Testes para o método eIgual():
        if (numero.eIgual(numero2)) {
            System.out.println("Os números 1 e 2 são iguais.");
        } else {
            System.out.println("Os números 1 e 2 são diferentes.");
        }

        if (numero.eIgual(numero3)) {
            System.out.println("Os números 1 e 3 são iguais: ");
        } else {
            System.out.println("Os números 1 e 3 são diferentes.");
        }

        Scanner tec = new Scanner(System.in);

        System.out.println("Algumas operações serão feitas com o seguinte número real e outro, informado por ti: ");
        numero2.imprimeNumero();
        System.out.println("Informe a parte real do número complexo para as operações seguintes: ");
        double a = tec.nextDouble();
        System.out.println("Informe a parte imaginária do número complexo para as operações seguintes: ");
        double b = tec.nextDouble();

        // Teste para o método inicializaNumero() com entrada de dados pelo usuário:
        numero.inicializaNumero(a, b);

        // Testes para as operacoes de soma, subtração, multiplicação e divisão:
        System.out.println("Soma: ");
        Complexo sum = new Complexo();
        sum = numero.soma(numero2);
        sum.imprimeNumero();

        System.out.println("Subtração: ");
        Complexo sub = new Complexo();
        sub = numero.subtrai(numero2);
        sub.imprimeNumero();

        System.out.println("Multiplicação: ");
        Complexo mult = new Complexo();
        mult = numero.multiplica(numero2);
        mult.imprimeNumero();

        System.out.println("Divisão: ");
        Complexo div = new Complexo();
        div = numero.divide(numero2);
        div.imprimeNumero();

    }
}