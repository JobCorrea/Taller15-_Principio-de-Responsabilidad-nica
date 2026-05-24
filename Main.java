public class Main{
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Planeta", 1605);

        ReporteLibroService reporte = new ReporteLibroService();
        reporte.generarReporte(libro);

        LibroRepository repository = new LibroRepository();
        repository.guardarLibro(libro);
    }
}