
package controladores;

import entidades.Votante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class VotanteController {
    private final Database db;
    
    public VotanteController() {
        this.db = new Database();
    }
    
    
    public String insertarVotante(Votante votante) {
        Connection con = this.db.getConnection();
        String sql = "{call insertarVotante(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement sp = null;
        
        try {
            sp = con.prepareCall(sql);
            sp.setString(1, votante.getDUI());
            sp.setString(2, votante.getNombres());
            sp.setString(3, votante.getApellidos());
            sp.setString(4, votante.getConocidoPor());
            sp.setString(5, votante.getDireccion());
            sp.setString(6, votante.getSalvadorenoPor());
            sp.setString(7, votante.getFechaNacimiento());
            sp.setString(8, votante.getDepartamentoNaci());
            sp.setString(9, votante.getMunicipioNaci());
            sp.setString(10, votante.getFechaExpedicion());
            sp.setString(11, votante.getDepartamentoExpe());
            sp.setString(12, votante.getMunicipioExpe());
            sp.setString(13, votante.getFechaExpiracion());
            sp.setString(14, votante.getDepartamentoResidencia());
            sp.setInt(15, votante.getMunicipioResidencia());
            sp.setString(16, votante.getNIT());
            sp.setString(17, votante.getNombreMadre());
            sp.setString(18, votante.getNombrePadre());
            sp.setString(19, votante.getCodigoZona());
            sp.setString(20, votante.getEstadoFamiliar());
            sp.setString(21, votante.getConyugeNombre());
            sp.setString(22, votante.getTipoSangre());
            sp.setString(23, votante.getProfesion());
            sp.setString(24, votante.getSexo());
            sp.executeUpdate();
            sp.close();
        } catch(SQLException ex) {
            try {
                sp.close();
            } catch (SQLException ex1) {
                Logger.getLogger(VotanteController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return "Error al insertar votante: " + ex.toString();
        } 
        
        return "Votante registrado";
        
    }
    
    public int verificarVotante(String dui) {
        String sql = "SELECT duiVotante, idMunicipio FROM Padron WHERE duiVotante = '"+dui+"' AND activo = 1";
        ResultSet rs;
        int centroV = 0;
        
        try {
            rs = this.db.consultarDatos(sql);
            if(rs.next()) {
                centroV = rs.getInt("idMunicipio");
            }
        } catch(SQLException ex) {
            return 0;
        }
        
        return centroV;
    }
    
    public boolean deshabilitarVotante(String dui) {
        String sql = "UPDATE Padron SET activo = 0 WHERE duiVotante = '" + dui + "'";
        
        try {
            this.db.insertElimModi(sql);
        } catch(SQLException ex) {
            return false;
        }
        
        return true;
        
    }
    
    public DefaultTableModel getVotantes(String dui) {
        
        String sql = dui.length() != 0 ? "SELECT * FROM vVotante WHERE DUI LIKE '%"+dui+"%' LIMIT 50" : "SELECT * FROM vVotante WHERE DUI LIKE '%%' LIMIT 50";
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
    
    public String actualizarVotante(Votante vot, int estado) {
        String sql = "{call actualizarVotante(?,?,?,?,?,?,?)}";
        CallableStatement sp;
        Connection con = this.db.getConnection();
        
        try {
            sp = con.prepareCall(sql);
            sp.setString(1, vot.getDUI());
            sp.setString(2, vot.getNombres());
            sp.setString(3, vot.getApellidos());
            sp.setString(4, vot.getDireccion());
            sp.setString(5, vot.getDepartamentoResidencia());
            sp.setInt(6, vot.getMunicipioResidencia());
            sp.setInt(7, estado);
            sp.executeUpdate();
            sp.close();
        } catch(SQLException ex) {
            
            return "Error al actualizar votante: " + ex.toString();
        }
        
        return "Votante actualizado";
    }
    
    
    
}
