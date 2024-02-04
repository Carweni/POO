// Classe Lobo(subclasse de Mamifero):
public class Lobo extends Mamifero {
    public Lobo(String nome) {
        super(nome);
    }

    public void emitirSom() {
        System.out.println(nome + " está uivando.");
    }
}