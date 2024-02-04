public class Data{
   byte dia, mes, ano;

   void inicializarData(byte d, byte m, byte a){
      if (dataEhValida (d, m, a)){
         dia = d;
         mes = m; 
         ano = a ;
      }
      else 
      {
         dia = 0; 
         mes = 0; 
         ano = 0;
      }
   } 

   boolean dataEhValida (byte d ,byte m, byte a){
      if ((d >=1) && (d <= 31) && (m >= 1) && (m <= 12)){
         return true;
      }
      else{
         return false;
      }
   }

   boolean ehIgual (Data outraData){
      if ((dia == outraData.dia) && (mes == outraData.mes) && (ano == outraData.ano)){
          return true ; 
      }
      else{
         return false ; 
      }
   } 
   
   void mostraData(){
      System.out.print(this.dia);
      System.out.print("/");
      System.out.print(this.mes);
      System.out.print("/");
      System.out.println(this.ano);
   } 
 
}
