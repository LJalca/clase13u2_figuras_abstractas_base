/**
 * Plantilla de subclase concreta Circulo.
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super("Círculo", color);
        // TODO 1: Validar que radio > 0 (si no, lanzar IllegalArgumentException)
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        // TODO 2: Retornar el área del círculo (Math.PI * radio * radio)
        return 0.0;
    }

    @Override
    public double calcularPerimetro() {
        // TODO 3: Retornar el perímetro del círculo (2 * Math.PI * radio)
        return 0.0;
    }
}
