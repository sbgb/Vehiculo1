/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author mugiwara
 */

public class Carro {

        enum real {lb,kg};
        enum Modo {standar, automatico};
        enum Transmision  {manual, automatica};
        
        private real peso;
        private Transmision trans;
        int caballosDeFuerza;
        String tipoMotor;
        int modelo;
        String tipoGasolina;
        int capacidadTanque;
        String tarjetaCirculacion;
        Modo modo;

    public Carro() {
        this.peso = peso.lb;
        this.trans = trans.manual;
        this.tipoMotor = "4 cilindros";
        this.modelo = 1;
        this.tipoGasolina = "diesel";
        this.tarjetaCirculacion = "191312fasfc41412";
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
        return "el carro tiene peso en : "+peso.kg+", la transmision es: "+trans.manual
        +", tipoMotor: "+tipoMotor+""+", modelo"+modelo+", tipo de gasolina"+tipoGasolina+", tarjeta "
        +" de circulacion"+tarjetaCirculacion+", tipo modo"+modo+ "\n";
    }
    
    public int servicio(int kilo){
        if(kilo==0)
            System.out.println("No necesita servicio");
        return 0;
        elseif(kilo==1) 
         System.out.println("ya tuvo servicio");
        return 1; 
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
     
       }
    
}
