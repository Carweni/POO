// Classe Mamífero (subclasse de Animal):
public class Mamifero extends Animal implements Amamentação {
    public Mamifero(String nome) {
        super(nome);
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando.");
    }
}