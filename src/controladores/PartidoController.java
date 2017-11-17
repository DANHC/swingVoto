
package controladores;

import entidades.Partido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class PartidoController {
    private final Database db;
    
    public PartidoController() {
        this.db = new Database();
    }
    
    public String insertarPartido(Partido partido) {
        String sql = "INSERT INTO Partido(nombre) VALUES(?)";
        PreparedStatement stmt;
        Connection con = this.db.getConnection();
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, partido.getNombre());
            stmt.executeUpdate();
            stmt.close();
        } catch(SQLException ex) {
            return "Error al ingresar partido: " + ex.toString();
        }
        
        return "Partido ingresado";
    }
    
    public DefaultTableModel getPartidos() {
        String sql = "select * from vPartidos";
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
