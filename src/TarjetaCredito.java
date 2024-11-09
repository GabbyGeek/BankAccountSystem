/* Reto 4: Herencia de clases y pasos de parámetros
UNIVERSIDAD VIRTUAL DEL ESTADO DE GUANAJUATO 
Nombre del alumno: Luz Gabriela Delgado Bonilla
Matrícula: 23016576
Fecha de elaboración: 8 de noviembre de 2024
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: Yadira Márquez Barrios
*/


/* TarjetaCredito */
public class TarjetaCredito extends CuentaBase {

    public TarjetaCredito(double apertura) {
        super(-apertura); // Deuda negativa
    }

    // Aplicar interés del 15%
    public void sumaInteres(double cantidad) {
        setMontoActual(getMontoActual() * 1.15); // Aumenta deuda en 15%
        System.out.println("Interés aplicado en Tarjeta de Crédito. Deuda actual: $" + getMontoActual());
    }

    // Pagar deuda 
    public void add(double cantidad) {
        setMontoActual(getMontoActual() + cantidad); // Disminuye deuda
        System.out.println("Pago realizado en Tarjeta de Crédito. Deuda actual: $" + getMontoActual());
    }
}

