public class Banco{
   public static void main(String[] args){
      ContaBancaria2 banco[] = new ContaBancaria2[10];

      banco[0] = new ContaBancaria2("Gumball", 10);
      banco[1] = new ContaBancaria2("Darwin", 5);
      banco[5] = new ContaBancaria2("Anais", 950);
      banco[7] = new ContaBancaria2("Ricardo", 0.5);
      banco[9] = new ContaBancaria2("Nicole", 1000);

      System.out.println("Saldo total das contas no banco: ");
      System.out.println(total(banco));
   }

   public static double total(ContaBancaria2 []x){
      double total = 0;

      for(ContaBancaria2 c : x){
         if(c != null){
            total += c.getSaldo();
         }
      }

      return total;
   }
}