package cooandco.modelo;

public class ClienteEstandar extends Cliente {


    public ClienteEstandar(String nombre, String domicilio, String nif, String mail, String tipoCliente) {
        super(nombre, domicilio, nif, mail, tipoCliente);

    }

    @Override
    public String tipoCliente(String Estandar, String Premium) {
        return Estandar;
    }

    @Override
    public float calcAnual(float cuotaestandar, float cuotapremium) {
        cuotaestandar = 0;
        return cuotaestandar;
    }

    @Override
    public float descuentoEnv(float sindescuento, float condescuento) {
        sindescuento = 100;
        return sindescuento;
    }

    @Override
    public String toString() {
        return "ClienteEstandar{}";
    }
}
