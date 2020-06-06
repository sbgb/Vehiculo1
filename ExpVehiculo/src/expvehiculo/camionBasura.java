   public class camionBasura extends Vehiculo{ //se crea la clase camionBasura(hijo) a partir de la clase Vehiculo(padre)
        
        //Datos miemblos especificos de esta clase
        boolean convertible; 
        String tipoBasura;
        float capacidadMaxima;
        
        //metodos especificos de esta clase
        //Metodo constructor por defecto
        public camionBasura(){
            this.convertible = false;
            this.tipoBasura = "organica";
            this.capacidadMaxima = 1000;
        }
        //Metodo constructor que pide el tipo de basura y la capacidad maxima
        public camionBasura(String _tipoBasura, float _capacidad){
            tipoBasura = _tipoBasura;
            capacidadMaxima = _capacidad;
        }
        //Metodo que pide el tiempo
        public void recogeBasura(float _tiempo){
            float tiempo = _tiempo;
        }
        //Metodo que regresa la cantidad de basura recogida en un tiempo
        public float descargaTotal(float _tiempo, float _capacidad){
            return _tiempo*_capacidad;
        }
