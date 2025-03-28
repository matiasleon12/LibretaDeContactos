package ec.edu.ups.poo.principal;

import java.util.Scanner;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

public class Principal {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de Personas");
            int n = scanner.nextInt();
            scanner.nextLine();
            Persona[] personas = new Persona[n];
            for (int i = 0; i < n; i++){
                System.out.println("ingresar los Datos de cada persona");
                Persona persona = new Persona();
                System.out.println("nombre: ");
                persona.setNombre(scanner.nextLine());
                System.out.println("Apellido: ");
                persona.setApellido(scanner.nextLine());
                System.out.println("Cedula: ");
                persona.setCedula(scanner.nextLine());
                System.out.println("Direccion: ");
                persona.setDireccion(scanner.nextLine());
                personas[i] = persona;
            }
            for (int i = 0; i < personas.length; i++) {
                System.out.println("---------"+"Persona "+ (i+1)+"---------");
                System.out.println("Nombre: "+personas[i].getNombre());
                System.out.println("Apellido: "+personas[i].getApellido());
                System.out.println("Cedula: "+personas[i].getCedula());
                System.out.println("Direccion: "+personas[i].getDireccion());

                Familiar familiar=new Familiar();
                familiar.setCedula("0101010");
                familiar.setNombre("Nombre 1");
                familiar.setApellido("Apellido 1");
                familiar.setDireccion("Familiar Direccion");
                familiar.setParentesco("");
            }
    }
}

