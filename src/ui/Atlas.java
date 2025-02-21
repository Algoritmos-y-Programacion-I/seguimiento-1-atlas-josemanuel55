
package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_NOCHE = 150000;
    final double COSTO_TRAYECTO_BUS = 80000;
    final double PORCENTAJE_ SERVICIO = 0.10;

	private Atlas() {
		escaner = new Scanner(System.in);
    }
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre;
        Int edad;
        String documento;
        String ciudad;
        int noches;
        int tipotransporte;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
        System.out.println("Cual es tu edad?");
        edad = escaner.nextLInt();
        System.out.println("Cual es tu numero de identificacion?");
        documento = escaner.nextLine();
        System.out.println("Cuantas noches te vas a hospedar,(1-4)");
        noches = escaner.nextInt();
        System.out.println("en que ciudad estas cotizando?");
        ciudad = escaner.nextline();
        System.out.println("cual es tu tipo de transporte, avion o bus?");
        tipotransporte = escaner.nextInt();
    }

    
        System.out.println("Bienvenido " + nombre + "!");

        // Declaracion de salidas calculadas (completar)
        double totalTransporte = calcularTotalTransporte(tipoTransporte);
        double totalHospedaje = calcularTotalHospedaje(noches);
        double costoTotal = calcularCostoTotal(totalTransporte, totalHospedaje);

        // Generar mensaje final
        String tipoDocumento = (edad < 18) ? "T.I." : "C.C.";{
        String mensajeFinal = String("Hola %s, %d años, %s %s, Ciudad: %s. Costo total: $%.2f",
                nombre, edad, tipoDocumento, documento, ciudad, costoTotal);
    

        System.out.println(mensajeFinal);
    }

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    /** metodo para calcular el costo total del tranposte.
     * @param tipoTransporte tipo  de transporte (1: avion, 2: bus)
     * @return costo total del transporte
     */
	 
     public double calcularTotalTransporte(int tipoTransporte) {
        double costoTransporte = 0;
        if (tipoTransporte == 1) { 
            costoTransporte = 2 * COSTO_TRAYECTO_AVION; 
        } else if (tipoTransporte == 2) {
            costoTransporte = 2 * COSTO_TRAYECTO_BUS; 
        }
        return costoTransporte;
     }

	  /**
     * Método para calcular el costo total del hospedaje.

     * @param noches Número de noches de hospedaje
     * @return Costo total del hospedaje
     */
    public double calcularTotalHospedaje(int noches) {
        return noches * COSTO_NOCHE;
    }

    /**
     * Método para calcular el costo total del paquete de viaje.
     *
     * @param totalTransporte Costo total del transporte
     * @param totalHospedaje Costo total del hospedaje
     * @return Costo total del paquete
     */
    public double calcularCostoTotal(double totalTransporte, double totalHospedaje) {
        double costoAntesServicio = totalTransporte + totalHospedaje;
        return costoAntesServicio + (costoAntesServicio * PORCENTAJE_SERVICIO);

	

	
}