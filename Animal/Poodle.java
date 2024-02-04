public class Poodle extends Cachorro {
    public Poodle(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Esse cachorro da raça Poodle late.");
    }
}