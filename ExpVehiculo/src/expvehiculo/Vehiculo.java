
package expvehiculo;
import java.awt.Color;
public class Vehiculo {
     private String marca;
     private enum TIPO {Familiar,Personal,chofer};
     private int modelo;
     private int numPasajeros;
     private int numPuertas;
     private Color color;
     private String personaPropietario;
     private double kilometraje;
     
     Vehiculo(){
         marca="Ford";
         TIPO tipo = null;
         System.out.println(tipo.Familiar);
         modelo=1997;
         numPasajeros=4;
         numPuertas=4;
         color=Color.BLUE;
         personaPropietario="Benito";
         kilometraje=100;
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
     
     public double getKilometraje () {
         return kilometraje;
     }
    public static void main(String[] args) {
        Vehiculo v1= new Vehiculo ("Chevrolet");
        Vehiculo v2= new Vehiculo ("Mercedes Benz");
        System.out.println(v1 + "y" + v1  + "son el mismo vehiculo" + v1.equals(v1));
        System.out.println(v1 + "y" + v2 +"son el mismo vehiculo"+v1.equals(v2));
        Object nuevo=v1.clone();
        Vehiculo nuevoVehiculo =(Vehiculo)nuevo;
        System.out.println("El nuevo objeto: "+nuevo.toString());
        System.out.println("El nuevo Vehiculo: "+nuevoVehiculo);
        v1.setpersonaPropietario("Pablo");
        v1.cambiarPropietario("Joaquin");
        v1.avanza(267.35);
        System.out.println("El dueño original es Benito y ahora es "+v1.personaPropietario);
        System.out.println("El kilometraje incial era 100 y ahora es "+v1.kilometraje);
 
    }
}
