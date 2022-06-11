
package modelo;
//Aqui solo creo todo lo que tenga que ver con encapsulamiento
//paso 1 tengo que crear las mismas variables que cree en la bd

import java.util.Date;
//variables
public class PaisVO {
    private int idPais;
    private String capitalPais;
    private String nombrePais;    
    private long poblacionPais;
    private String fechaIngPais;
    private String fechaActPais;

    public int getIdPais() {
        return idPais;
    }
 
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getCapitalPais() {
        return capitalPais;
    }

    public void setCapitalPais(String capitalPais) {
        this.capitalPais = capitalPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public long getPoblacionPais() {
        return poblacionPais;
    }

    public void setPoblacionPais(long poblacionPais) {
        this.poblacionPais = poblacionPais;
    }

    public String getFechaIngPais() {
        return fechaIngPais;
    }

    public void setFechaIngPais(String fechaIngPais) {
        this.fechaIngPais = fechaIngPais;
    }

    public String getFechaActPais() {
        return fechaActPais;
    }

    public void setFechaActPais(String fechaActPais) {
        this.fechaActPais = fechaActPais;
    }
    
    
}
