package entidades;

/**
 *
 * @author Daniel
 */
public class Persona {
    
    private String nombres;
    private String apellidos;
    private String sexo;
    private String DUI;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String sexo, String DUI, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.DUI = DUI;
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    

  
    
}
