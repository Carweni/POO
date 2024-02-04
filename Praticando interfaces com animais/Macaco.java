//Classe Macaco(subclasse de Mamifero):
public class Macaco extends Mamifero {
    public Macaco(String nome) {
        super(nome);
    }

    public void mover() {
        System.out.println(nome + " está pulando de galho em galho.");
    }
}