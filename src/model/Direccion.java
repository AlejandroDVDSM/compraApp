package model;

/**
 * @author Alejandro David Sánchez Marrero
 *         Carlos Santana Rodríguez
 */

public class Direccion {
    private String calle; //Atributo que almacenará la calle del usuario
    private String cPostal; //Atributo que almacenará el código postal del usuario
    private String ciudad; //Atributo que almacenará la ciduad del usuario
    
    /**
     * Constructor por parámetros encargado de inicializar los atributos
     * 
     * @param calle: valor inicial de "this.calle"
     * @param cPostal: valor inicial de "this.cPostal"
     * @param ciudad : valor inicial de "this.ciudad"
     */
    public Direccion(String calle, String cPostal, String ciudad) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.cPostal = cPostal;
    }
    
    /**
     * Método getter
     * 
     * @return devolverá la calle del usuario
     */
    public String getCalle() {
        return calle;
    }
    
    /**
     * Método getter
     * 
     * @return devolverá el código postal del usuario
     */
    public String getCPostal() {
        return cPostal;
    }
    
    /**
     * Método getter
     * 
     * @return devolverá la ciudad del usuario
     */
    public String getCiudad() {
        return ciudad;
    }
}
