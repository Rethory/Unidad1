
package Controlador;

import Modelo.Modelo;
import Vista.InterfazVista;

import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Controlador implements ActionListener{
    private Vista vista;
    private Modelo modelo;
    
    public Controlador(Modelo m, Vista v){
        modelo = m;
        vista = v;
        vista.setControlador(this);
    }
    
    public void arrancar(){
        vista . setLocationRelativeTo ( null ) ; // centra la ventana en la pantalla
        vista . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE ) ;
        vista . setSize (500 , 250) ;
        vista . setVisible ( true ) ;
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        switch ( event . getActionCommand()) {
        case InterfazVista . ABRIR :
        modelo . setFileName ( vista . getFileName());
        vista . setText ( modelo . read () ) ;
        break ;
        case InterfazVista . ENCRYPT :
        modelo . setContenido ( vista . getText () ) ;
        vista . setText ( modelo . encript () ) ;
        break ;
        case InterfazVista . DECRYPT :
        modelo . setContenido ( vista . getText () ) ;
        vista . setText ( modelo . decript () ) ;
        break ;
        case InterfazVista . GUARDAR :
        modelo . setFileName ( vista . getFileName () ) ;
        modelo . setContenido ( vista . getText () ) ;
        modelo . write () ;
        break ;
        default :
        System .err. println (" Comando no definido ");
        break ;

        
    }
}
}