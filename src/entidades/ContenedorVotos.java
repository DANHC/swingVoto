/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ContenedorVotos {
    
    private int cantidadVotos;
    private String partido;
    private String candidato;
    private ArrayList<ReporteVotos> reports = new ArrayList<>();
    
    //Array
    
    public void AgregarReportes(ReporteVotos reportevotos)
    {
     this.reports.add(reportevotos);
    }

    public ContenedorVotos() {
    }

    public ContenedorVotos(int cantidadVotos, String partido, String candidato) {
        this.cantidadVotos = cantidadVotos;
        this.partido = partido;
        this.candidato = candidato;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public ArrayList<ReporteVotos> getReports() {
        return reports;
    }

    public void setReports(ArrayList<ReporteVotos> reports) {
        this.reports = reports;
    }

    @Override
    public String toString() {
        return "ContenedorVotos{" + "cantidadVotos=" + cantidadVotos + ", partido=" + partido + ", candidato=" + candidato + ", reports=" + reports + '}';
    }
    
    
    
    
}
