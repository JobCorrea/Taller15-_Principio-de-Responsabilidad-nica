public class Libro {
    private final String nombre;
    private String editorial;
    private int anio;

    public Libro(String nombre, String editorial, int anio) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.anio = anio;
    }
    public String getNombre() { return nombre; }
    public String getEditorial() { return editorial; }
    public int getAnio() { return anio; }
}