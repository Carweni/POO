// Classe Gato(subclasse de Mamifero):
public class Gato extends Mamifero{
    public Gato(String nome) {
        super(nome);
    }

    public void emitirSom() {
        System.out.println(nome + " está miando.");
    }
}