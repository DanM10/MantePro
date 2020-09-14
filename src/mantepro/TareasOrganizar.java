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

public abstract class TareasOrganizar {
    private final Calendar cal = Calendar.getInstance();
    private boolean frecuencia;
    private Date fechaOriginal;
    private Date fechaF;
    
    
    
    
    abstract void enivarNoti();
    
    abstract void calcularDias();
          
    public boolean isFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(boolean frecuencia) {
        this.frecuencia = frecuencia;
    }

   

    public Date getFechaOriginal() {
        return fechaOriginal;
    }

    public void setFechaOriginal(Date fechaOriginal) {
        this.fechaOriginal = fechaOriginal;
    }

    public Date getFechaF() {
        return fechaF;
    }

    public void setFechaF(Date fechaF) {
        this.fechaF = fechaF;
    }

    
    
}
