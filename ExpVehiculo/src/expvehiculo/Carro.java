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

        private String matricula;
	private double kilometraje;
	private float tamaño;
        private String marca;
        private String modelo;
        
public void encender(){
    System.out.println("El carro se encendio");
}

public void apagar(){
    System.out.println("El carro se apago");
}
     
public void Servicio(double kilometraje){
    if(kilometraje>100)
       System.out.println("Se necesita realizar servicio");
    else
         System.out.println("No se necesita servicio");
}
 
        

public Carro (String matricula, int kilometraje,  float tamaño)
	{
	this.matricula = matricula;
	this.kilometraje = kilometraje;
	this.tamaño = tamaño;
        this.marca = marca;
        this.modelo = modelo;
	 }
public Carro ()
	{
	this.matricula = "KGB123";
	this.kilometraje = 100;
	this.tamaño = 1.2f;
        this.marca = "vw";
        this.modelo = "sedan";
	 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Carro carro1 = new Carro();
       System.out.println("La marca es "+carro1.marca);
       System.out.println("El modelo es "+carro1.modelo);
       System.out.println("La matricula es "+carro1.matricula);
       System.out.println("El kilometraje es "+carro1.kilometraje+" km");
       System.out.println("El tamaño es "+carro1.tamaño);
       
       double kil= (int)carro1.kilometraje;
       carro1.Servicio(kil);
       }
    
}
