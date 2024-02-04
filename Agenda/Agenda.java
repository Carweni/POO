import java.io.Serializable;

public class Agenda implements Serializable {
    private Pessoa pessoas[] = new Pessoa[10];
    private int contador = 0; // Um contador para controlar o número de pessoas na agenda.

    public void adicionarPessoa(String nome, String cpf) {
        if (contador < pessoas.length) {
            Pessoa pessoa = new Pessoa(nome, cpf);
            pessoas[contador] = pessoa;
            contador++;
        } else {
            System.out.println("A agenda está cheia. Não é possível adicionar mais pessoas.");
        }
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) { // Verificar se a posição não está vazia.
                pessoa.imprimirDados();
            }
        }
    }

    public boolean excluirPessoa(String nome) {
        for (int i = 0; i < contador; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
                for (int j = i; j < contador - 1; j++) {
                    pessoas[j] = pessoas[j + 1];
                }
                pessoas[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }
}
