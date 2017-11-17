package entidades;

/**
 *
 * @author Daniel
 */
public class CentroVotacion {
    
    private String municipio;
    private int id_centro;

    public CentroVotacion() {
    }

    public CentroVotacion(String municipio, int id_centro) {
        this.municipio = municipio;
        this.id_centro = id_centro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getId_centro() {
        return id_centro;
    }

    public void setId_centro(int id_centro) {
        this.id_centro = id_centro;
    }

    @Override
    public String toString() {
        return "CentroVotacion{" + "municipio=" + municipio + ", id_centro=" + id_centro + '}';
    }
    
    
    
}
