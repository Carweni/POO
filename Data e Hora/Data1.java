public class Data1 {
    byte dia, mes;
    short ano;
 
    void inicializaData(byte d, byte m, short a){
       if (dataEhValida (d, m, a)){
           this.dia = d;
           this.mes = m;
           this.ano = a;
          }
       else 
       {
         System.out.println("Data invalida! Zerando...");
           dia = 0; 
           mes = 0; 
           ano = 0;
       }
   }
 
    boolean dataEhValida (byte d ,byte m, short a){
       if ((d >= 1) && (d <= 31) && (m >= 1) && (m <= 12)){
          return true;
       }
       else{
          return false;
       }
    }
 
    boolean ehIgual (Data1 outraData){
       if ((dia == outraData.dia) && (mes == outraData.mes) && (ano == outraData.ano)){
           return true ; 
       }
       else{
          return false ; 
       }
    } 
    
    public String toString(){
      String s = new String();

      if(dia < 10){
          s += "0";
      }

      s += dia +"/";
      
      if(mes < 10){
          s += "0";
      }

      s += mes + "/";

      if(ano < 10){
          s += "0";
      }

      s += ano;

      return s;
  }   
}
