
package controladores;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class UserVerifier {
    private final Database db;
    
    public UserVerifier() {
        this.db = new Database();
    }
     
    
    public int iniciarSesionUsuario(String nombreUsuario, String pass, int tipo) {
        String sql = "SELECT * FROM vUsers where usuario = '" + nombreUsuario + "' AND pass = '" + pass + "' AND id = " + tipo;
        ResultSet rs;
        int tipoUser = 0;
        
        try {
            rs = this.db.consultarDatos(sql);
            if(rs.next()) {
                tipoUser = rs.getInt("id");
            }
        } catch(SQLException ex) {
            return 0;
        }
        
        return tipoUser;
    }
    
    
}
