/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.elementos.InterfazCompra;
import Vista.elementos.PanelPrincipal;
import Vista.elementos.Registrousuarios;
import Vista.VentanaPrincipal;





/**
 *
 * @author Antonio
 */
public class ControladorGraficos {
    private static ControladorGraficos singleton = null;
    private static VentanaPrincipal
            PanelPrincipal = null,
            Registro = null,
            Entrar = null;
            
            

    private ControladorGraficos() {

}
    

    public static ControladorGraficos getSingleton() {
        if (singleton == null) {
            singleton = new ControladorGraficos();
        }
        return singleton;
    }


    public void PanelPrincipal (){
           
        ocultar();
        if(Registro !=null){
            Registro.setVisible(false);
        }  
        if(Entrar !=null){
            Entrar.setVisible(false);
        }
        
        PanelPrincipal panel = new PanelPrincipal();
        
        }
    
    public void Registroususarios (){
      
        
        
    }
    
    public void InterfazCompra(){
        
        
    }
    
    
    
    private void ocultar(){
        
        if(Registro !=null){
            Registro.setVisible(false);
        }
        if(Entrar != null){
            Entrar.setVisible(false);
        }
    }
    
    
    
    
    
    }
