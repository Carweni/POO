// Classe Morcego(subclasse de Mamifero):
public class Morcego extends Mamifero {
    public Morcego(String nome) {
        super(nome);
    }

    public void mover() {
        System.out.println(nome + " está voando à noite.");
    }
}