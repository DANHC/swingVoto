
package controladores;

import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Daniel
 */
public class Database {
    private Connection con;
    
    public Database(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/sistemaVoto", "root", "root");
        } catch(ClassNotFoundException | SQLException e) {
            
        }
        
    }
    
    public ResultSet consultarDatos(String query) throws SQLException{
        ResultSet rs;
        Statement stmt = this.con.createStatement();
        
        try {
            rs = stmt.executeQuery(query);
            return rs;
        } catch(SQLException e) {
            throw new SQLException(e.toString());
        }
       
    }
    
    
    public void insertElimModi(String query) throws SQLException{
        PreparedStatement pstmt;
        
        try {
            pstmt = this.con.prepareStatement(query);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        
    }
    
    
    public Connection getConnection() {
        if(this.con != null) {
            return this.con;
        }
        
        return null;
    }
    
    public DefaultTableModel construirModeloTabla(ResultSet rs) throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // columnas
        @SuppressWarnings("UseOfObsoleteCollectionType")
        Vector<String> columnNames = new Vector<>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // filas
        Vector<Vector<Object>> data = new Vector<>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }
    
    
}
