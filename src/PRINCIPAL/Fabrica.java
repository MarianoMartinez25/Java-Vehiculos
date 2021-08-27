
package PRINCIPAL;
import COMPONENTES.Chasis;
import VEHICULOS.*;

public class Fabrica {
    public final String nombre;
   
    public Fabrica(String nombre) {
        this.nombre = nombre;
    }
    public Vehiculo crear(Chasis c,Fabrica f){
        Vehiculo v= new Auto ( c, f, c.numero);
                return v;
        
    }
    public Vehiculo crear(Fabrica f, Chasis c){
        Vehiculo v = new Camion( c, f, c.numero);
        return v;
    }
}
