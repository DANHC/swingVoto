
package entidades;

/**
 *
 * @author Daniel
 */
public class Voto {
    
    private int idJunta;
    private int idCandidato;

    public Voto() {
    }

    public Voto(int idJunta, int idCandidato) {
        this.idJunta = idJunta;
        this.idCandidato = idCandidato;
    }

    public int getIdJunta() {
        return idJunta;
    }

    public void setIdJunta(int idJunta) {
        this.idJunta = idJunta;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    

    
}
