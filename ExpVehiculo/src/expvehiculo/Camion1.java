package expvehiculo;

// ************** O ************** O  ************** O  ************** O  **************
//             CLASE CAMION
// ************** O ************** O  ************** O  ************** O  **************

public class Camion1 {
    protected int numEjes;
    protected String tipoCarga;
    protected int numLlantas;
    protected int tipoRemolque;
    protected int numCilindros;
    protected int numPasajeros;
    protected boolean tipoCamion;
    protected float peso;
    protected float balance;
    protected float costo;
    
    protected int servicio ;
    protected int aceite;
    protected int bujias;
    protected int amortiguadores;
    protected int sensores;
    protected int neumaticos;

    //Gets

    public int getNumEjes() {
        return numEjes;
    }

    public String isTipoCarga() {
        return tipoCarga;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public int getTipoRemolque() {
        return tipoRemolque;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public boolean isTipoCamion() {
        return tipoCamion;
    }

    public float getPeso() {
        return peso;
    }

    public float getBalance() {
        return balance;
    }

    public float getCosto() {
        return costo;
    }
    

    public Camion1(int numEjes, String tipoCarga, int numLlantas, int tipoRemolque, int numCilindros, int numPasajeros, boolean tipoCamion, float peso, float balance) {
        this.numEjes = numEjes;
        this.tipoCarga = tipoCarga;
        this.numLlantas = numLlantas;
        this.tipoRemolque = tipoRemolque;
        this.numCilindros = numCilindros;
        this.numPasajeros = numPasajeros;
        this.tipoCamion = tipoCamion;
        this.peso = peso;
        this.balance = balance;
    }
     
    int numEjes (){return numEjes;}
    String tipoCarga (){return tipoCarga;}
    int numLlantas () {return numLlantas;}
    int tipoRemolque (){return tipoRemolque;}
    int numCilindros () {return numCilindros;}
    int numPasajeros () {return numPasajeros;}
    boolean tipoCamion (){return tipoCamion;}
    float peso () {return peso;}
    float balance (){return balance;}
    
    public String toString() {
        return "El camion tiene" + numEjes + "ejes"+",el tipo de carga es"+tipoCarga+ ",tiene=" + numLlantas +"llantas" + ", tipoRemolque=" + tipoRemolque + ", numCilindros=" + numCilindros + ", numPasajeros=" + numPasajeros + ", tipoCamion=" + tipoCamion + ", peso=" + peso + ", balance=" + balance ;
       
    }
    
    Camion1(float numPasaje){
        int pasaje = 45;
        costo=(numPasajeros)/pasaje;
    }
    Camion1 (int servicio, int aceite,int bujias, int amortiguadores, int sensores , int neumaticos){
        this.servicio = servicio;
        this.aceite = aceite;
        this.bujias = bujias;
        this.amortiguadores = amortiguadores ;
        this.sensores = sensores;
        this.neumaticos = neumaticos;
    }
    
    int servicio (){return servicio;}
    int aceite (){return aceite;}
    int bujias() {return bujias;}
    int amortiguadores(){return amortiguadores;}
    int sensores () {return sensores;}
    int neumaticos () {return neumaticos;}
    
//    public String toStirng() {
//        return "El servicio del camion se compone de" + servicio + 
       
  }