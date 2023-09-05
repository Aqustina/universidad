
package probando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Probando {

    
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //CARGAR DRIVERS
            Class.forName("org.mariadb.jdbc.Driver");
            //CONEXION BD
            Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/g4e1", "root", "");
            
            
            //AGREGAR ALUMNOS
            /*String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado)"
                    + "VALUES (27442912, 'Riuwt', 'Stella', '1947-03-07',1),"
                    + "(4382579, 'Part', 'Martina', '1987-07-26', 0),"
                    + "(32458888, 'Sanchez', 'Sabrina', '1964-09-06', 1)";
            PreparedStatement ps = cnx.prepareStatement(sql);
            int fila = ps.executeUpdate();
            if(fila > 0){
                JOptionPane.showMessageDialog(null, "ALUMNO AGREGADO EXITOSAMENTE");
            }*/
            
            //MODIFICIAR ALUMNO
            /*String sql = "UPDATE alumno SET nombre = 'Roxana' WHERE idAlumno = 3";
            PreparedStatement ps = cnx.prepareStatement(sql);
            int registros = ps.executeUpdate();
            System.out.println(registros);*/
                    
            //AGREGAR MATERIAS
             /* String sql = "INSERT INTO materia(nombre,año, estado) "
                    + "VALUES ('Laboratorio 2', 2, true),"
                    + "('Practica profesional', 4, true),"
                    + "('Logica 1', 1, true)";
            
            PreparedStatement ps = cnx.prepareStatement(sql);
            int fila = ps.executeUpdate();
            if(fila > 0){
                JOptionPane.showMessageDialog(null, "MATERIA AGREGADA EXITOSAMENTE");
            }*/
            
            //INSCRIPSION
            /*String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria)"
                    + " VALUES (9, 1,3),"
                    + "(7,1,1),"
                    + "(8,2,3),"
                    + "(10,2,1),"
                    + "(7,3,3),"
                    + "(7,3,1)";
            
            PreparedStatement ps = cnx.prepareStatement(sql);
            int fila = ps.executeUpdate();
            if(fila > 0){
                JOptionPane.showMessageDialog(null, "INSCRIPCION REALIZADA");
            }*/
            
            //DESINSCRIBIR
            String sql = "DELETE FROM inscripcion WHERE idAlumno = 3 AND idMateria = 1 ";
            PreparedStatement ps = cnx.prepareStatement(sql);
            int fila = ps.executeUpdate();
            if(fila > 0){
                JOptionPane.showMessageDialog(null, "INSCRIPCION ELIMINADA");
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "AGREGAR DRIVERS AL PROYECTO"); //FALTA CARGAR DRIVERS
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION "+ex.getMessage()); //FALTA CONECTAR
        }    
    }
    
}
