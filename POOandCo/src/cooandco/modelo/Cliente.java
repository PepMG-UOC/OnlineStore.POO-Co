package cooandco.modelo;

public abstract class Cliente {






    private String nombre;
    private String domicilio;
    private String nif;
    private String mail;

    public String tipoCliente;
    public float descuento;

    public float cuota;

    public Cliente(String nombre, String domicilio, String nif, String mail, String tipoCliente) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.mail = mail;
        this.tipoCliente = tipoCliente;

    }

    public Cliente(float descuento, float cuota) {
        this.descuento = descuento;
        this.cuota = cuota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public abstract String tipoCliente(String Estandar, String Premium);

    public abstract float calcAnual(float cuotaestandar, float cuotapremium);

    public abstract float descuentoEnv(float sindescuento, float condescuento);

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", nif='" + nif + '\'' +
                ", mail='" + mail + '\'' +
                ", tipo de cliente='" + tipoCliente + '\'' +
                '}';
    }

}
