package cuentas;

/**
 * Clase que describe cuenta bancaria con nombre, cuenta, saldo y tipo de interés.
 * @author Roberto Suárez Esteban.
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() // Constructor por defecto.
    {
    }
    
    /**
     * Constructor con parámetros:
     * @param nom, nombre del titular.
     * @param cue, número de cuenta.
     * @param sal, saldo de la cuenta.
     * @param tipo, tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * 
     * @return saldo de la cuenta obtenido con llamada a método secundario.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * 
     * @param cantidad, cantidad a ingresar en la cuenta.
     * @throws Exception si la cantidad a ingresar es menor que cero.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad, cantidad a retirar de la cuenta (double).
     * @throws Exception si la cantidad a retirar es negativa o es mayor que el saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return Nombre del titular de la cuenta (String).
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre para guardar (String).
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el número de cuenta (String).
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta el número de cuenta a guardar (String).
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo de la cuenta (double).
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo a guardar en la cuenta (double).
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipo de interés de la cuenta (double).
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres el tipo de interés a fijar en la cuenta (double).
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}

