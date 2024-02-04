import java.util.Scanner;

public class UsaFilaCliente{
    public static void main (String []args){
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("John", 'm');
        Cliente c3 = new Cliente("Mary", 'f');
        Cliente c4 = new Cliente("Ursinho", 'i');
        FilaCliente fila = new FilaCliente();
        Scanner tec = new Scanner(System.in);

        // Verificando paulatinamente o enfileiramento e o desenfileiramento:
        fila.novoCliente(c1);
        fila.novoCliente(c2);
        fila.novoCliente(c3);
        fila.imprimir();
        
        fila.proximoAtendimento();
        fila.novoCliente(c4);

        fila.imprimir();

        // Verificando se o programa consegue identificar quando a fila esta cheia:
        if(fila.filaCheia()){
            System.out.println("\nA fila esta cheia no momento! Volte mais tarde. ");
        }
        else{
            System.out.println("\nAinda temos " + fila.espacoLivre() + " vaga(s). Voce podera ser atendido. ");
            String n = new String();
            char s;
            System.out.println("Para entrar na fila, informe seu nome: ");
            n = tec.nextLine();
            System.out.println("Informe seu sexo: ");
            s = tec.nextLine().charAt(0);

            c1.setNome(n);
            c1.setSexo(s);
            fila.novoCliente(c1);
            fila.imprimir();
        }

        fila.proximoAtendimento();
        fila.proximoAtendimento();

        fila.imprimir();

        // Verificando se para de remover e imprimir caso a fila esteja vazia:
        fila.proximoAtendimento();
        fila.proximoAtendimento();
        fila.proximoAtendimento();

        fila.imprimir();

        tec.close();
    }
}