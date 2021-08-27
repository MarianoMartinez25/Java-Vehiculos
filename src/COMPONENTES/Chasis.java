
package COMPONENTES;
import VEHICULOS.Producto;


public class Chasis {
    public final String numero;
    private Producto pertenece;
    
    
    public Chasis (String numero){
        this.numero=numero;
    }
   
    public Producto getPertenece(){
        return pertenece;
    }
    public void setPertenece(Producto Pertenece){
        this.pertenece=pertenece;
    }
            
}
