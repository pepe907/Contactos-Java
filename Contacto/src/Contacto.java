import java.util.ArrayList;

public class Contacto {

    private ArrayList<Persona> personas = new ArrayList<>();


    public void agregarContacto(String nombre, String descripcion, int telefono){
        personas.add(new Persona(nombre, descripcion, telefono));
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
                System.out.println("Contacto eliminado ");
                break;
            }
        }
        System.out.println("Contacto no encontrado");
    }
}
