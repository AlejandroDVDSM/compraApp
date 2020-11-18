package model;

import java.util.ArrayList;

/**
 * @author Alejandro David Sánchez Marrero
 *         Carlos Santana Rodríguez
 */

public class Producto {
    private String nombre; //Atributo que indica el nombre del producto
    private double precio; //Atributo que indica el  precio del producto
    private String descripcion; //Atributo que indica la descripción del producto
    private boolean aceptaEnvio; //Atributo que indica si se realizan envíos
    
    int estado; //Atributo destinado a conocer en que estado se encuentra el producto
    
    public ArrayList<Producto> listaProducto; //ArrayList que contendrá objetos de tipo <Producto> que contendrá todos los productos puestos en venta
    public ArrayList<String> productosComprados; //ArrayList que contendrá strings con el nombre y precio de los productos comprados
    
    /**
     * Constructor por parámetros encargado de inicializar los atributos
     * 
     * @param nombre: valor inicial de "this.nombre"
     * @param precio: valor inicial de "this.precio"
     * @param descripcion: valor inicial de "this.descripcion"
     * @param aceptaEnvio: valor inicial de "this.aceptaEnvio"
     * @param estado : valor inicial de "this.estado"
     */
    public Producto(String nombre, double precio, String descripcion, boolean aceptaEnvio, int estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.aceptaEnvio = aceptaEnvio;
        this.estado = estado;
    }
    
    /**
     * Constructor por defecto encargado de inicializar los ArrayList
     */
    public Producto() {
        listaProducto = new ArrayList<Producto>();
        productosComprados = new ArrayList<String>();
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve el precio del producto
     */
    
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve la descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve "true" si el vendedor realiza envíos
     *         "false" en el caso contrario
     */
    public boolean getAceptaEnvio() {
        return aceptaEnvio;
    }
    
    /**
     * Método getter
     * 
     * @return devuelve "0" si el estado del producto es nuevo
     *         "1" si está usado
     *         "2" si se encuentra en un estado desperfecto
     */
    public int getEstado() {
        return estado;
    }
    
    /**
     * Método que devuelve una string en función de si el 
     * vendedor realiza envíos
     * 
     * @return devuelve "Sí" en caso de que "aceptaEnvio" sea "true"
     *         "No" en caso de que sea "false
     */
    public String envios() {
        if(aceptaEnvio) {
            return "Sí";
        }
        return "No";
    }
    
    /**
     * Método que devuelve una string en función del estado en el que se
     * encuentre el producto
     * 
     * @return devuelve "nuevo" en caso de que "estado" valga "0"
     *         "usado" en caso de que valga "1"
     *         "dessperfecto" en caso de que valga "2"
     */
    public String estadoProducto() {
        if(estado == 0) {
            return "nuevo";
        }
        
        if(estado == 1) {
            return "usado";
        }
        
        return "desperfecto";
    }
    
    /**
     * Añade un objeto de tipo "Producto" al arrayList "listaProducto"
     * 
     * @param nombre: nombre del producto
     * @param precio: precio del producto
     * @param descripcion: descripcion del producto
     * @param aceptaEnvio: predisposición del vendedor a realizar envíos
     * @param estado : estado del producto
     */
    public void añadirProducto(String nombre, double precio, String descripcion, boolean aceptaEnvio, int estado) {
        listaProducto.add(new Producto(nombre, precio, descripcion, aceptaEnvio, estado));
    }
    
    /**
     * Añade una string al arrayList "productosComprados"
     * 
     * @param s: string con el nombre y precio del producto
     */
    public void comprarProducto(String s) {
        productosComprados.add(s);
    }
    
    /**
     * Elimina un objeto al arrayList "listaProducto"
     * @param p: producto a eliminar
     */
    public void eliminarProducto(Producto p) {
        listaProducto.remove(p);
    }
}