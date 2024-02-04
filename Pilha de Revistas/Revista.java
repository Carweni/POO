public class Revista{
    private String nome = new String();
    private int edicao;
    private int mes;
    private int ano;

    Revista(){
        this.nome = "Ciencia Hoje";
        this.edicao = 10;
        this.mes = 7;
        this.ano = 2000;
    }

    Revista(String n, int e, int m, int a){
        this.nome = n;

        if(e > 0){
            this.edicao = e;
        }
        else{
            this.edicao = 0;
        }

        if(m > 0 && m < 13){
            this.mes = m;
        }
        else{
            this.mes = 0;
        }

        if(a > 0){
            this.ano = a;
        }
        else{
            this.ano = 0;
        }
    }

    public void inicializar (String n, int e, int m, int a){
        this.nome = n;

        if(e > 0){
            this.edicao = e;
        }
        else{
            this.edicao = 0;
        }

        if(m > 0 && m < 13){
            this.mes = m;
        }
        else{
            this.mes = 0;
        }

        if(a > 0){
            this.ano = a;
        }
        else{
            this.ano = 0;
        }
    }

    public String toString(){
        return "Nome: " + this.nome + "\nEdicao: " + this.edicao + "\nMes: " + this.mes + "\nAno: " + this.ano;
    }
}