public class Rational{
    private int numerador;
    private int denominador;

    public Rational() {
        this.numerador = 0;
        this.denominador = 1;
    }

    private int mdc(int a, int b) { 
        return b == 0 ? a : mdc(b, a % b);
    }

    public Rational(int a, int b) {
        if (b == 0) { 

            System.out.println("Denominador não pode ser zero"); 
        }

        int mdc = mdc(a, b);

        this.numerador = a / mdc; 
        this.denominador = b / mdc;
    } 

    public Rational somar(Rational rat2){
        int a, b;

        a = this.numerador * rat2.denominador + this.denominador * rat2.numerador;
        b = this.denominador * rat2.denominador;

        Rational novo = new Rational(a, b);
        return novo;
    }
 
    public Rational subtrair(Rational rat2){
        int a, b;

        a = this.numerador * rat2.denominador - this.denominador * rat2.numerador;
        b = this.denominador * rat2.denominador;

        Rational novo = new Rational(a, b);
        return novo;
    }

    public Rational multiplicar(Rational rat2){
        int a, b;

        a = this.numerador * rat2.numerador;
        b = this.denominador * rat2.denominador;

        Rational novo = new Rational(a, b);
        return novo;
    }

    public Rational dividir(Rational rat2){
        int a, b;

        a = this.numerador * rat2.denominador;
        b = this.denominador * rat2.numerador;

        if(b == 0){
            System.out.println("ERRO: Divisão por 0 não é possível. ");
        }

        Rational novo = new Rational(a, b);
        return novo;
    }

    public void imprimir(){
        if((this.numerador < 0 || this.denominador < 0) && (this.numerador > 0 || this.denominador > 0)){
            System.out.print("-");
        }

        System.out.println(Math.abs(this.numerador) + " / " + Math.abs(this.denominador));
    }

    public void imprimirPontoFlutuante(int p) {
        int int1 = this.numerador / this.denominador;
        int resto = this.numerador % this.denominador;
        
        if((this.numerador < 0 || this.denominador < 0) && (this.numerador > 0 || this.denominador > 0)) {
            System.out.print("-");
        }

        System.out.print(Math.abs(int1) + ".");
        
        for (int i = 0; i < p; i++) {
            resto *= 10;
            System.out.print(Math.abs(resto) / Math.abs(this.denominador));
            resto %= this.denominador;
        }
        
        System.out.println();
    }
}