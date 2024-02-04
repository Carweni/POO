public class Mamifero extends Animal{
    public Mamifero(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom(){
        System.out.println("Esse animal emite som genérico de mamífero. ");
    }
}