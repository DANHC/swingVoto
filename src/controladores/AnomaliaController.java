
package controladores;

import entidades.Anomalia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class AnomaliaController {
    private final Database db;
    
    
    public AnomaliaController() {
        this.db = new Database();
    }
    
    public String insertarAnomalia(Anomalia anm) {
        Connection con = this.db.getConnection();
        String sql = "INSERT INTO Anomalia(anomalia, id_jrv, id_centro) "
                + "VALUES(?,?,?)";
        
        PreparedStatement stmt;
        
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, anm.getTexto());
            stmt.setInt(2, anm.getIdJrv());
            stmt.setInt(3, anm.getIdCentro());
            stmt.executeUpdate();
            stmt.close();
        } catch(SQLException ex) {
            return "Error al ingresar anomalia : " + ex.toString();
        }
        
        return "Anomalia registrada";
        
    }
    
    
    public DefaultTableModel getAnomalias() {
        String sql = "select * from vAnomalias";
        ResultSet rs;
        DefaultTableModel table;
        
        try {
            rs = this.db.consultarDatos(sql);
            table = this.db.construirModeloTabla(rs);
        } catch(SQLException ex) {
            return null;
        }
        
        return table;
        
    }
    
    
    
}
