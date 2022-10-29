
package controlEscolar;

import javax.swing.JOptionPane;

public abstract class Maestro extends Usuario{//implementamos la herencia

    public Maestro(int id, String nombre, String apellido, String correo) {
        super(id, nombre, apellido, correo);
    }
    
    //Metodo para mostrar solo os datos de los Maestros
    @Override
    public void imprimirPerfil() {
        JOptionPane.showMessageDialog(null, "Maestro id: "+id+", Nombre: "+nombre+", apellido: "+apellido+", email: "+correo);
    }
    
}
