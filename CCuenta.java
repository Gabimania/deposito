public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta.
     *
     * @param nombre El nombre del titular de la cuenta.
     * @param cuenta El número de cuenta.
     * @param saldo El saldo inicial de la cuenta.
     * @param tipoInteres El tipo de interés asociado a la cuenta.
     */

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres)
    {
        nombre =nombre;
        cuenta=cuenta;
        saldo=saldo;
        tipoInteres = tipoInteres;
    }

    /**
     Getters y Setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInteres;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInteres = tipoInterés;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa, lanza una excepción.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo  += cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente, lanza una excepción.
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo -= cantidad;
    }
}
