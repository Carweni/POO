class DataHora{
    private Data1 estaData = new Data1();
    private Hora estaHora = new Hora();

    DataHora(byte hora, byte minuto, byte segundo, byte dia, byte mes, short ano)
    {
        estaData.inicializaData(dia, mes, ano) ;
        estaHora.inicializaHora(hora, minuto, segundo) ;
    }

    DataHora(byte dia, byte mes, byte ano)
    {
        estaData.inicializaData(dia, mes, ano) ;
        estaHora.inicializaHora((byte)0, (byte)0, (byte)0); 
    }

    void inicializaDataHora(byte hora, byte minuto, byte segundo, byte dia, byte mes, short ano){
        estaData.inicializaData(dia, mes, ano);
        estaHora.inicializaHora(hora, minuto, segundo);
    }

    boolean ehIgual(DataHora outraDataHora){
        if (this.estaData.ehIgual(outraDataHora.estaData) && this.estaHora.ehIgual(outraDataHora.estaHora)){
            return true ; 
        }
        else{
            return false ; 
        }
    } 

    public String toString ( )
    {
        return estaData.toString() + " " + estaHora.toString() ;
    }
}
