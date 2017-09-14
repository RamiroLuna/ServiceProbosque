/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.probosque.dto;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ramiro
 */
public class FichaPrincipalP1DTO implements Serializable{
    @SerializedName("formulario")
    private List<FichaPrincipalP1DTO> registro;    
    private String folio;
    private String expediente;
    private String expediente_origen;
    private String region;
    private String id_tipo_propiedad;
    private String representante_actual;
    private String representante_original;
    private String rfc;
    private String domicilio;
    private String responsable_tecnico_ejecucion_vigente;
    private String responsable_tecnico_ejecucion_original;
    private String tipo_autorizacion;
    private String dependencia_expide;
    private String codigo_semarnat;
    private String oficio_autorizacion;
    private String fecha_expedicion;
    private String fecha_vencimiento;
    private String usufructuarios;
    private String metodo_manejo;
    private String superficie_total;
    private String superficie_anp_federal;
    private String superficie_conservacion;
    private String franja_protectora;
    private String superficie_pendientes;
    private String superficie_msnm;
    private String superficie_bosque_mesofilo;
    private String superficie_produccion;
    private String superficie_restauracion;
    private String superficie_otros_usos;
    private String superficie_arbolada;
    private String nombre_apn;
    private String nivel_programa_manejo_forestal;
    private String num_intervenciones;
    private String situacion_especial_predio;
    private String fecha_situacion;  
    private String anio;
    private String modulopedio_estado;
    private String modulopredio_municipio;
    private String modulopredio_localidad;
    private String modulopredio_cup;
    private String latitud_utm;
    private String longitud_utm;
    
    public FichaPrincipalP1DTO() {
    }

    public List<FichaPrincipalP1DTO> getRegistro() {
        return registro;
    }

    public void setRegistro(List<FichaPrincipalP1DTO> registro) {
        this.registro = registro;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getExpediente_origen() {
        return expediente_origen;
    }

    public void setExpediente_origen(String expediente_origen) {
        this.expediente_origen = expediente_origen;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getId_tipo_propiedad() {
        return id_tipo_propiedad;
    }

    public void setId_tipo_propiedad(String id_tipo_propiedad) {
        this.id_tipo_propiedad = id_tipo_propiedad;
    }

    public String getRepresentante_actual() {
        return representante_actual;
    }

    public void setRepresentante_actual(String representante_actual) {
        this.representante_actual = representante_actual;
    }

    public String getRepresentante_original() {
        return representante_original;
    }

    public void setRepresentante_original(String representante_original) {
        this.representante_original = representante_original;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getResponsable_tecnico_ejecucion_vigente() {
        return responsable_tecnico_ejecucion_vigente;
    }

    public void setResponsable_tecnico_ejecucion_vigente(String responsable_tecnico_ejecucion_vigente) {
        this.responsable_tecnico_ejecucion_vigente = responsable_tecnico_ejecucion_vigente;
    }

    public String getResponsable_tecnico_ejecucion_original() {
        return responsable_tecnico_ejecucion_original;
    }

    public void setResponsable_tecnico_ejecucion_original(String responsable_tecnico_ejecucion_original) {
        this.responsable_tecnico_ejecucion_original = responsable_tecnico_ejecucion_original;
    }

    public String getTipo_autorizacion() {
        return tipo_autorizacion;
    }

    public void setTipo_autorizacion(String tipo_autorizacion) {
        this.tipo_autorizacion = tipo_autorizacion;
    }

    public String getDependencia_expide() {
        return dependencia_expide;
    }

    public void setDependencia_expide(String dependencia_expide) {
        this.dependencia_expide = dependencia_expide;
    }

    public String getCodigo_semarnat() {
        return codigo_semarnat;
    }

    public void setCodigo_semarnat(String codigo_semarnat) {
        this.codigo_semarnat = codigo_semarnat;
    }

    public String getOficio_autorizacion() {
        return oficio_autorizacion;
    }

    public void setOficio_autorizacion(String oficio_autorizacion) {
        this.oficio_autorizacion = oficio_autorizacion;
    }

    public String getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(String fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getUsufructuarios() {
        return usufructuarios;
    }

    public void setUsufructuarios(String usufructuarios) {
        this.usufructuarios = usufructuarios;
    }

    public String getMetodo_manejo() {
        return metodo_manejo;
    }

    public void setMetodo_manejo(String metodo_manejo) {
        this.metodo_manejo = metodo_manejo;
    }

    public String getSuperficie_total() {
        return superficie_total;
    }

    public void setSuperficie_total(String superficie_total) {
        this.superficie_total = superficie_total;
    }

    public String getSuperficie_anp_federal() {
        return superficie_anp_federal;
    }

    public void setSuperficie_anp_federal(String superficie_anp_federal) {
        this.superficie_anp_federal = superficie_anp_federal;
    }

    public String getSuperficie_conservacion() {
        return superficie_conservacion;
    }

    public void setSuperficie_conservacion(String superficie_conservacion) {
        this.superficie_conservacion = superficie_conservacion;
    }

    public String getFranja_protectora() {
        return franja_protectora;
    }

    public void setFranja_protectora(String franja_protectora) {
        this.franja_protectora = franja_protectora;
    }

    public String getSuperficie_pendientes() {
        return superficie_pendientes;
    }

    public void setSuperficie_pendientes(String superficie_pendientes) {
        this.superficie_pendientes = superficie_pendientes;
    }

    public String getSuperficie_msnm() {
        return superficie_msnm;
    }

    public void setSuperficie_msnm(String superficie_msnm) {
        this.superficie_msnm = superficie_msnm;
    }

    public String getSuperficie_bosque_mesofilo() {
        return superficie_bosque_mesofilo;
    }

    public void setSuperficie_bosque_mesofilo(String superficie_bosque_mesofilo) {
        this.superficie_bosque_mesofilo = superficie_bosque_mesofilo;
    }

    public String getSuperficie_produccion() {
        return superficie_produccion;
    }

    public void setSuperficie_produccion(String superficie_produccion) {
        this.superficie_produccion = superficie_produccion;
    }

    public String getSuperficie_restauracion() {
        return superficie_restauracion;
    }

    public void setSuperficie_restauracion(String superficie_restauracion) {
        this.superficie_restauracion = superficie_restauracion;
    }

    public String getSuperficie_otros_usos() {
        return superficie_otros_usos;
    }

    public void setSuperficie_otros_usos(String superficie_otros_usos) {
        this.superficie_otros_usos = superficie_otros_usos;
    }

    public String getSuperficie_arbolada() {
        return superficie_arbolada;
    }

    public void setSuperficie_arbolada(String superficie_arbolada) {
        this.superficie_arbolada = superficie_arbolada;
    }

    public String getNombre_apn() {
        return nombre_apn;
    }

    public void setNombre_apn(String nombre_apn) {
        this.nombre_apn = nombre_apn;
    }

    public String getNivel_programa_manejo_forestal() {
        return nivel_programa_manejo_forestal;
    }

    public void setNivel_programa_manejo_forestal(String nivel_programa_manejo_forestal) {
        this.nivel_programa_manejo_forestal = nivel_programa_manejo_forestal;
    }

    public String getNum_intervenciones() {
        return num_intervenciones;
    }

    public void setNum_intervenciones(String num_intervenciones) {
        this.num_intervenciones = num_intervenciones;
    }

    public String getSituacion_especial_predio() {
        return situacion_especial_predio;
    }

    public void setSituacion_especial_predio(String situacion_especial_predio) {
        this.situacion_especial_predio = situacion_especial_predio;
    }

    public String getFecha_situacion() {
        return fecha_situacion;
    }

    public void setFecha_situacion(String fecha_situacion) {
        this.fecha_situacion = fecha_situacion;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getModulopedio_estado() {
        return modulopedio_estado;
    }

    public void setModulopedio_estado(String modulopedio_estado) {
        this.modulopedio_estado = modulopedio_estado;
    }

    public String getModulopredio_municipio() {
        return modulopredio_municipio;
    }

    public void setModulopredio_municipio(String modulopredio_municipio) {
        this.modulopredio_municipio = modulopredio_municipio;
    }

    public String getModulopredio_localidad() {
        return modulopredio_localidad;
    }

    public void setModulopredio_localidad(String modulopredio_localidad) {
        this.modulopredio_localidad = modulopredio_localidad;
    }

    public String getModulopredio_cup() {
        return modulopredio_cup;
    }

    public void setModulopredio_cup(String modulopredio_cup) {
        this.modulopredio_cup = modulopredio_cup;
    }

    public String getLatitud_utm() {
        return latitud_utm;
    }

    public void setLatitud_utm(String latitud_utm) {
        this.latitud_utm = latitud_utm;
    }

    public String getLongitud_utm() {
        return longitud_utm;
    }

    public void setLongitud_utm(String longitud_utm) {
        this.longitud_utm = longitud_utm;
    }

      
}
