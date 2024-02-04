import java.util.Scanner;

public class PilhaDeRevistasDemo{
    public static void main(String []args){
        PilhaDeRevistas pilha = new PilhaDeRevistas();
        Revista r1 = new Revista("Veja", 100, 10, 1967);
        Revista r2 = new Revista();
        Revista r3 = new Revista("Mundo Estranho", 1000, 10, 2021);
        Revista r4 = new Revista("H2", 10, 10, 2012);
        Scanner tec = new Scanner(System.in);

        // Testando paulatinamente a adicao e a remocao:
        pilha.adicionarNaPilha(r1);
        pilha.imprimir();

        pilha.adicionarNaPilha(r2);
        pilha.imprimir();

        pilha.adicionarNaPilha(r3);
        pilha.imprimir();

        pilha.removerDaPilha();
        pilha.imprimir();

        pilha.adicionarNaPilha(r4);
        pilha.imprimir();

        // Verificando se funciona a verificacao que a pilha esta cheia e contando os espacos livres:
        if(pilha.estaCheia()){
            System.out.println("A pilha esta cheia! ");
        }
        else{
            System.out.println("A pilha ainda nao esta cheia. Ainda ha " + pilha.espacoLivre() + " espacos livres");
            String n = new String();
            int e, m, a;
            System.out.println("Informe o nome de uma revista: ");
            n = tec.nextLine();
            System.out.println("Informe sua edicao: ");
            e = tec.nextInt();
            System.out.println("Informe o mes de sua publicacao: ");
            m = tec.nextInt();
            System.out.println("Informe seu ano de publicacao: ");
            a = tec.nextInt();

            r3.inicializar(n, e, m, a);

            pilha.adicionarNaPilha(r3);
            pilha.imprimir();
        }

        pilha.removerDaPilha();
        pilha.removerDaPilha();
        pilha.imprimir();

        // Verificando se para de remover quando vazia:
        pilha.removerDaPilha();
        pilha.removerDaPilha();
        pilha.removerDaPilha();
        pilha.imprimir();

        tec.close();
    }
}