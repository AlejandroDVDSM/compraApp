package model;

/**
 * 
 * @author Alejandro David Sánchez Marrero
 *         Carlos Santana Rodríguez
 */

public class CuentaBancaria {
    
    private int nTarjeta; //Atributo que almacenará el nº de tarjeta del usuario
    private int cSeguridad; //Atributo que almacenará el código de seguridad de la tarjeta del usuario
    private double dinero; //Atributo que almacenará la cantidad de dinero que tiene en la tarjeta
    private String fechaCaducidad; //Atributo que almacenará la fecha de caducidad de la tarjeta
    
    /**
     * Constructor por parámetros encargado de inicializar los atributos
     * 
     * @param nTarjeta: valor inicial de "this.nTarjeta"
     * @param cSeguridad: valor inicial de "this.cSeguridad"
     * @param fechaCaducidad: valor inicial de "this.fechaCaducidad"
     * @param dinero : valor inicial de "this.dinero"
     */
    public CuentaBancaria(int nTarjeta, int cSeguridad, String fechaCaducidad, double dinero) {
        this.nTarjeta = nTarjeta;
        this.cSeguridad = cSeguridad;
        this.dinero = dinero;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el valor del nº de la tarjeta
     */
    public int getNTarjeta() {
        return nTarjeta;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el valor del código de seguridad de la tarjeta
     */
    public int getCSeguridad() {
        return cSeguridad;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el valor almacenado en "dinero"
     */
    public double getDinero() {
        return dinero;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el la fecha en la que caduca la tarjeta
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
}
