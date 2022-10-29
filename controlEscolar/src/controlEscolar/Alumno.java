
package controlEscolar;

import javax.swing.JOptionPane;

public abstract class Alumno extends Usuario{
    private float calificacion;

    //Metodo constructor con la calificacion
    public Alumno(int id, String nombre, String apellido, String correo, float calificacion) {
        super(id, nombre, apellido, correo);
        this.calificacion = calificacion;
    }

    //metodos accesores
    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
    //Metodo para mostrar solo os datos de los Alumnos
    @Override
    public void imprimirPerfil() {
        JOptionPane.showMessageDialog(null, "Alumno id: "+id+", Nombre: "+nombre+", apellido: "+apellido+", email: "+correo);
    }
    
    @Override
    public float guardarCalificacion(float calificacion){
        return calificacion;
    }
    
    @Override
    public void mostrarCalificacion() {
        JOptionPane.showMessageDialog(null, "Nombre del alumno: "+nombre+" "+apellido+", calificacion: "+calificacion);
    }
}
