
package entidades;

/**
 *
 * @author Daniel
 */
public class SupervisorJuntaR extends Empleado {
    private int idJunta;
    
    public SupervisorJuntaR () {}

    public SupervisorJuntaR(int idJunta, int edad, String telefono, String nombres, String apellidos, String sexo, String DUI, String direccion) {
        super(edad, telefono, nombres, apellidos, sexo, DUI, direccion);
        this.idJunta = idJunta;
    }

    public int getIdJunta() {
        return idJunta;
    }

    public void setIdJunta(int idJunta) {
        this.idJunta = idJunta;
    }
    
    
    
}
