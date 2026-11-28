# Lectura Breve (TA • 1.0h): Abstracción y Clases Abstractas en Java

**Asignatura:** Programación Orientada a Objetos (`CDS-0201`) — Unidad 2 • Sesión 13 (23/11/2026)  
**Tiempo estimado de lectura y análisis:** 20 minutos + reflexión en equipo

---

## 1. ¿Qué es la Abstracción en POO?
Abstraer consiste en **enfocarse en lo esencial de un concepto y ocultar los detalles secundarios** que varían en cada caso particular. Cuando hablamos de una *Figura geométrica*, sabemos que toda figura tiene un nombre, un color, un área y un perímetro; sin embargo, la fórmula exacta para calcular el área depende de si estamos tratando con un círculo, un rectángulo, un triángulo o un cuadrado.

## 2. ¿Por qué Existen las Clases Abstractas (`abstract class`)?
En muchos diseños de software encontramos clases padre que agrupan atributos y comportamientos compartidos, pero que **no representan un objeto completo que tenga sentido crear por sí solo**. Por ejemplo:
- No tiene sentido instanciar una `Figura` genérica sin forma definida.
- No tiene sentido enviar una `Notificacion` genérica sin saber si sale por correo o por SMS.

Declarar una clase como `abstract` ofrece tres beneficios clave:
1. **Evita objetos incompletos:** Java impide ejecutar `new Figura(...)`.
2. **Reutiliza código común:** Permite definir atributos `protected`, constructores validados (`super(...)`) y métodos concretos tipo plantilla (como `mostrarFicha()`).
3. **Establece un contrato obligatorio:** Mediante métodos abstractos (`public abstract double calcularArea();`), garantiza que ninguna subclase concreta pueda compilar si olvida implementar sus cálculos propios con `@Override`.

## 3. Clases Abstractas en Diagramas UML
En el estándar UML, una clase abstracta se identifica visualmente de dos formas complementarias:
- Con el estereotipo **`«abstract»`** sobre el nombre de la clase.
- Escribiendo el **nombre de la clase y sus métodos abstractos en *cursiva***.
- Conectando cada subclase concreta hacia la clase padre mediante una flecha continua con **triángulo hueco** (herencia / generalización).

## 4. Preguntas de Reflexión Colaborativa 
1. ¿Por qué una clase abstracta puede tener constructor si no se puede instanciar con `new`?
2. ¿Qué ocurre en Java si una subclase concreta hereda de `Figura` pero omite implementar `calcularPerimetro()`?
3. ¿Por qué es válido declarar `List<Figura> figuras = new ArrayList<>();` aunque `Figura` sea abstracta?
