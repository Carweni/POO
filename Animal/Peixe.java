public class Peixe extends Animal{
    public Peixe(String nome, int idade) {
        super(nome, idade);
    }

    public void mover() {
        System.out.println("Esse animal nada.");
    }

    public void emitirSom(){
        System.out.println("Esse animal não emite som. ");
    }

}