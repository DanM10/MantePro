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
public class Ventana extends TareasOrganizar{
    
    private int valVent;
    private String duenio;
    
     public Ventana(String nombre,boolean frec,Date fechaOrigen){
         super.setNombre(nombre);
         super.setFrecuencia(frec);
         super.setFechaOriginal(fechaOrigen);
     }

    @Override
    void enivarNoti() {
       Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Date origin = super.getFechaOriginal();
        cal.setTime(origin);
        cal.add(Calendar.MONTH, this.valVent);
        Date final2 = cal.getTime();
        Date final3 = cal2.getTime();
        String nombre = this.duenio;
        super.setFechaF(final2);
        
        while (final3.compareTo(final2)!=1){
            JOptionPane.showMessageDialog(null, nombre+" tienes que lubricar bisagras de la puerta","MantePRO",1);
            System.out.println(final3+"\n"+final2);
            break;
        }
    }

    @Override
    void calcularDias() {
         if(super.isFrecuencia()){
           this.valVent=2;
       }else{
           this.valVent=1;
       }
    }
    
}
