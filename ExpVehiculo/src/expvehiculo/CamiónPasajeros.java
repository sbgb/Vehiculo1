/*
 * HERENCIA: Sub-Clase CamiónPasajeros de Clase-Hijo Camión
 */
package expvehiculo;
import java.awt.Color;

public class CamiónPasajeros extends Camion {
    
    private enum Ruta { 
        ROSARIO, UAMA, FERRERÍA, ESPECIAL, SINRUTA;
    }
    
    private enum Abordaje { 
        NORMAL, EXPRESS, POINTOPOINT;
    }
      
    private enum Pasajero {
        EXTERNO, TRABAJADOR, ACADÉMICO, ESTUDIANTE, NINGUNO;
    }  
          
    private Ruta ruta;
    private Abordaje abordaje;
    private Pasajero pasajero;
    private double cuota; 
    private int lugdisponibles; 
    private String puertas;  
    boolean mecfalla; 
    boolean intdaño; 
    private Color Tcolor;
            
    //MÉTODOS CONSTRUCTORES
    CamiónPasajeros () {
        this.ruta = Ruta.SINRUTA;
        this.abordaje = Abordaje.NORMAL;
        this.pasajero = Pasajero.NINGUNO;
        this.cuota = 10.00;       //Cuota Inicial de cobro para cualquier viaje
        this.lugdisponibles = 20; //Mínimo de lugares para que sea un  
                                    //Camión de Pasajeros
        this.puertas = "Puertas Cerradas"; //Estado Inicial de la puerta
        this.mecfalla = false;    //Inicialmente no hay falla mecánica ni daños
        this.intdaño = false;       //en el interior
        Tcolor = Color.WHITE;       //De fábrica los camiones están en blanco
    }
    
    CamiónPasajeros (Ruta ruta, double cuota, Color color, int llantas) {
        super (llantas);
        this.ruta = ruta;
        this.cuota = cuota;   
        Tcolor = color; 
        if (getLlantas () == 4) { lugdisponibles = 20; }
        if (getLlantas () == 6) { lugdisponibles = 30; }
        if (getLlantas () == 8) { lugdisponibles = 40; }
    }
    
    
    //MÉTODOS DE SERVICIO
    Ruta getRuta () { return ruta; }
    Abordaje getAbordaje () { return abordaje; }
    double getCuota () { return cuota; }
    Pasajero getPasajero () { return pasajero; }
    int getLugares () { return lugdisponibles; }
    boolean getMfalla () { return mecfalla; }
    boolean getIdaño () { return intdaño; }    
    Color getColor () { return Tcolor; }
    
    String dimeEstado (boolean mec, boolean intd) { 
        mecfalla = mec;
        intdaño = intd;
        if (mecfalla == true & intdaño == true ) {
            return " Se necesitarán " + (super.servicio())*2 + " días de servicio para reparar tu unidad " + Tcolor + ".";
        }
        if (mecfalla == true ^ intdaño == true  ) {
            return " Se necesitarán " + super.servicio() + " días de servicio para reparar tu unidad " + Tcolor + ".";
        }
        else
            return " ¡Excelente! Tu Unidad " + Tcolor + " No Necesita Servicio.";
    }  
    
    double Cobro (Abordaje abord, Pasajero pasaje) {
        double c = getCuota();
        if (abord == Abordaje.EXPRESS) { c += 5; }
        if (abord == Abordaje.POINTOPOINT) { c += 8.50; }
        if (pasaje == Pasajero.TRABAJADOR) { c -= (c*0.20); }
        if (pasaje == Pasajero.ACADÉMICO) { c -= (c*0.30); }
        if (pasaje == Pasajero.ESTUDIANTE) { c -= (c*0.40); }        
        return c;
    }
    
    void PuertasCerradas (double velocity) {
        if (super.avanza(velocity) == 100) //Suponiendo que en cada ruta hay 5
            puertas = " Puertas estan Abiertas "; // estaciones situada cada una 
        if (super.avanza(velocity) == 101)        // a 100km de la anterior
            puertas = " Puertas estan Abiertas "; 
        if (super.avanza(velocity) == 102) 
            puertas = " Puertas estan Abiertas "; 
                if (super.avanza(velocity) == 103) 
            puertas = " Puertas estan Abiertas "; 
        if (super.avanza(velocity) == 104) 
            puertas = " Puertas estan Abiertas "; 
        else
            puertas = " Puertas estan Cerradas "; 
        System.out.println("Se han recorrido: " + getKilometraje () + "km. Entonces las " + puertas);   
    }
    
    void DisponibilidadActual (int subidas, int bajadas) {
        lugdisponibles +=  (- subidas + bajadas);
        System.out.println ("Hay " + lugdisponibles + " lugares disponibles. ");
    }
    
  
    //MÉTODOS SOBRECARGADOS DE OBJECT
    public String toString () {
        return " Tiene Asignada la Ruta  " + getRuta () + ", identificado pro el color " 
                + getColor()  + " con una cuota de $" + getCuota() + " y " + getLugares() + " lugares";
    }

    public static void main (String [] args) {
        CamiónPasajeros nuevo = new CamiónPasajeros ();
        CamiónPasajeros camión1 = new CamiónPasajeros (Ruta.UAMA, 10, Color.RED, 4);
        CamiónPasajeros camión2 = new CamiónPasajeros (Ruta.ROSARIO, 15, Color.MAGENTA, 6);
        CamiónPasajeros camión3 = new CamiónPasajeros (Ruta.FERRERÍA, 17, Color.BLUE, 8);
        CamiónPasajeros camión4 = new CamiónPasajeros (Ruta.ESPECIAL, 25, Color.PINK, 6);
        System.out.println ("El camión 1 " + camión1);
        System.out.println ("El camión 2 " + camión2);
        System.out.println ("El camión 3 " + camión3);
        System.out.println ("El camión 4 " + camión4);
        System.out.println("\n Tú actualmente conduces el camión 3. "
                + "\n Se analizará su estado mecánico y de interiores...\n " + camión3.dimeEstado(false,false));
        System.out.println (" Nuevo pasajero... El precio por viajar es de: $" 
                + camión3.Cobro (Abordaje.POINTOPOINT, Pasajero.EXTERNO) + ". ¡Gracias por su preferencia! ");
        camión3.DisponibilidadActual (18, 7);
        camión3.PuertasCerradas(0.1);
        
    
    }
  
    
    
}

