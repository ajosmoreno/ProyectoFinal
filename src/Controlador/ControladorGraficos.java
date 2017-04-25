/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.InterfazCompra;
import Vista.PanelPrincipal;


/**
 *
 * @author Antonio
 */
public class ControladorGraficos {

    private static ControladorGraficos singleton = null;
    private static PanelPrincipal PanelPrincipal = null;
   
    private ControladorGraficos() {

    }

    public static ControladorGraficos getSingleton() {
        if (singleton == null) {
            singleton = new ControladorGraficos();
        }
        return singleton;
    }


}
