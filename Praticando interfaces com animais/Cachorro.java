// Classe cachorro(subclasse de Mamifero):
public class Cachorro extends Mamifero {
    public Cachorro(String nome) {
        super(nome);
    }

    public void emitirSom() {
        System.out.println(nome + " está latindo.");
    }
}