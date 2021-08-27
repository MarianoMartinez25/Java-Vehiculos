
package COMPONENTES;

import VEHICULOS.Producto;


public class Motor {
    public final String numero;
    private Producto instalado;
    
    public Motor (String numero, Producto instalado){
        this.numero=numero;
        this.instalado=instalado;
    }
    
    
    public Producto getIstalado(){
        return instalado;
    }
    
    
}   
    
