public class Complexo{
    private double a;
    private double b;

    public Complexo(){
        a = 0;
        b = 0;
    }

    public Complexo(double i){
        a = i;
        b = 0;
    }

    public void inicializaNumero(double m, double n){
        this.a = m;
        this.b = n;
    }

    public void imprimeNumero(){
        System.out.println(a + " + " + b + "i ");
    }

    public boolean eIgual(Complexo outro){
        return (outro.a == this.a) && (outro.b == this.b);
    }

    public Complexo soma(Complexo outro){
        double p = this.a + outro.a;
        double s = this.b + outro.b;

        Complexo novo = new Complexo();
        novo.a = p;
        novo.b = s;

        return novo;
    }
    
    public Complexo subtrai(Complexo outro){
        double p = this.a - outro.a;
        double s = this.b - outro.b;

        Complexo novo = new Complexo();
        novo.a = p;
        novo.b = s;

        return novo;
    }

    //(a+bi)∗(c+di)=(ac−bd)+(ad+bc)i;
    public Complexo multiplica(Complexo outro){
        double p = this.a * outro.a - this.b * outro.b;
        double s = this.a * outro.b + this.b * outro.a;

        Complexo novo = new Complexo();
        novo.a = p;
        novo.b = s;

        return novo;
    }

    //(a+bi)(c+di)=(ac+bd)/(c2+d2)+(bc−ad)/(c2+d2)i;
    public Complexo divide(Complexo outro){
        double p = (this.a * outro.a + this.b * outro.b) / (outro.a * outro.a + outro.b * outro.b);
        double s = (this.b * outro.a - this.a * outro.b) / (outro.a * outro.a + outro.b * outro.b);

        Complexo novo = new Complexo();
        novo.a = p;
        novo.b = s;

        return novo;
    }
}