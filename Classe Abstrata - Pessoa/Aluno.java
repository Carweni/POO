public class Aluno extends Pessoa{
    private String curso = new String();
    private int ano;
    private int ra;

    public Aluno(){
        super("Luca", 19);
        this.curso = "História";
        this.ano = 1;
        this.ra = 123;
    }

    public Aluno(String n, int i, String c, int a, int r){
        super(n, i);
        this.curso = c;
        this.ano = a;
        this.ra = r;
    }

    public void mostrarInformacoesAluno(){
        imprimirInformacoes();
        System.out.println("Curso: " + this.curso + "\nAno: " + this.ano + "\nRegistro Acadêmico: " + this.ra);
    }

    public void realizarAcao(){
        System.out.println(getNome() + " está lendo um livro sobre o seu curso, " + this.curso + ".");
    }
}