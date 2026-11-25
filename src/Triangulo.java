/**
 * Plantilla de subclase concreta Triangulo.
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(String color, double base, double altura, double ladoA, double ladoB, double ladoC) {
        super("Triángulo", color);
        // TODO 1: Validar que todas las medidas sean mayores a cero
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        // TODO 2: Retornar (base * altura) / 2.0
        return 0.0;
    }

    @Override
    public double calcularPerimetro() {
        // TODO 3: Retornar ladoA + ladoB + ladoC
        return 0.0;
    }
}
