
package entidades;

public class JuntaReceptora {
    
    private int id;
    private int codigo;
    
    public JuntaReceptora() {}

    public JuntaReceptora(int id, int codigo) {
        this.id = id;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return String.valueOf(this.codigo);
    }
    
    
   
}
