// Classe Avestruz (subclasse de Ave):
public class Avestruz extends Ave {
    public Avestruz(String nome) {
        super(nome);
    }

    public void mover() {
        System.out.println(nome + " está se movendo na terra.");
    }
}