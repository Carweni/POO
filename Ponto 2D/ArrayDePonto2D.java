public class ArrayDePonto2D 
{
  private Ponto2D[] array; 

  public ArrayDePonto2D(int numero){ 
    array = new Ponto2D[numero]; 
  }
  
  public int tamanho(){ 
    return array.length;
  }

  public void modifica(int posicao, Ponto2D obj){
    if ((posicao >= 0) && (posicao < array.length))
      array[posicao] = obj;
  }

 public Ponto2D valor(int posicao){ 
    if ((posicao >= 0) && (posicao < array.length))
      return array[posicao];
    else
      return null;
 }

 public String toString(){
   String resultado = "O array tem " + array.length + " elementos:\n";
   for(int c = 0; c < array.length; c++)
       resultado += array[c] + " ";
   return resultado;
 }

} 
