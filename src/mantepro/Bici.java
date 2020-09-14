/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantepro;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Bici extends TareasOrganizar{
    private int llanta1; 
     private String duenio;
    
    public Bici(String nombre,boolean frec,Date fechaOrigen,boolean mountain,String duenio){
         super.setNombre(nombre);
         super.setFrecuencia(frec);
         super.setFechaOriginal(fechaOrigen);
         this.duenio=duenio;
     }

    @Override
    void enivarNoti() {
       Calendar cal = Calendar.getInstance();
        Date origin = super.getFechaOriginal();
        cal.setTime(origin);
        cal.add(Calendar.MONTH, this.llanta1);
        Date final2 = cal.getTime();
        String nombre = this.duenio;
        while(origin.compareTo(final2)==-1){
            JOptionPane.showMessageDialog(null, nombre+" tienes que lubricar bisagras de la puerta","MantePRO",1);
            break;
        }
    }

    @Override
    void calcularDias() {
        if(super.isFrecuencia()){
           this.llanta1=4;
       }else{
           this.llanta1=8;
       }
    }
    
    
}
