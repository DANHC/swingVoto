
package controladores;

import entidades.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class CandidatoController {
    private final Database db;
    
    public CandidatoController() {
        this.db = new Database();
    }
    
    public String insertarCandidato(Candidato candi) {
        Connection con = this.db.getConnection();
        PreparedStatement stmt;
        String sql = "INSERT INTO Candidato(id_partido, DUI, nombres, apellidos, edad, sexo) "
                    + "VALUES(?,?,?,?,?,?)";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, candi.getIdPartido());
            stmt.setString(2, candi.getDUI());
            stmt.setString(3, candi.getNombres());
            stmt.setString(4, candi.getApellidos());
            stmt.setInt(5, candi.getEdad());
            stmt.setString(6, candi.getSexo());
            stmt.executeUpdate();
            stmt.close();
        } catch(SQLException ex) {
            return "Error al isertar candidato: " + ex.toString();
        }
        
        return "Candidato insertado";
        
    }
    
    public String desHabilitarCandidato(int idCandi) {
        String sql = "UPDATE Candidato SET activo = 0 WHERE id = " + idCandi;
        
        try {
            this.db.insertElimModi(sql);
        } catch(SQLException ex) {
            return "Error al deshabilitar al candidato : " + ex.toString();
        }
        
        return "CANDIDATO DESHABILITADO \nLOS VOTOS DEL CANDIDATO SERÁN ANULADOS";
    }
    
    public String habilitarCandidato(int idCandi) {
        String sql = "UPDATE Candidato SET activo = 1 WHERE id = " + idCandi;
        
        try {
            this.db.insertElimModi(sql);
        } catch(SQLException ex) {
            return "Error al deshabilitar al candidato : " + ex.toString();
        }
        
        return "CANDIDATO HABILITADO \nLOS VOTOS DEL CANDIDATO SERÁN RE-HABILITADOS";
    }
    
    
    public DefaultTableModel getCandidatos() {
        ResultSet rs;
        DefaultTableModel table;
        String sql = "SELECT * FROM vCandidatos";
        
        try {
            rs = this.db.consultarDatos(sql);
            table = this.db.construirModeloTabla(rs);
        } catch(SQLException ex) {
            return null;
        }
        
        return table;
    }
    
    
    public DefaultTableModel getCandidatosGes() {
        ResultSet rs;
        DefaultTableModel table;
        String sql = "select * from vCandidatoGes";
        
        try {
            rs = this.db.consultarDatos(sql);
            table = this.db.construirModeloTabla(rs);
        } catch(SQLException ex) {
            return null;
        }
        
        return table;
    }
    
    
    
    public int verificarCandidato(int idPartido) {
        String sql = "SELECT * FROM Candidato WHERE id_partido = " + idPartido + " AND activo = 1 " ;
        ResultSet rs;
        int resp = 1;
        
        /*
            1 = si puede entrar
            0 = no puede
        */
        
        try {
            rs = this.db.consultarDatos(sql);
            if(rs.next()) {
                resp = 0;
            }
        } catch(SQLException ex) {
            return -1;
        }
        
        return resp;
        
    }
   
    
    
    
}
