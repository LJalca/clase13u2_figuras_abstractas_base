import java.util.ArrayList;
import java.util.List;

/**
 * Plantilla base del taller práctico: Clase Abstracta Figura y Subclases Concretas.
 */
public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        // TODO A: Agregar al menos una instancia de Circulo, Rectangulo, Triangulo y Cuadrado a la lista figuras.
        // Ejemplo: figuras.add(new Circulo("Azul", 5.0));

        // TODO B: Recorrer la lista con un ciclo for-each de tipo Figura,
        // imprimir figura.mostrarFicha() y acumular areaTotal y perimetroTotal.

        // TODO C: Determinar cuál figura tiene la mayor área e imprimir los totales finales.
        System.out.println("Plantilla Taller Figura lista para completar (figuras actuales: " + figuras.size() + ")");
    }
}
