package expvehiculo;

// ************** O ************** O  ************** O  ************** O  **************
//             CLASE CAMION CARGA
// ************** O ************** O  ************** O  ************** O  **************
// CamionCarga c = new CamionCarga(1, "POR DEFINIR", 6, 1, 12, 2, true, 80000, 10, false, false, 50000);
public class CamionCarga extends Camion1{
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
