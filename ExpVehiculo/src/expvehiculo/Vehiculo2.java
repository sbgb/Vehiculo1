package vehiculo;
import java.awt.Color;
public class Vehiculo {
     private String marca;
     private enum TIPO{Familiar,Personal,chofer};
     private int modelo;
     private int numPasajeros;
     private int numPuertas;
     private Color color;
     private String personaPropietario;
     private double kilometraje;
     
     Vehiculo(){
         marca="Volkswagen";
         TIPO tipo = null;
         System.out.println(TIPO.Familiar);
         modelo=1990;
         numPasajeros=4;
         numPuertas=4;
         color=Color.WHITE;
         personaPropietario="Carlos";
         kilometraje=80;
     }
    
     Vehiculo(String marca){
         this.marca=marca;
     }
     
     public String toString(){
         return marca;
     }
     public boolean equals(Object v1){
         System.out.print("Estoy en el equals de Object v1");
         if(v1==null)
             return false;
         if(this.getClass()!=v1.getClass())
             return false;
         Vehiculo otroV1=(Vehiculo)v1;
         return this.marca.equals(otroV1.marca);
     }
     public Object clone(){
         Vehiculo nuevoVehiculo = new Vehiculo (this.marca);
         return nuevoVehiculo;
     }
     
     public void cambiarPropietario(String nuevoPropietario){
         this.personaPropietario=nuevoPropietario;
     }
     public double avanza(double kilometraje){
         this.kilometraje+=kilometraje;
         return this.kilometraje;
     }
     public void setpersonaPropietario(String personaPropietario){
         this.personaPropietario=personaPropietario;
     }
     public String getpersonaPropietario(){
         return personaPropietario;
     }
    public static void main(String[] args) {
        Vehiculo v1= new Vehiculo ("Toyota");
        Vehiculo v2= new Vehiculo ("Supra");
        System.out.println(v1 + "y" + v1  + "son el mismo vehiculo" + v1.equals(v1));
        System.out.println(v1 + "y" + v2 +"son el mismo vehiculo"+v1.equals(v2));
        Object nuevo=v1.clone();
        Vehiculo nuevoVehiculo =(Vehiculo)nuevo;
        System.out.println("El nuevo objeto: "+nuevo.toString());
        System.out.println("El nuevo Vehiculo: "+nuevoVehiculo);
        v1.setpersonaPropietario("Juan");
        v1.cambiarPropietario("Roberto");
        v1.avanza(267.35);
        System.out.println("El dueño original es Carlos y ahora es "+v1.personaPropietario);
        System.out.println("El kilometraje incial era 80 y ahora es "+v1.kilometraje);
 
    }
}

public class CamionBasura2 extends Vehiculo {
    
    boolean convertible;
    String tipobasura;
    float capacidadMaxima;
    
    public CamionBasura2(){
        this.convertible = false;
        this.tipobasura = "inorganica";
        this.capacidadMaxima = 7500;
    }
    
    public CamionBasura2 (String _desechos, float _kilos){
        tipobasura = _desechos;
        capacidadMaxima = _kilos;
    }
    
    public void basura(float _tiempo){
        float tiempo = _tiempo;
    } 
    
    public float descargaTotal(float _tiempo, float _capacidad){
        return _tiempo*_capacidad;
    }
    
}

