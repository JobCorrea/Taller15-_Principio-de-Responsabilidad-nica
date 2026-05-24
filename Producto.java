public class Producto {
    private int codigoPro;
    private String nombre;
    private double precio;

    public Producto(int codigoPro, String nombre, double precio) {
        this.codigoPro = codigoPro;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigoPro(){return codigoPro;}
    public String getNombre(){return nombre;}
    public double getPrecio(){return precio;}
    
}
