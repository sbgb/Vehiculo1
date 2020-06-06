
import java.awt.Color;

public class Deportivo {

    private boolean convertible;

    private float precio;

    private int modelo;

    private String marca;

    private Color colorChasis;

    private boolean esTurbo;

    private Enum TipoInyector;

    
    public void Deportivo() {
    }

    public void Deportivo(boolean c, float p, int m, String mar, Color co, 
            boolean esT, Enum tipoI) {
        convertible = c;
        precio = p;
        modelo = m;
        marca = mar;
        colorChasis = co;
        esTurbo = esT;
        TipoInyector = tipoI;
    }

    public String velxHora() {
        return new String (convertible +" Tiene un precio de "+ precio+", es "
                + "un "+ modelo +" de color "+ colorChasis +" Tiene turbo de"+
                esTurbo + " y es " +TipoInyector);
        
    }

    public void nitro(float acMax, float tiempo) {
    }
}
