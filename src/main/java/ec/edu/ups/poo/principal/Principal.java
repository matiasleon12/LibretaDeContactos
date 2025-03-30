package ec.edu.ups.poo.principal;

import java.util.GregorianCalendar;
import java.util.Scanner;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

public class Principal {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Persona persona = new Persona();
            persona.setNombre("juansito");
            persona.setDireccion("Sigsig");
            persona.setCedula("010101");
            persona.setApellido("Marciano");


            System.out.println("Ingresar la cantidad de Personas");
            int cantPersonas = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingresar la cantidad de familiares");
            int cantidadFamiliares = scanner.nextInt();
            scanner.nextLine();

            Persona[] personas = new Persona[cantPersonas];
            Familiar[] familiares = new Familiar[cantidadFamiliares];

            for (int i = 0; i < cantPersonas; i++){
                System.out.println("ingresar los Datos de cada persona " + (i+1) + ":");
                System.out.println("nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Apellido: ");
                String apellido = scanner.nextLine();
                System.out.println("Cedula: ");
                String cedula = scanner.nextLine();
                System.out.println("Direccion: ");
                String direccion = scanner.nextLine();

                personas[i] = new Persona(cedula, nombre, apellido, direccion);
            }

            for (int i = 0; i < cantidadFamiliares; i++){
                System.out.println("\nIngrese los datos del familiar " + (i+1)+ ":");
                System.out.println("Nombre:");
                String nombre = scanner.nextLine();
                System.out.println("Apellido:");
                String apellido = scanner.nextLine();
                System.out.println("Cedula:");
                String cedula = scanner.nextLine();
                System.out.println("Direccion: ");
                String direccion = scanner.nextLine();
                System.out.println("Parentesco: ");
                String parentesco = scanner.nextLine();
                System.out.println("Tipo de sangre: ");
                String tipoSangre = scanner.nextLine();
                System.out.println("Dia de nacimiento (1-31): ");
                int dia = scanner.nextInt();
                System.out.println("Mes de nacimiento(1-12): ");
                int mes = scanner.nextInt() -1;
                System.out.println("Año de nacimiento: ");
                int anio = scanner.nextInt();
                scanner.nextLine();

                GregorianCalendar fechaNac = new GregorianCalendar(anio, mes, dia);
                familiares[i] = new Familiar(cedula, nombre, apellido, direccion, parentesco, tipoSangre, fechaNac);

            }
            System.out.println("\n=== LISTA DE PERSONAS ===");
            for (int i=0;i< personas.length;i++){
                System.out.println(personas[i]);
                System.out.println("-----------------------------------------");
            }
            System.out.println("\n=== LISTA DE FAMILIARES ===");
            for (int i = 0; i < familiares.length; i++){
                System.out.println(familiares[i]);
                System.out.println("------------------------------------------");
            scanner.close();
            }
    }
}
