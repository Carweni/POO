// Classe Baleia (subclasse de Mamífero, implementando Natação):
public class Baleia extends Mamifero implements Natação {
    public Baleia(String nome) {
        super(nome);
    }

    public void nadar() {
        System.out.println(nome + " está nadando no oceano.");
    }
}