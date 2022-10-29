
package controlEscolar;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {
    //definimos variables
    static int idMaestro = 1, idTutor = 1, idAlumno = 1, contador = 0, opcion =0;
    static String nombre, apellido, correo;
    static float calificacion = 0.0f;
    
    //definimos listas
    static List<Usuario> listaUsuarios = new ArrayList<>();
    static List<Maestro> listaMaestros = new ArrayList<>();
    static List<Tutor> Tutor = new ArrayList<>();
//    static List<Tutor> TutoresGrupoB = new ArrayList<>();
    static List<Alumno> listaAlumno = new ArrayList<>();
//    static List<Alumno> listaAlumnoB = new ArrayList<>();
    
    //instanciamos objetos
    static Maestro maestro;
    static Tutor tutor;
    static Alumno alumno;
    static Usuario userNew;


    
    public static void main(String[] args) {
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\t: ......Menu...\n"
            +"\n1. Registrar Maestro."
            +"\n2. Registrar Alumno."
            +"\n3. Registrar Tutor."          
            +"\n4. Lista de Usuarios."
            +"\n5. Lista de Alumnos."
            +"\n6. Lista de Maestros."
            +"\n7. Lista de Tutores."
            +"\n8. Guardar Calificacion"
            +"\n9. Mostrar calificaciones de los alumnos"
            +"\n10. Mostrar calificacion de un alumno"
            +"\n11. Salir"));
            switch(opcion){
                case 1: //crea usuario maestro
                     nombre = JOptionPane.showInputDialog("Indicame el nombre del maestro: ");
                     apellido = JOptionPane.showInputDialog("Indicame el apellido del maestro: ");
                     correo = JOptionPane.showInputDialog("Indicame el email del maestro: ");
                     crearMaestro(nombre,apellido,correo);
                     JOptionPane.showMessageDialog(null, "Maestro registrado.");
                    break;
                case 2://crea usuario Alumno
                     nombre = JOptionPane.showInputDialog("Indicame el nombre del Alumno: ");
                     apellido = JOptionPane.showInputDialog("Indicame el apellido del Alumno: ");
                     correo = JOptionPane.showInputDialog("Indicame el email del Alumno: ");
                     crearAlumno(nombre,apellido,correo);
                     JOptionPane.showMessageDialog(null, "Alumno registrado.");
                    break;
                case 3://crea usuario Tutor
                    nombre = JOptionPane.showInputDialog("Indicame el nombre del Tutor: ");
                    apellido = JOptionPane.showInputDialog("Indicame el apellido del Tutor: ");
                    correo = JOptionPane.showInputDialog("Indicame el email del Tutor: ");
                    JOptionPane.showMessageDialog(null, "Tutor registrado.");
                    crearTutor( nombre,  apellido, correo);           
                    break;
                case 4://lista de todos los usuarios.
                    if(listaUsuarios.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No existen usuarios registrados.");
                    }else{
                        mostrarUsuarios();
                    }
                    break;
                case 5:
                    //lista de todos los alumnos.
                    if(listaAlumno.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No existen alumnos registrados.");
                    }else{
                        mostrarAlumno();
                    }
                    break;
                case 6:
                    //lista de todos los Maestros.
                    if(listaMaestros.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No existen Maestros registrados.");
                    }else{
                        mostrarMaestro();
                    }
                    break;
                case 7:
                    //lista de todos los Tutores.
                     if(Tutor.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No existen Tutores registrados.");
                    }else{
                        mostrarTutor();
                    }
                    break;
                case 8:
                    idAlumno = Integer.parseInt(JOptionPane.showInputDialog("Indicame tu id de alumno: "));
                    calificacion = Float.parseFloat(JOptionPane.showInputDialog("Indicame la calificacion de este alumno con id "+idAlumno));
                    registrarCalificacion(idAlumno, calificacion);
                    JOptionPane.showMessageDialog(null, "La calificacion se registro exitosamente.");
                    break;
                case 9:
                    if(listaAlumno.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No existen alumnos registrados.");
                    }else{
                        mostrarCalificaciones();
                    }
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no encontrada");
                    break;       
            }
        }while(opcion!=11);
    }
    
    public static List<Usuario> crearMaestro(String nombre, String apellido, String correo){
        //polimorfismo
        userNew = new Maestro(idMaestro, nombre, apellido, correo) {};//upcasting
        listaUsuarios.add(userNew);
        //downcasting
        Maestro masterNew = (Maestro) userNew;
        listaMaestros.add(masterNew);
        idMaestro++;
        contador++;
        return listaUsuarios;
    } 
    
    public static List<Usuario> crearTutor(String nombre, String apellido, String correo){
        //polimorfismo
        userNew = new Tutor(idTutor, nombre, apellido, correo, listaAlumno) {};//upcasting
        listaUsuarios.add(userNew);
        //downcasting
        Tutor tutorNew = (Tutor) userNew;
        Tutor.add(tutorNew);
        idTutor++;
        contador++;
        return listaUsuarios;
    } 
    
     public static List<Usuario> crearAlumno(String nombre, String apellido, String correo){
        //polimorfismo
        userNew = new Alumno(idAlumno, nombre, apellido, correo, calificacion) {};//upcasting
        listaUsuarios.add(userNew);
        //downcasting
        Alumno alumnoNew = (Alumno) userNew;
        listaAlumno.add(alumnoNew);
        idTutor++;
        contador++;
        return listaUsuarios;
    } 
     
     //Mostramos la lista de usuarios
     public static void mostrarUsuarios(){
         for(Usuario list: listaUsuarios){
             list.imprimirPerfil();
         }
     }
     
     //Mostramos la lista de Alumnos
     public static void mostrarAlumno(){
         for(Usuario list: listaAlumno){
             list.imprimirPerfil();
         }
     }
     
     //Mostramos la lista de Maestros
     public static void mostrarMaestro(){
         for(Usuario list: listaMaestros){
             list.imprimirPerfil();
         }
     }
     
     //Mostramos la lista de Tutores
     public static void mostrarTutor(){
         for(Tutor list: Tutor){
             list.imprimirPerfil();
         }
     }
     
     public static void registrarCalificacion(int idAlumno, float calificacion){
         Alumno alumno = (Alumno)userNew;
         for(Alumno al: listaAlumno){
             al.setCalificacion(calificacion);
             al.guardarCalificacion(calificacion);
             listaAlumno.set(idAlumno-1, al);
         }      
     }
     
     public static void mostrarCalificaciones(){
         for(Alumno lista: listaAlumno){
             lista.mostrarCalificacion();
         }
//         Tutor tutor = (Tutor)userNew;
//         tutor.mostrarCalificacion();
     }
    
}
