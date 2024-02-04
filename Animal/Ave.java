public class Ave extends Animal{
    public Ave(String nome, int idade) {
        super(nome, idade);
    }

    public void mover() {
        System.out.println("Essa ave voa.");
    }

    public void emitirSom(){
        System.out.println("Esse animal gralha. ");
    }

}