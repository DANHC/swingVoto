
package entidades;

/**
 *
 * @author Daniel
 */
public class Padron {
    
    private int id;
    private Votante votante;
    private Municipio municipio;
    private CentroVotacion muni;
    private int activo;

    public Padron() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Votante getVotante() {
        return votante;
    }

    public void setVotante(Votante votante) {
        this.votante = votante;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public CentroVotacion getMuni() {
        return muni;
    }

    public void setMuni(CentroVotacion muni) {
        this.muni = muni;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Padron{" + "id=" + id + ", votante=" + votante + ", municipio=" + municipio + ", muni=" + muni + ", activo=" + activo + '}';
    }
    
    
}
