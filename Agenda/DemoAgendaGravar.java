import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DemoAgendaGravar {
    public static void main(String[] args) {
        // Criar uma instância de Agenda
        Agenda agenda = new Agenda();
        
        // Adicionar pessoas à agenda
        agenda.adicionarPessoa("Carl", "102938");

        File arquivo = new File("agenda.dat");

        try {
            FileOutputStream fout = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(agenda);
            oos.flush();
            oos.close();
            fout.close();
        } catch (Exception e) {
            System.err.println("Erro ao gravar a agenda: " + e.toString());
        }
    }
}
