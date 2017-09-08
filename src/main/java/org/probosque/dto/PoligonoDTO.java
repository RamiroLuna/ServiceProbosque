package org.probosque.dto;

import java.io.Serializable;

public class PoligonoDTO implements Serializable {
    private Integer consecutivo; 
    private String folio;
    private String accion_agraria;
    private String fecha_publicacion_dof;
    private String fecha_resolucion_presidencial; 
    private String fecha_asamblea_procede;
    private String documento_ampara_propiedad;
    private String numero_documento_ampara_propiedad; 
    private Integer  latitud; 
    private Integer longitud;
    private Double superficie_poligono; 
    private Double superficie_cartografica; 
    private Double superficie_arbolada;
    private Double superficie_otros_usos;
    private String descripcion_clima;
    private Integer id_tipo_clima; 
    private String  descripcion_vegetacion; 
    private Integer id_tipo_vegetacion;
    private String tipo_fisiografia;
    private String corrientes_intermitentes;
    private String corrientes_permanentes; 
    private String  manantiales_ojos_agua; 
    private String manantiales_ojos_agua_abastecen;
    private String erosion; 
    private Integer id_especies_arboreas; 
    private String descripcion_especies; 
    private String distribucion_estrato_arbustivo;
    private String distribucion_renuevo; 
    private String cobertura_promedio_arbolado; 
    private String fauna;
    private String observaciones_poligono;
    private String figura_polygono;

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getAccion_agraria() {
        return accion_agraria;
    }

    public void setAccion_agraria(String accion_agraria) {
        this.accion_agraria = accion_agraria;
    }

    public String getFecha_publicacion_dof() {
        return fecha_publicacion_dof;
    }

    public void setFecha_publicacion_dof(String fecha_publicacion_dof) {
        this.fecha_publicacion_dof = fecha_publicacion_dof;
    }

    public String getFecha_resolucion_presidencial() {
        return fecha_resolucion_presidencial;
    }

    public void setFecha_resolucion_presidencial(String fecha_resolucion_presidencial) {
        this.fecha_resolucion_presidencial = fecha_resolucion_presidencial;
    }

    public String getFecha_asamblea_procede() {
        return fecha_asamblea_procede;
    }

    public void setFecha_asamblea_procede(String fecha_asamblea_procede) {
        this.fecha_asamblea_procede = fecha_asamblea_procede;
    }

    public String getDocumento_ampara_propiedad() {
        return documento_ampara_propiedad;
    }

    public void setDocumento_ampara_propiedad(String documento_ampara_propiedad) {
        this.documento_ampara_propiedad = documento_ampara_propiedad;
    }

    public String getNumero_documento_ampara_propiedad() {
        return numero_documento_ampara_propiedad;
    }

    public void setNumero_documento_ampara_propiedad(String numero_documento_ampara_propiedad) {
        this.numero_documento_ampara_propiedad = numero_documento_ampara_propiedad;
    }

    public Integer getLatitud() {
        return latitud;
    }

    public void setLatitud(Integer latitud) {
        this.latitud = latitud;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Double getSuperficie_poligono() {
        return superficie_poligono;
    }

    public void setSuperficie_poligono(Double superficie_poligono) {
        this.superficie_poligono = superficie_poligono;
    }

    public Double getSuperficie_cartografica() {
        return superficie_cartografica;
    }

    public void setSuperficie_cartografica(Double superficie_cartografica) {
        this.superficie_cartografica = superficie_cartografica;
    }

    public Double getSuperficie_arbolada() {
        return superficie_arbolada;
    }

    public void setSuperficie_arbolada(Double superficie_arbolada) {
        this.superficie_arbolada = superficie_arbolada;
    }

    public Double getSuperficie_otros_usos() {
        return superficie_otros_usos;
    }

    public void setSuperficie_otros_usos(Double superficie_otros_usos) {
        this.superficie_otros_usos = superficie_otros_usos;
    }

    public String getDescripcion_clima() {
        return descripcion_clima;
    }

    public void setDescripcion_clima(String descripcion_clima) {
        this.descripcion_clima = descripcion_clima;
    }

    public Integer getId_tipo_clima() {
        return id_tipo_clima;
    }

    public void setId_tipo_clima(Integer id_tipo_clima) {
        this.id_tipo_clima = id_tipo_clima;
    }

    public String getDescripcion_vegetacion() {
        return descripcion_vegetacion;
    }

    public void setDescripcion_vegetacion(String descripcion_vegetacion) {
        this.descripcion_vegetacion = descripcion_vegetacion;
    }

    public Integer getId_tipo_vegetacion() {
        return id_tipo_vegetacion;
    }

    public void setId_tipo_vegetacion(Integer id_tipo_vegetacion) {
        this.id_tipo_vegetacion = id_tipo_vegetacion;
    }

    public String getTipo_fisiografia() {
        return tipo_fisiografia;
    }

    public void setTipo_fisiografia(String tipo_fisiografia) {
        this.tipo_fisiografia = tipo_fisiografia;
    }

    public String getCorrientes_intermitentes() {
        return corrientes_intermitentes;
    }

    public void setCorrientes_intermitentes(String corrientes_intermitentes) {
        this.corrientes_intermitentes = corrientes_intermitentes;
    }

    public String getCorrientes_permanentes() {
        return corrientes_permanentes;
    }

    public void setCorrientes_permanentes(String corrientes_permanentes) {
        this.corrientes_permanentes = corrientes_permanentes;
    }

    public String getManantiales_ojos_agua() {
        return manantiales_ojos_agua;
    }

    public void setManantiales_ojos_agua(String manantiales_ojos_agua) {
        this.manantiales_ojos_agua = manantiales_ojos_agua;
    }

    public String getManantiales_ojos_agua_abastecen() {
        return manantiales_ojos_agua_abastecen;
    }

    public void setManantiales_ojos_agua_abastecen(String manantiales_ojos_agua_abastecen) {
        this.manantiales_ojos_agua_abastecen = manantiales_ojos_agua_abastecen;
    }

    public String getErosion() {
        return erosion;
    }

    public void setErosion(String erosion) {
        this.erosion = erosion;
    }

    public Integer getId_especies_arboreas() {
        return id_especies_arboreas;
    }

    public void setId_especies_arboreas(Integer id_especies_arboreas) {
        this.id_especies_arboreas = id_especies_arboreas;
    }

    public String getDescripcion_especies() {
        return descripcion_especies;
    }

    public void setDescripcion_especies(String descripcion_especies) {
        this.descripcion_especies = descripcion_especies;
    }

    public String getDistribucion_estrato_arbustivo() {
        return distribucion_estrato_arbustivo;
    }

    public void setDistribucion_estrato_arbustivo(String distribucion_estrato_arbustivo) {
        this.distribucion_estrato_arbustivo = distribucion_estrato_arbustivo;
    }

    public String getDistribucion_renuevo() {
        return distribucion_renuevo;
    }

    public void setDistribucion_renuevo(String distribucion_renuevo) {
        this.distribucion_renuevo = distribucion_renuevo;
    }

    public String getCobertura_promedio_arbolado() {
        return cobertura_promedio_arbolado;
    }

    public void setCobertura_promedio_arbolado(String cobertura_promedio_arbolado) {
        this.cobertura_promedio_arbolado = cobertura_promedio_arbolado;
    }

    public String getFauna() {
        return fauna;
    }

    public void setFauna(String fauna) {
        this.fauna = fauna;
    }

    public String getObservaciones_poligono() {
        return observaciones_poligono;
    }

    public void setObservaciones_poligono(String observaciones_poligono) {
        this.observaciones_poligono = observaciones_poligono;
    }

    public String getFigura_polygono() {
        return figura_polygono;
    }

    public void setFigura_polygono(String figura_polygono) {
        this.figura_polygono = figura_polygono;
    }
}
