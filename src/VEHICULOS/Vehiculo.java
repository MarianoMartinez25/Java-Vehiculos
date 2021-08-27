
package VEHICULOS;

import COMPONENTES.*;
import java.util.ArrayList;

public interface Vehiculo {
    Motor getMotor();
    Chasis getChasis();
    Rueda [] getRueda();
    void ponerMotor(String n);
    void ponerRuedas(String m, int c);
    
}
