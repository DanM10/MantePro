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
    
    public Bici(boolean frec,Date fechaOrigen,String duenio){

         super.setFrecuencia(frec);
         super.setFechaOriginal(fechaOrigen);
         this.duenio=duenio;
     }

    
    
    
    @Override
    void enivarNoti() {
       Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Date origin = super.getFechaOriginal();
        cal.setTime(origin);
        cal.add(Calendar.MONTH, this.llanta1);
        Date final2 = cal.getTime();
        Date final3 = cal2.getTime();
        String nombre = this.duenio;
        super.setFechaF(final2);
        
        while (final3.compareTo(final2)!=1){
            JOptionPane.showMessageDialog(null, nombre+" tienes que lubricar las llantas","MantePRO",1);
            System.out.println(final3+"\n"+final2);
            break;
        }
    }

    public int getLlanta1() {
        return llanta1;
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
