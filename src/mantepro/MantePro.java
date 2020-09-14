/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantepro;

import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Daniel
 */
public class MantePro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //enviar correo
//        Calendar cal = Calendar.getInstance();
        Date origin = new Date(120, 4,13);
//        cal.setTime(origin);
//        cal.add(Calendar.MONTH, 4);
//        Date final2 = cal.getTime();
//        
        System.out.println(origin);

//String nombre,int numDias,Date fechaOrigen,boolean useFrecuente
    Puertas ejem = new Puertas("corredor",true,origin,"daniel");
    
    ejem.calcularDias();
    ejem.enivarNoti();
     System.out.println(ejem.getValVis1());
    }
    
}
