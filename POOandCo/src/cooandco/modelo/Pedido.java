package cooandco.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private Articulo articulo;
    private LocalDate fecha;
    private LocalTime hora;

    private int cantidad;

    private float precioTotal;


    public Pedido(int numero, Cliente cliente, Articulo articulo, int cantidad) {
        this.numero = numero;
        this.cliente = cliente;
        this.articulo = articulo;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    public boolean pedidoEnviado(){

        LocalTime hora1 = hora;
        LocalTime hora2 =LocalTime.now();

       int compareResult = hora1.compareTo(hora2);

        if (compareResult > 3) {
            return true;

        }else{
            return false;
        }
    };

    public float precioEnvio(){
        //float precioTotal;
        precioTotal = articulo.getGastosEnvio();
        precioTotal = precioTotal* cliente.descuentoEnv(100, 30)/100;
        precioTotal =precioTotal*cantidad;
        return precioTotal;
    };



    //El método toString debe construir una cadena con los datos siguientes: número de pedido, fecha y hora del
    //pedido, Nif y nombre del cliente, código y descripción del artículo, cantidad, precio artículo, coste envío,
    //precio total y si ya se ha enviado.

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", articulo=" + articulo +
                "NIF del Cliente: " + this.cliente.getNif() +
                "Nombre Cliente: " + this.cliente.getNombre() +
                "Codigo Articulo: " + this.articulo.getCodigo() +
                "Descripcion Articulo: " + this.articulo.getDescripcion() +
                "gastos envio: " + this.articulo.getGastosEnvio() +
                "precio articulo: " + this.articulo.getPrecio() +
                "precio total: " + precioTotal +
                "pedido enviado: " + this.pedidoEnviado() +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", cantidad=" + cantidad +
                '}';
    }
}
