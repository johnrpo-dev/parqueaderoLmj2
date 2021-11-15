
package lmj2;

import lmj2.controladores.Controlador;
import lmj2.modelos.ModeloDB;
import lmj2.vistas.Vista;


public class Lmj2 {

  
    public static void main(String[] args) {
        
        ModeloDB modelo = new ModeloDB();
        Vista vista = new Vista();
        vista.setVisible(true);
        
        Controlador controlador = new Controlador(modelo, vista);
        
    }
    
}
