package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;

public class Familiar extends Persona{
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar() {
        super();
    }
    public Familiar(String cedula, String nombre, String apellido, String direccion, String parentesco,
                    String tipoDeSangre, GregorianCalendar fechaDeNacimiento){
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
        return super.toString() +
                ",\n\t Parentesco: " + parentesco +
                ",\n\t Tipo de sangre: " + tipoDeSangre +
                ",\n\t Fecha De Nacimiento: " +
                (fechaDeNacimiento != null ?
                        fechaDeNacimiento.get(GregorianCalendar.YEAR) + "-" +
                                (fechaDeNacimiento.get(GregorianCalendar.MONTH) + 1) + "-" +
                                fechaDeNacimiento.get(GregorianCalendar.DAY_OF_MONTH)
                        : "No Especificada");

    }
}
