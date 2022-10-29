
package controlEscolar;

import java.util.List;
import javax.swing.JOptionPane;

public abstract class Tutor extends Usuario{
    private List<Alumno> listaAlumnos;

    //metodo constructor
    public Tutor(int id, String nombre, String apellido, String correo, List<Alumno> listaAlumnos) {
        super(id, nombre, apellido, correo);
        this.listaAlumnos = listaAlumnos;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    
    //Metodo para mostrar solo los datos de los Tutores
    @Override
    public void imprimirPerfil() {
        JOptionPane.showMessageDialog(null, "Tutor id: "+id+", Nombre: "+nombre+", apellido: "+apellido+", email: "+correo);
    }
    
    @Override //muestra el nomnbre de los alumnos y su calificacion.
    public void mostrarCalificacion() {
        for(Alumno lista: listaAlumnos){
            JOptionPane.showMessageDialog(null, "Nombre del alumno: "+lista.getNombre()+" "+lista.getApellido()+", calificacion: "+lista.getCalificacion());

        }      
    }
    
    
    
}
