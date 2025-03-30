package ec.edu.ups.poo.clases;
// buena impresion
public class Persona {
    private String nombre;
    private String cedula;
    private String apellido;
    private String direccion;


    public Persona(String cedula, String nombre, String apellido, String direccion) {
    this.nombre=nombre;
    this.apellido=apellido;
    this.cedula=cedula;
    this.direccion=direccion;
    }
    public Persona(){}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedula() {
        return cedula;
    }
    public int suma(int num1, int num2){
        int suma = num1+num2;
        return suma;
    }
    @Override
    public String toString(){
        return "\t Cedula: "+ cedula+
                "\n\t Nombre: " + nombre+
                "\n\t Apellido: " + apellido+
                "\n\t Direccion: " + direccion;

    }
}

