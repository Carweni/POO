// Classe Pinguim (subclasse de Ave, implementando Natação):
public class Pinguim extends Ave implements Natação {
    public Pinguim(String nome) {
        super(nome);
    }

    public void mover() {
        System.out.println(nome + " está se movendo na terra e na água.");
    }

    public void nadar() {
        System.out.println(nome + " está nadando.");
    }
}