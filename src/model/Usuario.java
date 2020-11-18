package model;

/**
 * @author Alejandro David Sánchez Marrero
 *         Carlos Santana Rodríguez
 */
public class Usuario {
    
    private String nombre; //Atributo que contendrá el nombre del usuario
    private String email; //Atributo que contendrá el email del usuario
    private String numTel; //Atributo que contendrá el nº de teléfono del usuario
    
    /**
     * Constructor por parámetros encargado de inicializar los atributos
     * 
     * @param nombre: valor incial de "nombre"
     * @param email: valor incial de "email"
     * @param numTel : valor incial de "numTel"
     */
    public Usuario(String nombre, String email, String numTel) {
        this.nombre = nombre;
        this.email = email;
        this.numTel = numTel;
    }
    
    /**
     * Método getter
     * 
     * @return  devuelve el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el email del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método getter
     * 
     * @return devuelve el nº de teléfono del usuario
     */
    public String getNumTel() {
        return numTel;
    }
}
