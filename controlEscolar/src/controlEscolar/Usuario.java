
package controlEscolar;

//hacemos uso de las interfaces persona y administracion mediante el uso de la palabra reservada implements

import javax.swing.JOptionPane;

public abstract class Usuario implements Persona, Administracion{//implementamos herencia multiple
    //encapsulamiento
    //Declaramos las variables usadas, haciendolas protected para que puedan ser heredadas por las clases hijas
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;

    //Metodo constructor
    public Usuario(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    //metodos accesores Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //Fin de metodos accesores Getter y Setter
    
    
    //sobreescritura de miembros
    //Metodo para mostrar los datos de los usuarios
    @Override
    public void imprimirPerfil() {
        JOptionPane.showMessageDialog(null,"Usuario id: "+id+", Nombre: "+nombre+", apellido: "+apellido+", email: "+correo);
    }

    @Override
    public float guardarCalificacion(float calificacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarCalificacion() {
        
    }
    
}
