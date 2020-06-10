package expvehiculo;
import java.time.Instant;
import java.util.Date;
import java.util.StringTokenizer;

public class Camion extends Vehiculo{

    private int numEjes;
    private boolean tipoCarga;
    private int numLlantas;
    private int tipoRemolque;
    private int numCilindros;
    private int numPasajeros;
    private boolean tipoCamion;
    private float peso;
    private float balance;
    
    
    public Camion() {
    }
    
        Camion (int llantas) {
        this.numLlantas = llantas;
    }

    public Camion(String a) {
        String cadena = (String) a;
        StringTokenizer st = new StringTokenizer(cadena, ",");
        numEjes = Integer.valueOf(st.nextToken());
        tipoCarga = Boolean.valueOf(st.nextToken());
        numLlantas = Integer.valueOf(st.nextToken());
        tipoRemolque = Integer.valueOf(st.nextToken());
        numCilindros = Integer.valueOf(st.nextToken());
        numPasajeros = Integer.valueOf(st.nextToken());
        tipoCamion = Boolean.valueOf(st.nextToken());
        peso = Float.valueOf(st.nextToken());
        balance = Float.valueOf(st.nextToken());

    }

    public String toString() {
        return this.numEjes + " " + this.tipoCarga + " " + this.numLlantas + " " + this.tipoRemolque + " " + this.numCilindros + " " + this.numPasajeros + " " + this.peso + " " + this.balance;
    }

    public boolean equals(Object o) {
        //Ve si dos alumnos osn iguales por dato miembro, por dato miembro
        System.out.println("Estoy en el equals de Object");
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            System.out.println("Las clases no son iguales");
            return false;
        }
        Camion cami = (Camion) o;
        if (this.numEjes == cami.numEjes && this.tipoCarga == cami.tipoCarga && this.numLlantas == cami.numLlantas
                && this.tipoRemolque == cami.tipoRemolque && this.numCilindros == cami.numCilindros && this.numPasajeros == cami.numPasajeros
                && this.peso == cami.peso && this.balance == cami.balance) {

            return true;

        }

        return false;
    }

    int servicio() {
        //No entiendo que hace el metodo servicio :(
        return 5;
    }

    public Camion clone() {

        Camion cami = new Camion();
        cami.numEjes = this.numEjes;
        cami.tipoCarga = this.tipoCarga;
        cami.numLlantas = this.numLlantas;
        cami.tipoRemolque = this.tipoRemolque;
        cami.numCilindros = this.numCilindros;
        cami.numPasajeros = this.numPasajeros;
        cami.peso = this.peso;
        cami.balance = this.balance;

        return cami;

    }

    public float costo(float numPasaje) {
        float preciopublico = 5;

        return numPasaje * preciopublico;
    }
//este es el otro de costo pero cobrando la carga

    public float costoB(float carga) {
        float a = 10000;

        return a * carga;

    }
    
    int getLlantas () {
        return numLlantas;
    }
    

    public boolean ruta(Date inicio, Date fin) {
       //aqui creo que seria mejor utilizar la clase Calendar but idk       
        
                
                
                //No tengo idea de como implementarlo;
        return false;
    }
}