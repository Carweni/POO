// Classe Animal (classe base):
public class Animal implements Movimento, Som{
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void mover() {
        System.out.println(nome + " está se movendo.");
    }

    public void emitirSom() {
        System.out.println(nome + " está emitindo som genérico de animal. ");
    }
}