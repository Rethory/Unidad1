
package mvc;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class MVC {

    public static void main(String[] args) {
        Modelo m = new Modelo () ;
        Vista v = new Vista () ;
        Controlador c = new Controlador (m, v) ;
        c.arrancar () ; // Arranca la interfaz ( vista )
        
    }
    
}
