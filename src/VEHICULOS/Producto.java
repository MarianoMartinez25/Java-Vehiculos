
package VEHICULOS;

import COMPONENTES.Chasis;
import COMPONENTES.Motor;
import COMPONENTES.Rueda;
import PRINCIPAL.Fabrica;
import java.util.ArrayList;
import VEHICULOS.Vehiculo;




public abstract class Producto implements Vehiculo {
     public final Fabrica construidoPor;
    protected Chasis compuesto;
    protected Motor impulsado;
    protected Rueda [] rueda;
    protected float precio;
    
    
     public Producto(Chasis c, Fabrica f , String numero){
        this.compuesto=c;
        this.construidoPor=f;
    }
    
    public void verDatos(){
        System.out.println("Fabricado por: "+construidoPor.nombre);// nombre del fabricante
        System.out.println("El precio es: "+precio);// precio 
        System.out.println("Motor: "+impulsado.numero);// numero de motor y de chasis
        System.out.println("Chasis: "+compuesto.numero); //HChasis
        for(Rueda r : rueda)
        System.out.println("Ruedas: "+r.marca);
        
    }
   
    
    public void setPrecio(float precio){
        this.precio=precio;
        
    }

    public Motor getMotor() {
        return impulsado;
    }

    public Chasis getChasis() {
        return compuesto;
    }

    public Rueda[] getRueda() {
        return rueda;
    }

    public Fabrica getFabrica() {
        return construidoPor;
    }
     public void ponerRuedas(String m, int c){ // marca de la rueda, cantidad de ruedas
         rueda = new Rueda[c]; //arreglo con c ruedas
         for( int i = 0; i<c; i++) // contador de ruedas
             rueda[i]=new Rueda(m); // creo UNA rueda con su marca
         
     }
     
     public void ponerMotor(String n){ //asocicion
         this.impulsado=new Motor(n,this); // asocio este motor con este producto
         
     }
     
    
  
   
    
}
