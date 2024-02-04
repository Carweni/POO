public class AreaDeQuadrilateros {
    public static void main(String[] args) {
        Trapezio trapezio = new Trapezio(0, 0, 4, 0, 3, 3, 1, 3);
        Paralelogramo paralelogramo = new Paralelogramo(0, 0, 4, 0, 5, 5, 1, 5);
        Retangulo retangulo = new Retangulo((double)0, (double)0, (double)4, (double)0, (double)4, (double)3, (double)0, (double)3);
        Quadrado quadrado = new Quadrado(0, 0, 4, 0, 4, 4, 0, 4);

        System.out.println("Área do Trapézio: " + trapezio.calcularArea());
        System.out.println("Área do Paralelogramo: " + paralelogramo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
    }
}