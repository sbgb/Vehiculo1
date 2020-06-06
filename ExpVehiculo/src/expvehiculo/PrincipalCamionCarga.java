package com.herencia.camioncarga;

public class PrincipalCamionCarga {
    public static void main(String[] args) {
        CamionCarga c = new CamionCarga(1, "POR DEFINIR", 6, 1, 12, 2, true, 80000, 10, false, false, 50000);
        CamionCarga c1 = c.Clone();
        System.out.println(c.toString() + "\n");
        System.out.println("Encendiendo luces y asignando tipo de remolque de carga...\n");
        c.OnOffLuzExterna();
        c.AsignaCargaRemolque();
        System.out.println(c.toString());
        System.out.println("Clonado: " + c1.toString());
    }
    
}

// ************** O ************** O  ************** O  ************** O  **************
//             CLASE CAMION
// ************** O ************** O  ************** O  ************** O  **************

class Camion {
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
    

    public Camion(int numEjes, String tipoCarga, int numLlantas, int tipoRemolque, int numCilindros, int numPasajeros, boolean tipoCamion, float peso, float balance) {
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
    
    Camion(float numPasaje){
        int pasaje = 45;
        costo=(numPasajeros)/pasaje;
    }
Camion (int servicio, int aceite,int bujias, int amortiguadores, int sensores , int neumaticos){
   
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
    


// ************** O ************** O  ************** O  ************** O  **************
//             CLASE CAMION CARGA
// ************** O ************** O  ************** O  ************** O  **************
class CamionCarga extends Camion{
    private boolean refrigerada;
    private boolean cajaCerrada;
    private double cargaEstimada;   // Definida en kilos.
    private TipoCargaRemolque tipoCargaRemolque;
    private boolean luces;
    // CONSTRUCTOR.
    /**
     * @param numEjes Numero de ejes
     * @param tipoCarga Tipo de carga.
    
    */
    public CamionCarga(int numEjes, String tipoCarga, int numLlantas, int tipoRemolque, int numCilindros, int numPasajeros, boolean tipoCamion, float peso, float balance, boolean refrigerada, boolean cajaCerrada, double cargaEstimada) {
        super(numEjes, tipoCarga, numLlantas, tipoRemolque, numCilindros, numPasajeros, tipoCamion, peso, balance);
        this.cajaCerrada = false;
        this.refrigerada = false;
        this.cargaEstimada = cargaEstimada;
        this.tipoCargaRemolque = TipoCargaRemolque.NoPermitido;
        this.luces = false;
    }
    // GETTER
    public boolean isRefrigerada() {
        return refrigerada;
    }
    public boolean isCajaCerrada() {
        return cajaCerrada;
    }
    public double getCargaEstimada() {
        return cargaEstimada;
    }
    // SETTER
    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }

    public void setCajaCerrada(boolean cajaCerrada) {
        this.cajaCerrada = cajaCerrada;
    }

    public void setCargaEstimada(double cargaEstimada) {
        this.cargaEstimada = cargaEstimada;
    }
    
    // Simulación de tiempo de descarga.
    public boolean DescargaMaterial(double tiempo){
        while(tiempo>0){
            tiempo--;
        }
        return true;
    }
    
    public void OnOffLuzExterna(){
        luces = !luces;
    }
    public String EstadoLuces(){
        return luces ? "Encendidas": "Apagadas";
    }
    
    public void AsignaCargaRemolque(){
        if(cargaEstimada < 2500)
            tipoCargaRemolque = TipoCargaRemolque.Ligero;
        else if(cargaEstimada > 2500 && cargaEstimada <= 3500)
            tipoCargaRemolque = TipoCargaRemolque.Liviano;
        else if(cargaEstimada > 3500 && cargaEstimada <= 4500)
            tipoCargaRemolque = TipoCargaRemolque.Semiliviano;
        else if(cargaEstimada > 4500 && cargaEstimada <= 5500)
            tipoCargaRemolque = TipoCargaRemolque.Mediano;
        else if(cargaEstimada > 5500 && cargaEstimada <= 7500)
            tipoCargaRemolque = TipoCargaRemolque.Semipesado;
        else if(cargaEstimada > 7500 && cargaEstimada <= 9000)
            tipoCargaRemolque = TipoCargaRemolque.Pesado;
        else if(cargaEstimada > 9000 && cargaEstimada <= 11500)
            tipoCargaRemolque = TipoCargaRemolque.ExtraPesado;
        else if(cargaEstimada > 11500 && cargaEstimada <= 15000)
            tipoCargaRemolque = TipoCargaRemolque.Largo;
        else if(cargaEstimada > 15000 && cargaEstimada <= 20000)
            tipoCargaRemolque = TipoCargaRemolque.TeraPesado;
        else if(cargaEstimada > 20000 && cargaEstimada <= 23000)
            tipoCargaRemolque = TipoCargaRemolque.UltraPesado;
        else if(cargaEstimada > 20000 && cargaEstimada <= 23000)
            tipoCargaRemolque = TipoCargaRemolque.UltraPesado;
        else if(cargaEstimada > 23000 && cargaEstimada <= 30000)
            tipoCargaRemolque = TipoCargaRemolque.GigaPesado;
        else if(cargaEstimada > 30000 && cargaEstimada <= 250000)
            tipoCargaRemolque = TipoCargaRemolque.SuperPesado;
        else
            tipoCargaRemolque = TipoCargaRemolque.NoPermitido;
    }
    public boolean CargaAutorizada(){
        return tipoCargaRemolque != TipoCargaRemolque.NoPermitido;
    }
    public String toString(){
        return super.toString() + "\nEstado de luces:" + EstadoLuces() + "\nTipo de carga remolque: " + tipoCargaRemolque.toString();
    }

public CamionCarga Clone(){
CamionCarga cClone = new CamionCarga(this.numEjes, this.tipoCarga, this.numLlantas, this.tipoRemolque, this.numCilindros, this.numPasajeros, this.tipoCamion, this.peso, this.balance, this.refrigerada, this.cajaCerrada, this.cargaEstimada); cClone.tipoCargaRemolque = this.tipoCargaRemolque;
cClone.luces = this.luces;
return cClone;
}

    enum TipoCargaRemolque {
        Ligero,     // 500 Kg. y 2.5 toneladas.
        Liviano,     // 2.5 y 3.5 ton.
        Semiliviano,     // 3.5 ton. y 4.5 ton.
        Mediano,     // 4.5 ton. y 5.5 ton.
        Semipesado,     // 5.5 ton. y 7.5 ton.
        Pesado,     // 7.5 ton, y 9 ton.
        ExtraPesado,     // 9 ton. y  11.5 ton.
        Largo,         // 11.5 ton. y 15 ton.
        TeraPesado,     // 15 ton. y 20 ton.
        UltraPesado,     // 20 ton. y 23 ton.
        GigaPesado,     // 23 ton. y 26 ton.
        SuperPesado,     // 40 ton. y 250 ton.
        NoPermitido
    }
}
// ************** O ************** O  ************** O  ************** O  **************
//             FIN DE CLASE CAMION CARGA
// ************** O ************** O  ************** O  ************** O  **************

