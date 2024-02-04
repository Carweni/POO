public class FilaCliente{
    private Cliente []fila = new Cliente[10]; 
    private int fim;

    FilaCliente(){
        this.fim = 0;
    }

    public boolean filaCheia(){
        if(fim == 10){
            return true;
        }

        return false;
    }

    public boolean filaVazia(){
        if(fim == 0){
            return true;
        }

        return false;
    }

    public void novoCliente(Cliente c){ // Enfileirar.
        if(!filaCheia()){
            this.fila[this.fim] = c;
            this.fim ++;
        }
        else{
            System.out.println("Fila cheia! Volte mais tarde. ");
        }
    }

    public void proximoAtendimento(){ // Desenfileirar.
        if(this.fim == 0){
            System.out.println("Fila vazia! ");
        }
        else{
            System.out.println("\nO proximo cliente a ser atendido sera: ");
            String s = this.fila[0].toString();
            System.out.println(s);

            for(int i = 0; i < this.fim - 1; i++){
                this.fila[i] = this.fila[i + 1];
            }
            this.fim --;
        }
    }

    public void imprimir(){
        if(!filaVazia()){
            int i = 0;
            String s = new String();

            System.out.println("\n==--== CLIENTES NA FILA ==--==");

            while(i < this.fim){
                s = "";
                System.out.println("Posicao: " + (i + 1));
                s = this.fila[i].toString();
                System.out.println(s);
                i++;
            }
        }
    }

    public int espacoLivre(){
        return 10 - this.fim;
    }
}