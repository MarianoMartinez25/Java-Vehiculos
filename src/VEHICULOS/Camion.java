
package VEHICULOS;

import COMPONENTES.Chasis;
import PRINCIPAL.Fabrica;
import COMPONENTES.Motor;

public class Camion extends Producto {
    private int capacidadDeCarga;
    
    public Camion(Chasis c, Fabrica f, String numero){
       super(c,f,numero);
    }
   
    public int getCapadiadDeCarga(){
        return capacidadDeCarga;
    }
    public void setCapacidadDeCarga(int cap){
        this.capacidadDeCarga=cap;
    }
    public void verDatos(){
        super.verDatos();
        System.out.println("La capacidad de carga del camion es: "+capacidadDeCarga);
    }
    
}
