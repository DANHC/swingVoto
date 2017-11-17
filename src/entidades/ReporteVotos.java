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
public class ReporteVotos {
    
private String report;

    public ReporteVotos() {
    }

    public ReporteVotos(String report) {
        this.report = report;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "ReporteVotos{" + "report=" + report + '}';
    }



}


