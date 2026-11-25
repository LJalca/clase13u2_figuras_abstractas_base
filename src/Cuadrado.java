/**
 * Plantilla de subclase concreta Cuadrado.
 */
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String color, double lado) {
        super("Cuadrado", color);
        // TODO 1: Validar que lado > 0
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // TODO 2: Retornar lado * lado
        return 0.0;
    }

    @Override
    public double calcularPerimetro() {
        // TODO 3: Retornar 4 * lado
        return 0.0;
    }
}
