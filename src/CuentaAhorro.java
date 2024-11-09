/* Reto 4: Herencia de clases y pasos de parámetros
UNIVERSIDAD VIRTUAL DEL ESTADO DE GUANAJUATO 
Nombre del alumno: Luz Gabriela Delgado Bonilla
Matrícula: 23016576
Fecha de elaboración: 8 de noviembre de 2024
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: Yadira Márquez Barrios
*/

/* CuentaAhorro */
public class CuentaAhorro extends CuentaBase {

    public CuentaAhorro(double apertura) {
        super(apertura);
    }

    // Invertir incrementar saldo en 10%
    public void invertir(double cantidad) {
        setMontoActual(getMontoActual() * 1.10); // Aumenta monto en 10%
        System.out.println("Inversión realizada en Cuenta de Ahorro. Saldo actual: $" + getMontoActual());
    }
}
