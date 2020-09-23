package Vista;

import Controlador.Controlador;

public interface InterfazVista {
    void setControlador (Controlador c); // Conecta la interfaz con el controlador
    public String getFileName(); // Obtener el nombre del archivo
    public String getText(); // Obtener el texto
    public void setText (String s); // Establecer el texto
    
    //Constantes que definen las posibles operaciones :
    public static final String ABRIR ="Abrir";
    public static final String ENCRYPT ="encrypt";
    public static final String DECRYPT ="decrypt";
    public static final String GUARDAR ="Guardar";
}
