package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona{
    private String parentesco;
    private String tipoDeSangre;
    private Calendar fechaDeNacimiento;

    public Familiar(){}

    public Familiar(String cedula,String nombre, String apellido, String direccion, int edad){
        super(cedula,nombre,apellido,direccion);
        this.parentesco=parentesco;
        this.tipoDeSangre=tipoDeSangre;
        this.fechaDeNacimiento=fechaDeNacimiento;
    }
    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco){
        this.parentesco=parentesco;
    }
    public String getTipoDeSangre() {
        return tipoDeSangre;
    }
    public void setTipoDeSangre(String tipoDeSangre){
        this.tipoDeSangre=tipoDeSangre;
    }
    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    @Override
    public String toString() {
        return
    }
}
