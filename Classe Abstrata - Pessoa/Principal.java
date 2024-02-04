public class Principal {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[10];

        pessoas[0] = new Aluno("Carla", 21, "Administração", 3, 756);
        pessoas[1] = new Aluno("Luca", 19, "História", 1, 123);
        pessoas[2] = new Aluno("Junior", 22, "Contabilidade", 2, 789);
        pessoas[3] = new Aluno("Alexia", 23, "Letras", 3, 456);
        pessoas[4] = new Aluno("Giovanni", 24, "Geografia", 4, 101);

        pessoas[5] = new Professor("André", 42, "Economia", "Doutorado");
        pessoas[6] = new Professor("Rosa", 43, "Cálculo Diferencial", "Doutorado");
        pessoas[7] = new Professor("Wilhelmina", 44, "Semântica", "Mestrado");
        pessoas[8] = new Professor("José", 45, "Física", "Doutorado");
        pessoas[9] = new Professor("Clara", 46, "Desenho Técnico", "Mestrado");

        System.out.println("=== INFORMAÇÕES DAS PESSOAS ===\n");

        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                aluno.mostrarInformacoesAluno();
            } else if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                professor.mostrarInformacoesProfessor();
            }

            System.out.println();
        }

        System.out.println("=== AÇÕES DAS PESSOAS ===\n");

        for (Pessoa pessoa : pessoas) {
            pessoa.realizarAcao();
        }
    }
}
