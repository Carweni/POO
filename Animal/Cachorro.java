public class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Esse cachorro late.");
    }
}