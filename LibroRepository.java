public class LibroRepository {
    public void guardarLibro(Libro libro) {
        System.out.println("Guardando: " + libro.getNombre()+" - "+"año: "+libro.getAnio());
    }
}
