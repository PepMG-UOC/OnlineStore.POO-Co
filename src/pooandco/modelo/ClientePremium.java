package pooandco.modelo;

public class ClientePremium extends Cliente{


    public ClientePremium(String nombre, String domicilio, String nif, String mail, String tipoCliente, float descuento, float cuota) {
        super(nombre, domicilio, nif, mail, tipoCliente);
    }


    @Override
    public String tipoCliente(String Estandar, String Premium) {
        return null;
    }

    @Override
    public float calcAnual(float cuotaestandar, float cuotapremium) {
        cuotaestandar = 20;
        return cuotaestandar;
    }

    @Override
    public float descuentoEnv(float sindescuento, float condescuento) {
        sindescuento = 30;
        return sindescuento;
    }


    @Override
    public String toString() {
        return "Premium{" +
                "cuota=" + cuota +
                ", descuento=" + descuento +
                '}';
    }

}
