
package controladores;

import entidades.Empleado;
import entidades.SupervisorCentroV;
import entidades.SupervisorJuntaR;
import entidades.VigilantePartido;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class EmpleadoController {
    private final Database db;
    
    public EmpleadoController() {
        this.db = new Database();
    }
    
    public String insertarEmpleado(Empleado emp) {
        
        String datos = "'" + emp.getNombres() + "', " + 
                       "'" + emp.getApellidos() + "', " + 
                       emp.getEdad() + ", " + 
                       "'" + emp.getDUI() + "', " + 
                       "'" + emp.getDireccion() + "', " + 
                       "'" + emp.getSexo() + "', " + 
                       "'" + emp.getTelefono() + "', " + 
                       8;
                
        String sql = "INSERT INTO Empleado(nombres, apellidos, edad, DUI, direccion, sexo, telefono, tipo)" + 
                      "VALUES(" + datos + ")" ;
        
        
        try {
            this.db.insertElimModi(sql);
        } catch(SQLException ex) {
            return "Error al insertar: " + ex.toString();
        }
        
        return "Empleado insertado";
    }
    
    
    public String actualizarEmpleado(Empleado emp, int idEmp, int estado) {
        Connection con = this.db.getConnection();
        String sql = "{call actualizarEmpleado(?,?,?,?,?,?)}";
        CallableStatement sp;
        
        try {
            sp = con.prepareCall(sql);
            sp.setInt(1, idEmp);
            sp.setString(2, emp.getNombres());
            sp.setString(3, emp.getApellidos());
            sp.setString(4, emp.getDireccion());
            sp.setString(5, emp.getTelefono());
            sp.setInt(6, estado);
            sp.executeUpdate();
            sp.close();
        } catch(SQLException ex) {
            return "Error al actualizar empleado : " + ex.toString();
        }
        
        return "Empleado actualizado";
    }
    
    
    
    public String insertarVigilante(VigilantePartido vigilante) {
        Connection con = this.db.getConnection();
        String sql = "{call registrarVigilante(?,?,?,?,?,?,?,?)}";
        CallableStatement sp = null;
        
        try {
            sp = con.prepareCall(sql);
            sp.setString(1, vigilante.getNombres());
            sp.setString(2, vigilante.getApellidos());
            sp.setInt(3, vigilante.getEdad());
            sp.setString(4, vigilante.getDUI());
            sp.setString(5, vigilante.getDireccion());
            sp.setString(6, vigilante.getSexo());
            sp.setString(7, vigilante.getTelefono());
            sp.setInt(8, vigilante.getIdPartido());
            sp.executeUpdate();
            sp.close();
        } catch(SQLException ex) {
            try {
                sp.close();
            } catch (SQLException ex1) {
                Logger.getLogger(VotanteController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return "Error al insertar vigilante: " + ex.toString();
        }
        
        return "Vigilante insertado";
    }
    
    public String insertarSupervisorCentro(SupervisorCentroV sup) {
        Connection con = this.db.getConnection();
        String sql = "{call registrarSupervisorCentroV(?,?,?,?,?,?,?,?)}";
        CallableStatement sp = null;
        
        try {
            sp = con.prepareCall(sql);
            sp.setString(1, sup.getNombres());
            sp.setString(2, sup.getApellidos());
            sp.setInt(3, sup.getEdad());
            sp.setString(4, sup.getDUI());
            sp.setString(5, sup.getDireccion());
            sp.setString(6, sup.getSexo());
            sp.setString(7, sup.getTelefono());
            sp.setInt(8, sup.getIdCentro());
            sp.executeUpdate();
            sp.close();
        } catch(SQLException ex) {
            try {
                sp.close();
            } catch (SQLException ex1) {
                Logger.getLogger(VotanteController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return "Error al insertar supervisor: " + ex.toString();
        }
        
        return "Supervisor insertado";
    }
    
    public String insertarSupervisorJunta(SupervisorJuntaR sup) {
        Connection con = this.db.getConnection();
        String sql = "{call registrarSupervisorJunta(?,?,?,?,?,?,?,?)}";
        CallableStatement sp = null;
        
        try {
            sp = con.prepareCall(sql);
            sp.setString(1, sup.getNombres());
            sp.setString(2, sup.getApellidos());
            sp.setInt(3, sup.getEdad());
            sp.setString(4, sup.getDUI());
            sp.setString(5, sup.getDireccion());
            sp.setString(6, sup.getSexo());
            sp.setString(7, sup.getTelefono());
            sp.setInt(8, sup.getIdJunta());
            sp.executeUpdate();
            sp.close();
        } catch(SQLException ex) {
            try {
                sp.close();
            } catch (SQLException ex1) {
                Logger.getLogger(VotanteController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return "Error al insertar supervisor: " + ex.toString();
        }
        
        return "Supervisor insertado";
    }
    
    public String insertarUser(String nombre, String pass, int id) {
        String sql = "INSERT INTO UsuariosSistema(id_empleado, usuario, pass) " + 
                     "VALUES(" + id + ", '" + nombre + "', '" + pass + "')";
        
        try {
            this.db.insertElimModi(sql);
        } catch(SQLException ex) {
            return "Error al ingresar usuario : " + ex.toString();
        }
        
        return "Usuario agregado";
    }
    
    
    
    public DefaultTableModel getEmpleados() {
        String sql = "select * from vEmpleados";
                     
        
        DefaultTableModel tablaEmpleados;
        
        try {
            ResultSet rs = this.db.consultarDatos(sql);
            tablaEmpleados = this.db.construirModeloTabla(rs);
        } catch(SQLException ex) {
            return null;
        }
        
        
        return tablaEmpleados;
    }
    
    public DefaultTableModel getEmpleadosInfo(String dui) {
        
        String sql = dui.length() != 0 ? "SELECT * FROM vEmpleadoInfo WHERE DUI LIKE '%"+dui+"%' LIMIT 50" : "SELECT * FROM vEmpleadoInfo WHERE DUI LIKE '%%' LIMIT 50";
        DefaultTableModel tabla;
        ResultSet rs;
        
        try {
            rs = this.db.consultarDatos(sql);
            tabla = this.db.construirModeloTabla(rs);
        } catch(SQLException ex) {
            return null;
        }
        
        return tabla;
    }
    
}
