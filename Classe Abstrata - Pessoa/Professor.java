public class Professor extends Pessoa{
    private String materia = new String();
    private String graduacao = new String(); 

    public Professor(){
        super("Noah", 37);
        this.materia = "Comunicação";
        this.graduacao = "Mestrado";
    }

    public Professor(String n, int i, String m, String g){
        super(n, i);
        this.materia = m;
        this.graduacao = g;
    }

    public void mostrarInformacoesProfessor(){
        imprimirInformacoes();
        System.out.println("Materia: " + this.materia + "\nGraduação: " + this.graduacao);
    }

    public void realizarAcao(){
        System.out.println(getNome()+ " está ministrando uma aula sobre sua matéria, " + this.materia + ".");
    }
}