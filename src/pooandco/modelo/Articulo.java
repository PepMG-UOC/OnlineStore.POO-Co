package pooandco.modelo;

public class Articulo {

    private float gastosEnvio;
    private String descripcion;
    private int codigo;
    private float precio;

    public float getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(float gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "gastosEnvio=" + gastosEnvio +
                ", descripcion='" + descripcion + '\'' +
                ", codigo=" + codigo +
                ", precio=" + precio +
                '}';
    }


}
