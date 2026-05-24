public class EtiquetaService {
    public void generarEtiqueta(Producto producto){
        PrecioService precioService = new PrecioService();
        double impuesto = precioService.precioProducto(producto); 

        System.out.println("### Tienda KINKORA ###"
        +"\n Codigo: "+producto.getCodigoPro()
        +"\n Nombre: "+producto.getNombre()
        +"\n Precio: $"+producto.getPrecio()
        +"\n Impuesto 19%: $"+impuesto
        +"\n Total: "+(producto.getPrecio()+impuesto)
        );
    }
}
