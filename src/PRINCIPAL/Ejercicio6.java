
package PRINCIPAL;
import COMPONENTES.*;
import VEHICULOS.*;
import PRINCIPAL.Fabrica;

public class Ejercicio6 {

    
    public static void main(String[] args) {
        Fabrica f1 = new Fabrica("Renault");
        Fabrica f2 = new Fabrica("Fiat");
        Chasis c1 = new Chasis("chasis6537");
        Vehiculo v = f1.crear(c1, f2); // crea un auto, me doy cuenta por el orden de los paramateros
        c1.setPertenece((Producto)v); //composicion. ese chasis pertenece a ese producto v
        v.ponerMotor("motor6537");//le asigna un montor
        v.ponerRuedas("Firestone", 4);//le asigna marca y cantidad de ruedas
        ((Producto)v).setPrecio(400.90f);
        ((Producto)v).verDatos();
        
        Chasis c2 = new Chasis("chasis02");
        v = f1.crear(f1, c2); // crea un camion
        c2.setPertenece((Producto)v);
        v.ponerMotor("motor02");
        v.ponerRuedas("goodyear", 8);
        ((Camion)v).setCapacidadDeCarga(14);
        ((Producto)v).setPrecio(359.85f);
        ((Producto)v).verDatos();
    }
    
}
