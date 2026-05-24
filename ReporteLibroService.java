public class ReporteLibroService {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte de libro "+"Nombre: " + libro.getNombre() + " - " +"Editorial: "+libro.getEditorial());
    }
}
