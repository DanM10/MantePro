/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantepro;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public abstract class Persona {
    
    private String nombre;
    private int edad;
    private String formaComuni;
    
    ArrayList<TareasOrganizar> tareaslist = new ArrayList<TareasOrganizar>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFormaComuni(String formaComuni) {
        this.formaComuni = formaComuni;
    }

    public void setBici(Bici bici) {
        this.bici = bici;
    }

    public void setPuerta(Puertas puerta) {
        this.puerta = puerta;
    }

    public void setVentanas(Ventana[] ventanas) {
        this.ventanas = ventanas;
    }

    
    
    
}
