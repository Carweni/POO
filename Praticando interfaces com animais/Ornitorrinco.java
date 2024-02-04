//Classe Ornitorrinco(subclasse de Mamifero, implementando a interface Natação):
public class Ornitorrinco extends Mamifero implements Natação{
    public Ornitorrinco(String nome) {
        super(nome);
    }

    public void nadar() {
        System.out.println(super.getNome() + " está nadando no rio.");
    }

    public void mover() {
        System.out.println(super.getNome() + " está se movendo na água e na terra.");
    }
}