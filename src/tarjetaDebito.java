/* Reto 4: Herencia de clases y pasos de parámetros
UNIVERSIDAD VIRTUAL DEL ESTADO DE GUANAJUATO 
Nombre del alumno: Luz Gabriela Delgado Bonilla
Matrícula: 23016576
Fecha de elaboración: 8 de noviembre de 2024
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: Yadira Márquez Barrios
*/

/* TarjetaDebito */
public class TarjetaDebito extends CuentaBase {

    public TarjetaDebito(double apertura) {
        super(apertura);
    }

    // Agregar dinero en la cuenta 
    public void add(double cantidad) {
        setMontoActual(getMontoActual() + cantidad);
        System.out.println("Depósito realizado en Tarjeta de Débito. Saldo actual: $" + getMontoActual());
    }

    // Retirar de la cuenta 
    public void retirar(double cantidad) {
        if (getMontoActual() >= cantidad) {
            setMontoActual(getMontoActual() - cantidad);
            System.out.println("Retiro realizado en Tarjeta de Débito. Saldo actual: $" + getMontoActual());
        } else {
            System.out.println("Fondos insuficientes para retirar.");
        }
    }
}

        
