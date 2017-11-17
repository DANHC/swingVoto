
package entidades;

/**
 *
 * @author Daniel
 */
public class SupervisorCentroV extends Empleado{
    private int idCentro;
    
    public SupervisorCentroV () {}

    public SupervisorCentroV(int idCentro, int edad, String telefono, String nombres, String apellidos, String sexo, String DUI, String direccion) {
        super(edad, telefono, nombres, apellidos, sexo, DUI, direccion);
        this.idCentro = idCentro;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }
}
