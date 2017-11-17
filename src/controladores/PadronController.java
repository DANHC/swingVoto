
package controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class PadronController {
    private Database db;
    
    public PadronController() {
        this.db = new Database();
    }
    
    public DefaultTableModel getPadronMuni(int idMuni) {
        String sql = "SELECT * FROM vPadron WHERE id = "+idMuni;
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
    
    public DefaultTableModel getPadronDui(String dui) {
        String sql = dui.length() != 0 ? 
                "SELECT * FROM vPadron WHERE DUI LIKE '%"+dui+"%' LIMIT 50" 
                : "SELECT * FROM vPadron LIMIT 50";
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
