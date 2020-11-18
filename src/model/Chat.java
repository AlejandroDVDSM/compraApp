package model;

import java.util.ArrayList;

/**
 * 
 * @author Alejandro David Sánchez Marrero
 *         Carlos Santana Rodríguez
 */
public class Chat {
    
    //ArrayList de que contendrá objetos de tipo Conversacion en donde se
    //almacenarán los mensajes y el nombre del usuario con el que hablamos
    public ArrayList<Conversacion> conver; 
    
    /**
     * Constructor por defecto encargado de inicializar el ArrayList
     */
    public Chat() {
        conver = new ArrayList<Conversacion>();
    }
    
    /**
     * Añade un objeto de tipo Conversacion al ArrayList
     * 
     * @param mensaje: el mensaje enviado al usuario con el que hablamos
     * @param nombreUsuarioInteresado: nombre del usuario con el que hablamos
     */
    public void añadirConver(String mensaje, String nombreUsuarioInteresado) {
        conver.add(new Conversacion(mensaje, nombreUsuarioInteresado));
    }
    
    /**
     * Elimina un objeto del ArrayLis
     * 
     * @param c: objeto a eliminar
     */
    public void eliminarConver(Conversacion c) {
        conver.remove(c);
    }
}
