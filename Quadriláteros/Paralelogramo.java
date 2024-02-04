class Paralelogramo extends Quadrilatero {
    private double base, altura;

    public Paralelogramo(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.base = Math.abs(x2 - x1);
        this.altura = Math.abs(y2 - y3);
    }

    public double calcularArea() {
        return base * altura;
    }
}