
package entidades;

/**
 *
 * @author Daniel
 */
public class Anomalia {
    private int id;
    private String texto;
    private int idJrv;
    private int idCentro;
    
    public Anomalia() {}

    public Anomalia(int id, String texto, int idJrv, int idCentro) {
        this.id = id;
        this.texto = texto;
        this.idJrv = idJrv;
        this.idCentro = idCentro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getIdJrv() {
        return idJrv;
    }

    public void setIdJrv(int idJrv) {
        this.idJrv = idJrv;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }
    
    
    
}
