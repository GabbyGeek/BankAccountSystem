/* Reto 4: Herencia de clases y pasos de parámetros
UNIVERSIDAD VIRTUAL DEL ESTADO DE GUANAJUATO 
Nombre del alumno: Luz Gabriela Delgado Bonilla
Matrícula: 23016576
Fecha de elaboración: 8 de noviembre de 2024
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: Yadira Márquez Barrios
*/


/* CuentaBase */
public class CuentaBase {
    private double montoActual;
    
    // Constructor de CuentaBase
    public CuentaBase(double montoApertura) {
        this.montoActual = montoApertura;
    }
    
    // Monto actual
    public double getMontoActual() {
        return montoActual;
    }
    
    // Modificar el monto actual
    protected void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
}

