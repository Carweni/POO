// Classe Ave (subclasse de Animal):
public class Ave extends Animal{
    public Ave(String nome) {
        super(nome);
    }

    public void mover() {
        System.out.println(nome + " está voando.");
    }

    public void emitirSom() {
        System.out.println(nome + " está fazendo um som de ave.");
    }
}