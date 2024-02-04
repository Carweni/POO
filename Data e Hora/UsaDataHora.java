import java.util.Scanner;

public class UsaDataHora {
    public static void main(String []args){
        DataHora estaDataHora1 = new DataHora((byte)15, (byte)45, (byte)58, (byte)12, (byte)7, (short)1998);
        DataHora estaDataHora2 = estaDataHora1;
        DataHora estaDataHora3 = new DataHora((byte)9, (byte)8, (byte)45, (byte)19, (byte)10, (short)1983);
        int d = 0, m = 0, a = 0, h = 0, min = 0, seg = 0;
        Scanner tec = new Scanner(System.in);

        System.out.println("DATA e HORA 1");
        String s = estaDataHora1.toString();
        System.out.println(s);

        System.out.println("DATA e HORA 2");
        s = estaDataHora2.toString();
        System.out.println(s);

        System.out.println("DATA e HORA 3");
        s = estaDataHora3.toString();
        System.out.println(s);

        if(estaDataHora1.ehIgual(estaDataHora2)){
            System.out.println("A data e hora 1 eh igual a data e hora 2.");
        }
        else{
            System.out.println("A data e hora 1 e a data e hora 2 nao sao iguais. ");
        }
        
        if(estaDataHora1.ehIgual(estaDataHora3)){
            System.out.println("A data e hora 1 eh igual a data e hora 3.");
        }
        else{
            System.out.println("A data e hora 1 e a data e hora 3 nao sao iguais. ");
        }

        System.out.println("Informe um dia: ");
        d = tec.nextInt();
        System.out.println("Informe um mes: ");
        m = tec.nextInt();
        System.out.println("Informe um ano: ");
        a = tec.nextInt();
        System.out.println("Informe uma hora: ");
        h = tec.nextInt();
        System.out.println("Informe minutos: ");
        min = tec.nextInt();
        System.out.println("Informe segundos: ");
        seg = tec.nextInt();

        estaDataHora3.inicializaDataHora((byte)h, (byte)min, (byte)seg, (byte)d, (byte)m, (short)a);

        System.out.println("NOVA DATA e HORA 3");
        s = estaDataHora3.toString();
        System.out.println(s);

        if(estaDataHora1.ehIgual(estaDataHora3)){
            System.out.println("A data e hora 1 eh igual a data e hora 3.");
        }
        else{
            System.out.println("A data e hora 1 e a data e hora 3 nao sao iguais. ");
        }

        tec.close();
    }
}
