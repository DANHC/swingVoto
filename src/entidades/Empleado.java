/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Daniel
 */
public class Empleado extends Persona{
    private int edad;
    private String telefono;
    
    public Empleado () {}

    public Empleado(int edad, String telefono, String nombres, String apellidos, String sexo, String DUI, String direccion) {
        super(nombres, apellidos, sexo, DUI, direccion);
        this.edad = edad;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
