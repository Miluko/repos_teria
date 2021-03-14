package cuentas;
/** esta clase crea los atributos y métodos de una cuenta bancaria
 * 
 * @author Mariluz 
 */


public class CCuenta {
    
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**método constructor por defecto
     * 
     */
    
    public CCuenta()
    {
    }
/** método constructor que asigna los valores a los atributos de CCuenta
 * 
 * @param nom nombre del cliente
 * @param cue   número de cuenta
 * @param sal   salario de la cuenta
 * @param tipo  tipo de interés de la cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** método que devuelve el saldo disponible en la cuenta
     * 
     * @return  devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    
/** método que permite ingresar una cantidad en el saldo de la cuenta
 * 
 * @param cantidad cantidad que se ingresa al saldo
 * @throws Exception  no se puede ingresar una cantidad negativa
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
/**método que permite retirar una cantidad del saldo de la cuenta
 * 
 * @param cantidad Cantidad que deberá resta al saldo
 * @throws Exception  no es posible retirar una cantidad negativa ni una cantidad superior al saldo
 */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**método que devuelve el nomre del cliente
     * @return the nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**método que le asigna un valor al nombre del cliente
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**método que devuelve el número de cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**método que asigna un valor al número de cuenta.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**método que devuelve el saldo de la cuenta
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**método que le asigna valor al saldo de la cuenta
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**método que devuelve el valor de tipo de interes
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**método que asigna un valor a tipoInteres
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

