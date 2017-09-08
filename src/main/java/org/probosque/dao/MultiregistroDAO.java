/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.probosque.dao;

import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.probosque.dto.AuditoriaDTO;
import org.probosque.dto.MultiImagenesDTO;
import org.probosque.dto.PoligonoDTO;
import org.probosque.dto.RepresentanteDTO;
import org.probosque.dto.ResultBoolean;
import org.probosque.dto.ResultInteger;
import org.probosque.dto.ResultString;

/**
 *
 * @author Erick_G
 */
public class MultiregistroDAO {


public void deleteMultiregistro(String tableName, String folio, Integer consecutivo)
        throws SQLException{
        DataSource ds = PoolDataSource.getDataSourceGeneral();
        QueryRunner qr = new QueryRunner(ds);
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT  formularios.SP_Delete_Multiregistro(?,?,?)");
        Object[] params = {tableName,folio,consecutivo};
        ResultSetHandler rsh = new BeanHandler(ResultBoolean.class);
        ResultBoolean result = (ResultBoolean) qr.query(sql.toString(), rsh,params);
       
}

public List<ResultInteger> getConsecutivosImagenes(String folio) throws SQLException
  {
        DataSource ds = PoolDataSource.getDataSourceGeneral();
        QueryRunner qr = new QueryRunner(ds);
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT consecutivo as result FROM formularios.imagen ");
        sql.append(" WHERE folio=? order by consecutivo asc ");
        Object[] params = {folio};
        ResultSetHandler rsh = new BeanListHandler(ResultInteger.class);
        List<ResultInteger> consecutivos = (List<ResultInteger>) qr.query(sql.toString(),rsh, params);
        return consecutivos;
  }

    public List<RepresentanteDTO>  getRepresentantes(String folio) throws SQLException {
        DataSource ds = PoolDataSource.getDataSourceGeneral();
        QueryRunner qr = new QueryRunner(ds);
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT * FROM formularios.SP_GetRepresentantes(?) ");
        sql.append("  order by consecutivo asc ");
        Object[] params = {folio};
        ResultSetHandler rsh = new BeanListHandler(RepresentanteDTO.class);
        List<RepresentanteDTO> rep = (List<RepresentanteDTO>) qr.query(sql.toString(),rsh, params);
        return rep;
        
    }

    public List<PoligonoDTO> getPoligonos(String folio) throws SQLException {
        DataSource ds = PoolDataSource.getDataSourceGeneral();
        QueryRunner qr = new QueryRunner(ds);
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT * from formularios.SP_getPoligonos(?) ");
        sql.append("  order by consecutivo asc ");
        Object[] params = {folio};
        ResultSetHandler rsh = new BeanListHandler(PoligonoDTO.class);
        List<PoligonoDTO> poligonos = (List<PoligonoDTO>) qr.query(sql.toString(),rsh, params);
        return poligonos;
    }

    public List<MultiImagenesDTO> getImagenes(String folio) throws SQLException {
        DataSource ds = PoolDataSource.getDataSourceGeneral();
        QueryRunner qr = new QueryRunner(ds);
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT * from formularios.SP_getImagenes(?) ");
        sql.append("  order by consecutivo asc ");
        Object[] params = {folio};
        ResultSetHandler rsh = new BeanListHandler(MultiImagenesDTO.class);
        List<MultiImagenesDTO> imagenes = (List<MultiImagenesDTO>) qr.query(sql.toString(),rsh, params);
        return imagenes;
    }
    
    public Integer insertMultiregistroImagen(MultiImagenesDTO ima) throws SQLException {

        DataSource ds = PoolDataSource.getDataSourceGeneral();
        QueryRunner qr = new QueryRunner(ds);

        String insert = "SELECT formulariosImagen_Insert AS result FROM formularios.formulariosImagen_Insert('"
                + ima.getFolio()+"', '"+ima.getUrl()+"', '"+ima.getFecha()+"', '"+ima.getDescripcion()+"', '"+ima.getId_campoasociado()+"')";
                        
        ResultSetHandler rsh = new BeanHandler(ResultInteger.class);
        ResultInteger result = (ResultInteger) qr.query(insert, rsh);
        return result.getResult();
    }  
    public MultiImagenesDTO getRegImagen(String folio, Integer consecutivo)
            throws SQLException {
        DataSource ds = PoolDataSource.getDataSourceGeneral();
        QueryRunner qr = new QueryRunner(ds);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT F_IMG.consecutivo consecutivo ,").
             append(" P.folio folio, F_IMG.url url,CAST(TO_CHAR(F_IMG.fecha, 'DD-MM-YYYY') AS VARCHAR(15)) fecha,").
                append(" F_IMG.descripcion descripcion, F_IMG.campoasociado id_campoasociado,").
                append(" CAST(CAT_IMG.DESCRIPCION AS VARCHAR) descripcion_campo\n").
                append(" FROM FORMULARIOS.PRINCIPAL P \n").
                append(" INNER JOIN FORMULARIOS.IMAGEN F_IMG ON F_IMG.FOLIO = P.FOLIO        \n" ).
                append(" INNER JOIN catalogos.campos  CAT_IMG ON F_IMG.CAMPOASOCIADO = CAT_IMG.ID\n").
                append(" WHERE P.FOLIO = ? and consecutivo = ? ");
 
        Object[] params = {folio, consecutivo};
        ResultSetHandler rsh = new BeanHandler(MultiImagenesDTO.class);
        MultiImagenesDTO result = (MultiImagenesDTO) qr.query(sql.toString(), rsh,params);
        return result;
    }
    
    
    public String updateMultiregistroImagen(MultiImagenesDTO ima) throws SQLException {

           DataSource ds = PoolDataSource.getDataSourceGeneral();
           QueryRunner qr = new QueryRunner(ds);

           String insert = "SELECT formulariosImagen_Update AS result FROM formularios.formulariosImagen_Insert('"
                   +ima.getConsecutivo()+"', '"+ima.getFolio()+"', '"+ima.getUrl()+"', '"+ima.getFecha()+"', '"+ima.getDescripcion()+"'"
                   + ", '"+ima.getId_campoasociado()+"')";
     

           ResultSetHandler rsh = new BeanHandler(ResultString.class);
          ResultString result = (ResultString) qr.query(insert, rsh);
           return result.getResult();
       }

    public Object getAudotoriasPredio(String folio) throws SQLException {
    DataSource ds = PoolDataSource.getDataSourceGeneral();
        QueryRunner qr = new QueryRunner(ds);
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT * from formularios.SP_getAuditorias(?) ");
        Object[] params = {folio};
        ResultSetHandler rsh = new BeanListHandler(AuditoriaDTO.class);
        List<AuditoriaDTO> auditorias = (List<AuditoriaDTO>) qr.query(sql.toString(),rsh, params);
        return auditorias;
    }
      
}
