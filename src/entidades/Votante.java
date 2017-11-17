
package entidades;

/**
 *
 * @author Daniel
 */
public class Votante extends Persona{
     
    private String ConocidoPor; 
    private String SalvadorenoPor; 
    private String FechaNacimiento; 
    private String DepartamentoNaci; 
    private String MunicipioNaci;
	private String FechaExpedicion; 
	private String DepartamentoExpe; 
	private String MunicipioExpe; 
	private String FechaExpiracion;
	private String DepartamentoResidencia;
	private int MunicipioResidencia; 
	private String NIT; 
	private String NombreMadre; 
	private String NombrePadre; 
	private String CodigoZona; 
	private String EstadoFamiliar;
	private String ConyugeNombre; 
	private String TipoSangre; 
	private String Profesion; 
    
    public Votante() {
    }

    

    public Votante(String ConocidoPor, String SalvadorenoPor, String FechaNacimiento, String DepartamentoNaci, String MunicipioNaci, String FechaExpedicion, String DepartamentoExpe, String MunicipioExpe, String FechaExpiracion, String DepartamentoResidencia, int MunicipioResidencia, String NIT, String NombreMadre, String NombrePadre, String CodigoZona, String EstadoFamiliar, String ConyugeNombre, String TipoSangre, String Profesion, String nombres, String apellidos, String sexo, String DUI, String direccion) {
        super(nombres, apellidos, sexo, DUI, direccion);
        this.ConocidoPor = ConocidoPor;
        this.SalvadorenoPor = SalvadorenoPor;
        this.FechaNacimiento = FechaNacimiento;
        this.DepartamentoNaci = DepartamentoNaci;
        this.MunicipioNaci = MunicipioNaci;
        this.FechaExpedicion = FechaExpedicion;
        this.DepartamentoExpe = DepartamentoExpe;
        this.MunicipioExpe = MunicipioExpe;
        this.FechaExpiracion = FechaExpiracion;
        this.DepartamentoResidencia = DepartamentoResidencia;
        this.MunicipioResidencia = MunicipioResidencia;
        this.NIT = NIT;
        this.NombreMadre = NombreMadre;
        this.NombrePadre = NombrePadre;
        this.CodigoZona = CodigoZona;
        this.EstadoFamiliar = EstadoFamiliar;
        this.ConyugeNombre = ConyugeNombre;
        this.TipoSangre = TipoSangre;
        this.Profesion = Profesion;
    }

    public String getConocidoPor() {
        return ConocidoPor;
    }

    public void setConocidoPor(String ConocidoPor) {
        this.ConocidoPor = ConocidoPor;
    }

    public String getSalvadorenoPor() {
        return SalvadorenoPor;
    }

    public void setSalvadorenoPor(String SalvadorenoPor) {
        this.SalvadorenoPor = SalvadorenoPor;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDepartamentoNaci() {
        return DepartamentoNaci;
    }

    public void setDepartamentoNaci(String DepartamentoNaci) {
        this.DepartamentoNaci = DepartamentoNaci;
    }

    public String getMunicipioNaci() {
        return MunicipioNaci;
    }

    public void setMunicipioNaci(String MunicipioNaci) {
        this.MunicipioNaci = MunicipioNaci;
    }

    public String getFechaExpedicion() {
        return FechaExpedicion;
    }

    public void setFechaExpedicion(String FechaExpedicion) {
        this.FechaExpedicion = FechaExpedicion;
    }

    public String getDepartamentoExpe() {
        return DepartamentoExpe;
    }

    public void setDepartamentoExpe(String DepartamentoExpe) {
        this.DepartamentoExpe = DepartamentoExpe;
    }

    public String getMunicipioExpe() {
        return MunicipioExpe;
    }

    public void setMunicipioExpe(String MunicipioExpe) {
        this.MunicipioExpe = MunicipioExpe;
    }

    public String getFechaExpiracion() {
        return FechaExpiracion;
    }

    public void setFechaExpiracion(String FechaExpiracion) {
        this.FechaExpiracion = FechaExpiracion;
    }

    public String getDepartamentoResidencia() {
        return DepartamentoResidencia;
    }

    public void setDepartamentoResidencia(String DepartamentoResidencia) {
        this.DepartamentoResidencia = DepartamentoResidencia;
    }

    public int getMunicipioResidencia() {
        return MunicipioResidencia;
    }

    public void setMunicipioResidencia(int MunicipioResidencia) {
        this.MunicipioResidencia = MunicipioResidencia;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNombreMadre() {
        return NombreMadre;
    }

    public void setNombreMadre(String NombreMadre) {
        this.NombreMadre = NombreMadre;
    }

    public String getNombrePadre() {
        return NombrePadre;
    }

    public void setNombrePadre(String NombrePadre) {
        this.NombrePadre = NombrePadre;
    }

    public String getCodigoZona() {
        return CodigoZona;
    }

    public void setCodigoZona(String CodigoZona) {
        this.CodigoZona = CodigoZona;
    }

    public String getEstadoFamiliar() {
        return EstadoFamiliar;
    }

    public void setEstadoFamiliar(String EstadoFamiliar) {
        this.EstadoFamiliar = EstadoFamiliar;
    }

    public String getConyugeNombre() {
        return ConyugeNombre;
    }

    public void setConyugeNombre(String ConyugeNombre) {
        this.ConyugeNombre = ConyugeNombre;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }


    
    
}
