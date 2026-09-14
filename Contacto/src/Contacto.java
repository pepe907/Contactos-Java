import java.util.ArrayList;

public class Contacto {

    private ArrayList<Persona> personas = new ArrayList<>();


    public void agregarContacto(String nombre, String descripcion, int telefono){
        for(int i = 0; i < personas.size(); i++){
            Persona p = personas.get(i);
            if (p.getTelefono() == telefono){
                System.out.println("Contacto ya registrado");
                return;
            }
        }
        personas.add(new Persona(nombre, descripcion, telefono));
        System.out.println("Contacto agregado con Exito");

        guardarContactoEnArchivo(nombre, descripcion, telefono);
    }


    public void verContactos(){
        for (int i = 0; i < personas.size(); i++){
            Persona p = personas.get(i);
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Descripcion: " + p.getDescripcion());
            System.out.println("Telefono: " + p.getTelefono());
        }
    }

    public boolean editarContacto(String nombre, String descripcion, int telefono) {
        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);
            if (p.getNombre().equals(nombre)) {
                p.setNombre(nombre);
                p.setDescripcion(descripcion);
                p.setTelefono(telefono);
                return true;
            }
        }
        System.out.println("Contacto no encontrado");
        return false;
    }


    public void eliminarContacto(String nombre){
        for (int i = 0; i < personas.size(); i++){
            Persona p = personas.get(i);
            if (p.getNombre().equals(nombre)){
                System.out.println("== Eliminar Contacto ==");
                System.out.println("Nombre: " + p.getNombre());
                personas.remove(i);
                System.out.println("Contacto eliminado ");
                return;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    public Persona buscarContacto(String nombre, int telefono){
        for (Persona p : personas){
            if (p.getNombre().equals(nombre) && p.getTelefono() == telefono){
                System.out.println(" == Contacto Encontrado == ");

                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Descripcion: " + p.getDescripcion());
                System.out.println("Telefono: " + p.getTelefono());
            }
        }
        System.out.println(" Contacto no Encontrado ");
        return null;
    }


    public void guardarContactoEnArchivo(String nombre, String descripcion, int telefono) {
        String nombreCarpeta = "MisContactos";
        String nombreArchivo = "contactos.txt";

        java.io.File carpeta = new java.io.File(nombreCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        java.io.File archivo = new java.io.File(carpeta, nombreArchivo);
        try (java.io.FileWriter escritor = new java.io.FileWriter(archivo, true)) {
            escritor.write(nombre + " | " + descripcion + " | " + telefono + "\n");
        } catch (java.io.IOException e) {
            System.out.println("Error al guardar el contacto en el archivo: " + e.getMessage());
        }
    }
}
