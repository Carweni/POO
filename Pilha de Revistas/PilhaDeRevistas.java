public class PilhaDeRevistas{
    private Revista[] pilha = new Revista[50]; 
    private int topo;

    PilhaDeRevistas(){
        this.topo = 0;
    }

    // Retorna o numero de espacos livres na pilha:
    public int espacoLivre(){
        return 50 - this.topo;
    }

    // Verifica se a pilha esta cheia:
    public boolean estaCheia(){
        if(this.topo == 50){
            return true;
        }
        
        return false;
    }

    // Verifica se a pilha esta vazia:
    private boolean estaVazia(){
        if(this.topo == 0){
            return true;
        }
        
        return false;
    }

    public void adicionarNaPilha(Revista r){
        if(!estaCheia()){
            pilha[this.topo] = r;
            this.topo ++;
        }
        else{
            System.out.println("Esta pilha esta cheia!!!");
        }
    }

    public void removerDaPilha(){
        if(this.topo > 0){
            this.pilha[this.topo - 1] = null;
            this.topo --;
        }
        else{
            System.out.println("\nPilha vazia!!!");
        }
        
    }
  
    // Imprime o conteudo atual da pilha:
    public void imprimir(){
        if(!estaVazia()){
            int t = this.topo;
            String s = new String();
            System.out.println("\n==--== PILHA ATUAL ==--==");
            
            while(t > 0){
                s = "";
                System.out.println("Posicao " + t + ":");
                s = pilha[t - 1].toString();
                System.out.println(s);
                t--;
            }
        }
    }
}