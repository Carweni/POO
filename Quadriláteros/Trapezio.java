class Trapezio extends Quadrilatero {
    private double altura, baseMaior, baseMenor;

    public Trapezio(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.altura = Math.abs(y2 - y3);
        if((x2 - x1) > (x4 - x3)){
            this.baseMaior = Math.abs(x2 - x1);
            this.baseMenor = Math.abs(x4 - x3);
        }
        else{
            this.baseMaior = Math.abs(x4 - x3);
            this.baseMenor = Math.abs(x2 - x1);
        }
    }

    public double calcularArea() {
        return ((baseMaior + baseMenor) / 2) * altura;
    }
}