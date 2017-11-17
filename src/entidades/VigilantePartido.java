
package entidades;

/**
 *
 * @author Daniel
 */
public class VigilantePartido extends Empleado{
    int idPartido;
    
    public VigilantePartido() {}

    public VigilantePartido(int idPartido, int edad, String telefono, String nombres, String apellidos, String sexo, String DUI, String direccion) {
        super(edad, telefono, nombres, apellidos, sexo, DUI, direccion);
        this.idPartido = idPartido;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }
    
    
}
