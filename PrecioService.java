public class PrecioService {
    public double  precioProducto(Producto producto){
        return producto.getPrecio()*0.19;
    }
}
