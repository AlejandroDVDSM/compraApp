package model;

/**
 * 
 * @author Alejandro David Sánchez Marrero
 *         Carlos Santana Rodríguez
 */

public class Conversacion {
    
    private String mensaje; //Atributo que almacenará el mensaje enviado
    private String nombreUsuarioInteresado; //Atributo que almacenará el nombre del usuario con el que hablamos
    
    /**
     * Constructor por parámetros encargado de inicializar los atributos
     * 
     * @param mensaje: valor inicial de "this.mensaje"
     * @param nombreUsuarioInteresado valor inicial de "this.nombreUsuarioInteresado"
     */
    public Conversacion(String mensaje, String nombreUsuarioInteresado) {
        this.mensaje = mensaje;
        this.nombreUsuarioInteresado = nombreUsuarioInteresado;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el nombre el usuario con el que hablamos
     */
    public String getNombreUsuarioInteresado() {
        return nombreUsuarioInteresado;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el mensaje enviado
     */
    public String getMensaje() {
        return mensaje;
    }
    
    /**
     * Método setter
     * 
     * @param mensaje: string que establecerá el valor de la variable mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
