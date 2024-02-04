public class Animal{
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void mover() {
        System.out.println("Esse animal anda.");
    }

    public void emitirSom(){
        System.out.println("Esse animal emite som genérico");
    }
}