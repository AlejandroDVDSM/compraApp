package compraapp;

import gui.CompraForm;
import model.Producto;
import model.Chat;
import file.CompraFile;

/**
 * @author Alejandro David Sánchez Marrero
 *         Carlos Santana Rodríguez
 */
public class CompraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto producto = new Producto();
        Chat chat = new Chat();
        CompraForm compraForm = new CompraForm();
        compraForm.setVisible(true);
        compraForm.producto = producto;
        compraForm.chat = chat;
        
        CompraFile file = new CompraFile();
        compraForm.file = file;
    }
    
}
