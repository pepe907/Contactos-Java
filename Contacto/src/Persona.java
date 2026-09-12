public class Persona {
    private String nombre;
    private String descripcion;
    private int telefono;


    public Persona(String nombre, String descripcion, int telefono){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }
}
