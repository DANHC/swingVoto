
package entidades;


/**
 *
 * @author Daniel
 */
public class Candidato extends Persona{
    private int idPartido;
    private int edad;

    public Candidato() {
    }

    public Candidato(int idPartido, int edad, String nombres, String apellidos, String sexo, String DUI, String direccion) {
        super(nombres, apellidos, sexo, DUI, direccion);
        this.idPartido = idPartido;
        this.edad = edad;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    
}
