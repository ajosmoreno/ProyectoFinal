package Controlador;

import Modelo.BaseDeDatos;
import Vista.elementos.RegistroUsuarios;
import java.sql.SQLException;

/**
 *
 * @author José Manuel Moreno Córdoba
 */
public class ControladorRegistro {
    
    private RegistroUsuarios miRegistro;
    
    public ControladorRegistro(RegistroUsuarios miRegistro){
        this.miRegistro = miRegistro;
    }
    
    public void registrar() throws ClassNotFoundException, SQLException{
        miRegistro.
        BaseDeDatos.baseDeDatos().ejecutarConsulta("");
    }
}
