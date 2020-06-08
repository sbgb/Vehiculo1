/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expvehiculo;

/**
 *
 * @author mugiwara
 */

public class Carro extends Vehiculo {

        enum real {lb,kg};
        enum Modo {standar, automatico};
        enum Transmision  {manual, automatica};
        
        private real peso;
        private Transmision trans;
        private int caballosDeFuerza;
        private String tipoMotor;
        private int modelo;
        private String tipoGasolina;
        private int capacidadTanque;
        private String tarjetaCirculacion;
        private Modo modo;

    public Carro() {
        this.peso = peso.lb;
        this.trans = trans.manual;
        this.tipoMotor = "4 cilindros";
        this.modelo = 1;
        this.tipoGasolina = "diesel";
        this.tarjetaCirculacion = "191312fasfc41412";
        this.modo = modo.automatico;
    }
    
    public Carro (String marca) {
        super (marca);
        this.peso = peso.kg;
        this.trans = trans.automatica;
        this.tipoMotor = "16 cilindros";
        this.modelo = 2020;
        this.tipoGasolina = "magna";
        this.tarjetaCirculacion = "POO-UAM";
        this.modo = modo.automatico;
    } 
        
        

        
    public Carro(real peso, Transmision trans, String tipoMotor, int modelo, String tipoGasolina, 
            String tarjetaCirculacion, Modo modo) {
        this.peso = peso;
        this.trans = trans;
        this.tipoMotor = tipoMotor;
        this.modelo = modelo;
        this.tipoGasolina = tipoGasolina;
        this.tarjetaCirculacion = tarjetaCirculacion;
        this.modo = modo;
    }

    @Override
    public String toString() {
        return "Como vehículo" + super.toString() + "\nel carro tiene peso en : "+peso +", la transmision es: "+ trans
        +", tipoMotor: "+tipoMotor+""+", modelo"+modelo+", tipo de gasolina"+tipoGasolina+", tarjeta "
        +" de circulacion"+tarjetaCirculacion+", tipo modo"+modo+ "\n";
    }
    
    public void servicio(){
        if (getKilometraje() % 5000 >= 0)
            System.out.println ("El carro está en servicio");
    }
    
    void levantarInfraccion(){
         System.out.println("Se levanto infraccion");       
    };
    
    void cambiarModo(){
        
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Carro carro1 = new Carro();
       
       System.out.println(carro1.toString());
       
       Carro c2 = new Carro ("Honda");
       c2.avanza (5010);
       c2.servicio ();
       System.out.println (c2);
     
       }
    
}
