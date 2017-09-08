package org.probosque.dto;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class MultiImagenesDTO  implements Serializable {

    public MultiImagenesDTO() {
    }
    
  private String consecutivo;
  private String  folio;
  private String  url;
  private String  fecha;
  private String  descripcion;
  private String id_campoasociado;
  private String descripcion_campo;
  private String nombre_archivo;

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_campoasociado() {
        return id_campoasociado;
    }

    public void setId_campoasociado(String id_campoasociado) {
        this.id_campoasociado = id_campoasociado;
    }

    public String getDescripcion_campo() {
        return descripcion_campo;
    }

    public void setDescripcion_campo(String descripcion_campo) {
        this.descripcion_campo = descripcion_campo;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

public MultiImagenesDTO(String folio, String fecha, String descripcion, String id_campoasociado, String url) {
        this.folio = folio;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.id_campoasociado = id_campoasociado;
        this.url = url;
    }

    
    
}
