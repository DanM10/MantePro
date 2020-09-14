/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantepro;

/**
 *
 * @author Daniel
 */
public class Padre extends Persona {
    
    public Padre(String nombre,int edad,String formaComuni){
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setFormaComuni(formaComuni);
    }
    
    public void cambiarTareas(Persona persona,TareasOrganizar tarea){
        
    }
}
