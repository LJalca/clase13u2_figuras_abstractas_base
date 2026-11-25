/**
 * Plantilla base para la práctica de Clases Abstractas (Sesión 13).
 *
 * TODO 1: Convierte esta clase en abstracta agregando la palabra clave `abstract`
 *         en la firma: public abstract class Figura
 */
public abstract class Figura {
    protected String nombre;
    protected String color;

    public Figura(String nombre, String color) {
        // TODO 2: Validar que nombre y color no sean nulos ni vacíos (lanzar IllegalArgumentException)
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    // TODO 3: Verificar las firmas abstractas que toda subclase concreta debe implementar:
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    /**
     * TODO 4: Completar el método concreto mostrarFicha() para que retorne:
     * nombre + " (" + color + ") | Área: " + ... + " | Perímetro: " + ...
     */
    public String mostrarFicha() {
        return nombre + " (" + color + ") | Pendiente implementar mostrarFicha()";
    }

    @Override
    public String toString() {
        return mostrarFicha();
    }
}
