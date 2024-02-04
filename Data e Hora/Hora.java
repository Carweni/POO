public class Hora{
    byte hora, minutos, segundos; 

    void inicializaHora(byte hora, byte minutos, byte segundos){
        if (horaEhValida (hora, minutos, segundos)){
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }
        else 
        {
            System.out.println("Hora invalida! Zerando...");
            this.hora = 0; 
            this.minutos = 0; 
            this.segundos = 0;
        }
    } 

    boolean horaEhValida (byte h, byte m, byte s){
        if ((h >= 0) && (h <= 23) && (m >= 0) && (m <= 59) && (s >= 0) && (s <= 59)){
            return true;
        }
        else{
            return false;
        }
    }

    boolean ehIgual (Hora outraHora){
        if ((this.hora == outraHora.hora) && (this.minutos == outraHora.minutos) && (this.segundos == outraHora.segundos)){
            return true ; 
        }
        else{
            return false ; 
        }
    } 
    
    public String toString(){
        String s = new String();

        if(hora < 10){
            s += "0";
        }

        s += hora +":";
        
        if(minutos < 10){
            s += "0";
        }

        s += minutos + ":";

        if(segundos < (byte)10){
            s += "0";
        }

        s += segundos;

        return s;
    } 
}