import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoAgendaLer {

    public static void main(String[] args) {
  
        File arquivo = new File("agenda.dat");
  
        try {
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin);
  
            Agenda agendaArq = (Agenda) oin.readObject(); // Lê a Agenda completa
            oin.close();
            fin.close();
  
            Pessoa[] pessoas = agendaArq.getPessoas(); 

            for (Pessoa p : pessoas) {
                if (p != null) {
                    p.imprimirDados();
                }
            }
        } catch (Exception ex) {
            System.err.println("Erro: " + ex.toString());
        }
    }
}
