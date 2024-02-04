// Classe Leão(subclasse de Mamifero):
public class Leão extends Mamifero{
    public Leão(String nome) {
        super(nome);
    }

    public void emitirSom() {
        System.out.println(nome + " está rugindo.");
    }
}