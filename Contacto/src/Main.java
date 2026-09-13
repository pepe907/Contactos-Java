import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacto contacto = new Contacto();
        Scanner sc = new Scanner(System.in);
        Error error = new Error(sc);

        int opcion, telefono;
        String nombre, descripcion;

        System.out.println("== Contactos ==");

        System.out.println(" 0 Salir ");
        System.out.println(" 1 Seguir");
        opcion = error.leerEntero("opcion: ");
        sc.nextLine();
        if (opcion != 0){
            do {
                System.out.println("Menu");

                System.out.println(" 1 Agregar Contactos ");
                System.out.println(" 2 Ver Contactos ");
                System.out.println(" 3 Editar Contacto ");
                System.out.println(" 4 Eliminar Contacto ");
                System.out.println(" 0 Salir");
                opcion = error.leerEntero("opcion: ");
                switch (opcion) {
                    case 1:
                        System.out.println(" == Agregar Contacto == ");

                        nombre = error.leerTexto("Nombre: ");
                        descripcion = error.leerTexto("descripcion: ");
                        telefono = error.leerEntero("Telefono: ");

                        contacto.agregarContacto(nombre, descripcion, telefono);
                        break;

                    case 2:
                        System.out.println(" == Ver Contactos == ");
                        contacto.verContactos();
                        break;

                    case 3:
                        System.out.println(" == Editar Contactos ==");

                        nombre = error.leerTexto("Nombre: ");
                        descripcion = error.leerTexto("descripcion: ");
                        telefono = error.leerEntero("Telefono: ");

                        contacto.editarContacto(nombre, descripcion, telefono);
                        break;

                    case 4:
                        System.out.println(" == Eliminar Contacto ==");
                        nombre = error.leerTexto("Nombre: ");

                        contacto.eliminarContacto(nombre);
                        break;

                    default:
                        System.out.println("Opcion no valida");
                }
            }while (opcion != 0);
        }else{
            System.out.println("Saliendo");
        }
        sc.close();
    }
}