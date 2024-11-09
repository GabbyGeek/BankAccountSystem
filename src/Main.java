/* Reto 4: Herencia de clases y pasos de parámetros
UNIVERSIDAD VIRTUAL DEL ESTADO DE GUANAJUATO 
Nombre del alumno: Luz Gabriela Delgado Bonilla
Matrícula: 23016576
Fecha de elaboración: 8 de noviembre de 2024
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: Yadira Márquez Barrios
*/


/* Clase Main para pruebas */
public class Main {
    public static void main(String[] args) {
        // Crear instancias
        TarjetaDebito debito = new TarjetaDebito(1000);
        TarjetaCredito credito = new TarjetaCredito(2000);
        CuentaAhorro ahorro = new CuentaAhorro(3000);

        // Operaciones en TarjetaDebito
        debito.add(500);   // Realizar un depósito
        debito.retirar(200); // Realizar un retiro
        System.out.println("Saldo final Tarjeta de Débito: $" + debito.getMontoActual());

        // Operaciones en TarjetaCredito
        credito.add(1000);       // Reducir deuda
        credito.sumaInteres(0); // Aplicar interés
        System.out.println("Deuda final Tarjeta de Crédito: $" + credito.getMontoActual());

        // Operaciones en CuentaAhorro
        ahorro.invertir(0); // Aplicar inversión
        System.out.println("Saldo final Cuenta de Ahorro: $" + ahorro.getMontoActual());
    }
}
