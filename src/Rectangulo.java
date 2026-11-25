/**
 * Plantilla de subclase concreta Rectangulo.
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super("Rectángulo", color);
        // TODO 1: Validar que base > 0 y altura > 0
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // TODO 2: Retornar base * altura
        return 0.0;
    }

    @Override
    public double calcularPerimetro() {
        // TODO 3: Retornar 2 * (base + altura)
        return 0.0;
    }
}
