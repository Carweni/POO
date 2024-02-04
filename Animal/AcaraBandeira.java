public class AcaraBandeira extends Acara {
    public AcaraBandeira(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Esse acará do tipo bandeira não emite som.");
    }
}