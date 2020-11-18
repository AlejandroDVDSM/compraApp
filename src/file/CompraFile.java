package file;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import model.Usuario;
import model.Chat;
import model.Producto;
import model.CuentaBancaria;
import model.Direccion;
/**
 * @author Alejandro David Sánchez Marrero
 *         Carlos Santana Rodríguez
 */

public class CompraFile {
    
    String nombre = "Compra.text"; //Nombre del archivo que se creará
    Scanner s; //Scanner usado para obtener los del archivo
    
    /**
     * Método que se encarga de guardar los datos de la aplicación en el archivo "Compra.text"
     * 
     * @param argChat: objeto de tipo "Chat"
     * @param argProducto: objeto de tipo "argProducto"
     * @param argUsuario: objeto de tipo "argUsuario"
     * @param argDireccion: objeto de tipo "argDireccion"
     * @param argCuenta : objeto de tipo "argCuenta"
     */
    public void SaveToFile(Chat argChat, Producto argProducto, Usuario argUsuario, Direccion argDireccion, CuentaBancaria argCuenta) {
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter(nombre);
            pw = new PrintWriter(fichero);
            
            //Nº de productos comprados
            pw.write(argProducto.productosComprados.size() + "\n");
            //Nombre y precio de cada producto comprado
            for (int i = 0; i < argProducto.productosComprados.size(); i++) {
                pw.write(argProducto.productosComprados.get(i) + "\n");
            }
            
            //Nº de chats abiertos
            pw.write(argChat.conver.size() + "\n");
            //Nombre de cada chat y mensaje enviados
            for(int i = 0; i < argChat.conver.size(); i ++) {
                pw.write(argChat.conver.get(i).getNombreUsuarioInteresado() + "\n*\n" + argChat.conver.get(i).getMensaje() + "*\n");
            }
            
            //Nº de productos puestos en venta
            pw.write(argProducto.listaProducto.size() + "\n");
            //Detalles de cada producto puesto en venta
            for(int i = 0; i < argProducto.listaProducto.size(); i ++) {
                pw.write(argProducto.listaProducto.get(i).getNombre() + "\n" + argProducto.listaProducto.get(i).getPrecio() + "\n" + argProducto.listaProducto.get(i).getDescripcion() + "\n" + argProducto.listaProducto.get(i).getAceptaEnvio() + " " + argProducto.listaProducto.get(i).getEstado() + "\n");
            }
            
            //Datos del usuario, su direccion y su cuenta bancaria
            pw.write(argUsuario.getNombre() + "\n" + argUsuario.getEmail() + " " + argUsuario.getNumTel() + "\n");
            pw.write(argDireccion.getCalle() + "\n"  + argDireccion.getCPostal() + "\n" + argDireccion.getCiudad() + "\n");
            pw.write(argCuenta.getNTarjeta() + " " + argCuenta.getCSeguridad() + " " + argCuenta.getFechaCaducidad() + " " + argCuenta.getDinero() + " ");
            
     
        } catch (Exception e) {
            e.printStackTrace();
	} finally {
	    try {
                if (null != fichero)
                    fichero.close();
	    } catch (Exception e2) {
                e2.printStackTrace();
	    }
	}
    }
    
    /**
     * Método que se encarga de cargar los datos recogidos en el archivo "Compra.text"
     * 
     * @param argChat: objeto de tipo "Chat"
     * @param argProducto: objeto de tipo "argProducto"
     * @param argUsuario: objeto de tipo "argUsuario"
     * @param argDireccion: objeto de tipo "argDireccion"
     * @param argCuenta : objeto de tipo "argCuenta"
     */
    public void loadFromFile(Chat argChat, Producto argProducto) {
        
        try {
            s = new Scanner(new File("Compra.text"));
            int n, c, k; //Atributos enteros donde se almacenarán el nº de productos comprados, chats abiertos y productos puestos en venta, respectivamente
            
            //Cargamos los productos comprados
            n = s.nextInt();
            for(int i = 0; i < n; i++) {
                argProducto.comprarProducto(s.next());
            }
            
            //Cargamos los chat abiertos
            c = s.nextInt();
            String usuario;
            String mensaje = "";
            
            for(int i = 0; i < c; i++) {
                usuario = s.next();
                s.next();

                while(s.hasNextLine()) {
                    String palabra = s.next();
                    if(!"*".equals(palabra)) {
                        mensaje += palabra + s.nextLine() + "\n";
                    } else {
                        break;
                    }
                }
                argChat.añadirConver(mensaje, usuario);
                mensaje = "";
            }
            
            //Cargamos los productos puestos en venta
            k = s.nextInt();
            for(int i = 0; i < k; i ++) {
                s.nextLine();
                String nombre = s.nextLine();
                Double precio = Double.parseDouble(s.next());
                s.nextLine();
                String descripcion = s.nextLine();
                boolean aceptaEnvio = s.nextBoolean();
                int estado = s.nextInt();
                
                argProducto.añadirProducto(nombre, precio, descripcion, aceptaEnvio, estado);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     * Método que se encarga de crear un usuario con los datos recogidos en el archivo
     * @return 
     */
    public Usuario getUsuario(){
        s.nextLine();
        Usuario usuario = new Usuario(s.nextLine(), s.next(), s.next());
        return usuario;
    }

    /**
     * Método que se encarga de crear una dirección con los datos recogidos en el archivo
     * @return 
     */    
    public Direccion getDireccion() {
        s.nextLine();
        String calle = s.nextLine();
        String cPostal = s.next();
        s.nextLine();
        String ciudad = s.nextLine();
        Direccion direccion = new Direccion(calle, cPostal, ciudad);
        return direccion;
    }

    /**
     * Método que se encarga de crear una cuenta bancaria con los datos recogidos en el archivo
     * @return 
     */    
    public CuentaBancaria getCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria(s.nextInt(), s.nextInt(), s.next(), Double.parseDouble(s.next()));
        return cuenta;
    }
}
