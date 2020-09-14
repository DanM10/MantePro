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
public class Puertas extends TareasOrganizar{
     private int valVis1;
     private String duenio;
     
     public Puertas(String nombre,boolean frec,Date fechaOrigen,String duenio){
         super.setNombre(nombre);
         super.setFrecuencia(frec);
         super.setFechaOriginal(fechaOrigen);
         this.duenio=duenio;
     }

    @Override
    public void enivarNoti() {
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Date origin = super.getFechaOriginal();
        cal.setTime(origin);
        cal.add(Calendar.MONTH, this.valVis1);
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
    
    
      public void setValVis1(int valVis1) {
        this.valVis1 = valVis1;
    }

    
    
    public int getValVis1() {
        return valVis1;
    }

    @Override
    public void calcularDias() {
       //cada dos meses
       if(super.isFrecuencia()){
           this.setValVis1(4);
       }else{
           this.setValVis1(2);
       }
    }

  
    
    
}
