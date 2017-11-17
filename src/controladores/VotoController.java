
package controladores;

import entidades.Voto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class VotoController {
    private final Database db;
    
    public VotoController() {
        this.db = new Database();
    }
    
    public String insertarVoto(Voto voto) {
        String sql = "INSERT INTO Voto(id_junta, id_candidato) VALUES(?,?)";
        PreparedStatement stmt;
        Connection con = this.db.getConnection();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, voto.getIdJunta());
            stmt.setInt(2, voto.getIdCandidato());
            stmt.executeUpdate();
            stmt.close();
        } catch(SQLException ex) {
            return "Error al votar: " + ex.toString();
        }
        
        return "Voto confirmado";
        
    }
    
    public String anularVotosCandidato(int candiId) {
        String sql = "UPDATE Voto SET Nulo = 1 WHERE id_candidato = " + candiId;
        
        try {
            this.db.insertElimModi(sql);
        } catch(SQLException ex) {
            return "Error al anular votos : " + ex.toString();
        }
        
        return "VOTOS DEL CANDIDATO ANULADOS";
    }
    
    public String reHabilitarVotosCandidato(int candiId) {
        String sql = "UPDATE Voto SET Nulo = 0 WHERE id_candidato = " + candiId;
        
        try {
            this.db.insertElimModi(sql);
        } catch(SQLException ex) {
            return "Error al habilitar votos : " + ex.toString();
        }
        
        return "VOTOS DEL CANDIDATO RE-HABILITADOS";
    }
    
    
    public DefaultTableModel getVotosMunicipiosById(int idMuni) {
        String sql = "SELECT Candidato, Partido, Votos FROM vVotosMunicipio WHERE idMuni = " + idMuni;
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
    
    public DefaultTableModel getVotosMunicipios() {
        String sql = "SELECT Candidato, Partido, Municipio, Votos FROM vVotosMunicipio";
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
    
    
    public DefaultTableModel getVotosDepartamentoById(int idDepa) {
        String sql = "select Candidato, Partido, count(Votos) AS Votos  "
                + "from vVotosDepartamento where idDepa = "+idDepa+ " group by Candidato, Departamento";
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
    
    public DefaultTableModel getVotosDepartamento() {
        String sql = "select Candidato, Partido, Departamento, count(Votos) AS Votos  "
                + "from vVotosDepartamento group by Candidato, Departamento";
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
    
    public DefaultTableModel getVotosPartido() {
        String sql = "select Candidato, Partido, Votos from vVotosPartido";
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
