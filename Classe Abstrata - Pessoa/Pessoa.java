public abstract class Pessoa{
    String nome = new String();
    int idade;

    public Pessoa(){
        this.nome = "Eloah";
        this.idade = 50;
    }

    public Pessoa(String s, int i){
        this.nome = s;
        this.idade = i;
    }

    public String getNome(){
        return this.nome;
    }

    public void imprimirInformacoes(){          // Método Concreto.
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public abstract void realizarAcao();        // Método Abstrato.
}