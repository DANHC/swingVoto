/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Departamento;
import entidades.JuntaReceptora;
import entidades.Municipio;
import entidades.Partido;
import entidades.TipoEmpleado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author Daniel
 */
public class CombosController {
    private final  Database db;
    
    public CombosController() {
        this.db = new Database();
    }
    
    public ArrayList<Departamento> getDepartamentos() {
        ResultSet rs;
        ArrayList<Departamento> departamentos = new ArrayList<>();
        
        try {
            rs = this.db.consultarDatos("SELECT * FROM Departamento");
            while(rs.next()) {
                Departamento dep = new Departamento();
                dep.setId( rs.getInt("id") );
                dep.setNombre( rs.getString("nombre") );
                departamentos.add(dep);
            }
            
            return departamentos;
        } catch(SQLException ex) {
            return null;
        }
    }
    
    public ArrayList<Municipio> getMunicipios(int id) {
        ResultSet rs;
        ArrayList<Municipio> municipios = new ArrayList<>();
        
        try {
            rs = this.db.consultarDatos("SELECT id, nombre FROM Municipio WHERE id_departamento = " + id);
            while(rs.next()) {
                Municipio muni = new Municipio();
                muni.setId( rs.getInt("id") );
                muni.setNombre( rs.getString("nombre") );
                municipios.add(muni);
            }
            
            return municipios;
        } catch(SQLException ex) {
            return null;
        }
    }
    
    public ArrayList<TipoEmpleado> getTiposEmpleados() {
        ResultSet rs;
        ArrayList<TipoEmpleado> tiposEmpleados = new ArrayList<>();
        
        try {
            rs = this.db.consultarDatos("select id, nombreTipo from TipoEmpleado");
            while(rs.next()) {
                TipoEmpleado tipo = new TipoEmpleado();
                tipo.setId( rs.getInt("id") );
                tipo.setNombre( rs.getString("nombreTipo") );
                tiposEmpleados.add(tipo);
            }
            
        } catch(SQLException ex) {
            return null;
        }
        
        return tiposEmpleados;
    }
    
    public ArrayList<Partido> getPartidos() {
        ResultSet rs;
        ArrayList<Partido> partidos  = new ArrayList<>();
        
        try {
            rs = this.db.consultarDatos("SELECT id, nombre FROM Partido");
            while(rs.next()) {
                Partido partido = new Partido();
                partido.setNombre( rs.getString("nombre") );
                partido.setId( rs.getInt("id") );
                partidos.add(partido);
            }
        } catch(SQLException ex) {
            return null;
        }
        
        return partidos;
    }
    
    public ArrayList<JuntaReceptora> getJuntas(int idCentro) {
        ResultSet rs;
        ArrayList<JuntaReceptora> juntas = new ArrayList<>();
        
        try {
            rs = this.db.consultarDatos("SELECT id, codigo FROM juntaReceptora WHERE id_centroVotacion = " + idCentro);
            while(rs.next()) {
                JuntaReceptora junta = new JuntaReceptora();
                junta.setId(rs.getInt("id") );
                junta.setCodigo( rs.getInt("codigo") );
                juntas.add(junta);
            }
        } catch(SQLException ex) {
            return null;
        }
        
        return juntas;
    }
    
    
}
