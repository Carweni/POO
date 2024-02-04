public class Acara extends Peixe {
    public Acara(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Esse acará não emite som.");
    }
}