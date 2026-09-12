import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacto contacto = new Contacto();
        Scanner sc = new Scanner(System.in);

        int opcion, telefono;
        String nombre, descripcion;

        System.out.println("== Contactos ==");

        System.out.println(" 0 Salir ");
        System.out.println(" 1 Seguir");
        opcion = sc.nextInt();
        sc.nextLine();
        if (opcion != 0){
            do {
                System.out.println("Menu");

                System.out.println(" 1 Agregar Contactos ");
                System.out.println(" 2 Ver Contactos ");
                System.out.println(" 3 Editar Contacto ");
                System.out.println(" 4 Eliminar Contacto ");
                System.out.println(" 0 Salir");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println(" == Agregar Contacto == ");

                        System.out.println("Nombre: ");
                        nombre = sc.nextLine();

                        System.out.println("Descripcion: ");
                        descripcion = sc.nextLine();

                        System.out.println("Telefono: ");
                        telefono = sc.nextInt();

                        contacto.agregarContacto(nombre, descripcion, telefono);
                        break;

                    case 2:
                        System.out.println(" == Ver Contactos == ");

                        contacto.verContactos();
                        break;

                    case 3:
                        System.out.println(" == Editar Contactos ==");

                        System.out.println("Nombre: ");
                        nombre = sc.nextLine();

                        System.out.println("Descripcion: ");
                        descripcion = sc.nextLine();

                        System.out.println("Telefono: ");
                        telefono = sc.nextInt();

                        contacto.editarContacto(nombre, descripcion, telefono);
                        break;

                    case 4:
                        System.out.println(" == Eliminar Contacto ==");

                        System.out.println("Nombre: ");
                        nombre = sc.nextLine();

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
