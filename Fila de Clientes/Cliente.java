public class Cliente{
    private String nome = new String();
    private char sexo;

    Cliente(){
        nome = "Fulano";
        sexo = 'i';
    }

    Cliente(String n, char s){
        this.nome = n;
        this.sexo = s;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setSexo(char s){
        this.sexo = s;
    }

    public String toString(){
        String s = "Nome: " + this.nome + "\nSexo: ";

        if(this.sexo == 'f' || this.sexo == 'F'){
            s += "Feminino";
        }
        else if(this.sexo == 'm' || this.sexo == 'M'){
            s += "Masculino";
        }
        else{
            s += "Indeterminado";
        }

        return s;
    }
}