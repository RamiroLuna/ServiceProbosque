package org.probosque.controller;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;
import org.probosque.dao.MultiregistroDAO;
import org.probosque.dao.PATH;
import org.probosque.dto.MultiImagenesDTO;
import org.probosque.ejb.Archivos;
import org.probosque.model.OutputJson;
import org.probosque.model.ResponseJson;
import org.probosque.validator.SQLValidator;

/**
 *
 * @author Erick_G
 */
public class ControllerMultiregistros {

    public OutputJson insertMultiregistro(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public OutputJson updateMultiregistro(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public OutputJson deleteMultiregistro(HttpServletRequest request) {
       OutputJson output = new OutputJson();
        ResponseJson response = new ResponseJson();
        Gson gson = new Gson();
       try
          {
          String folio= request.getParameter("folio");
          String table_name= request.getParameter("table_name");
          Integer consecutivo = Integer.parseInt(request.getParameter("consecutivo"));
          MultiregistroDAO dao = new MultiregistroDAO();
          dao.deleteMultiregistro(table_name, folio, consecutivo);
          if(table_name.equals("formularios.imagenes"))
          {
            Archivos arch = new Archivos();
            String pathArchivo = arch.getPathArchive(folio, 0, consecutivo);
            arch.borrarArchivo(pathArchivo);
          }
          response.setSucessfull(true);
          response.setMessage(" REGISTRO EXITOSO ");
          }
         catch(SQLException sqlError)
               {
               SQLValidator sqlV= new SQLValidator();
               response.setMessage(sqlV.getMessageError(sqlError.getSQLState(),sqlError.getMessage()));
               response.setSucessfull(false);
               }
          catch(Exception ex )
                {
                ex.getMessage();
                
                }    output.setResponse(response);
        return  output;

       
       
    }

    public OutputJson getRepresentantes(HttpServletRequest request) {
        OutputJson output = new OutputJson();
        ResponseJson response = new ResponseJson();
       try
          {
          String folio= request.getParameter("folio");
          MultiregistroDAO dao = new MultiregistroDAO();
          output.setData(dao.getRepresentantes(folio));
          response.setSucessfull(true);
          response.setMessage(" REGISTRO EXITOSO ");
          }
          catch(SQLException sqlError)
               {
               SQLValidator sqlV= new SQLValidator();
               response.setMessage(sqlV.getMessageError(sqlError.getSQLState(),sqlError.getMessage()));
               response.setSucessfull(false);
 
               }
          catch(NullPointerException exNP )
                {
                 response.setSucessfull(true);
                 response.setMessage(" NO EXISTEN REGISTROS DE REPRESENTANTES ");     
                }
          catch(Exception ex )
                {
                 response.setSucessfull(false );
                 response.setMessage( " Error ");     
                
                }
        output.setResponse(response);
        return  output;

    }

    public OutputJson getPoligonos(HttpServletRequest request) {
        OutputJson output = new OutputJson();
        ResponseJson response = new ResponseJson();
       try
          {
          String folio= request.getParameter("folio");
          MultiregistroDAO dao = new MultiregistroDAO();
          output.setData(dao.getPoligonos(folio));
          response.setSucessfull(true);
          response.setMessage(" REGISTRO EXITOSO ");
          }
          catch(SQLException sqlError)
               {
               SQLValidator sqlV= new SQLValidator();
               response.setMessage(sqlV.getMessageError(sqlError.getSQLState(),sqlError.getMessage()));
               response.setSucessfull(false);
 
               }
          catch(NullPointerException exNP )
                {
                 response.setSucessfull(true);
                 response.setMessage(" NO EXISTEN REGISTROS DE REPRESENTANTES ");     
                }
          catch(Exception ex )
                {
                 response.setSucessfull(false );
                 response.setMessage( " Error ");     
                
                }
        output.setResponse(response);
        return  output;
 
    }

    public OutputJson getImagenes(HttpServletRequest request)
     {
        OutputJson output = new OutputJson();
        ResponseJson response = new ResponseJson();
       try
          {
          String folio= request.getParameter("folio");
          MultiregistroDAO dao = new MultiregistroDAO();
          List<MultiImagenesDTO> imagenes =  (List<MultiImagenesDTO>)dao.getImagenes(folio);
          Archivos arch = new Archivos(); 
          for(MultiImagenesDTO registro : imagenes)
               {
                  String  consecutivo =  arch.getConsecutivo( Integer.parseInt(registro.getConsecutivo()));
                  registro.setNombre_archivo(registro.getFolio()+"_url_"+consecutivo);
               }
          output.setData(imagenes);
          response.setSucessfull(true);
          response.setMessage(" REGISTRO EXITOSO ");
          }
          catch(SQLException sqlError)
               {
               SQLValidator sqlV= new SQLValidator();
               response.setMessage(sqlV.getMessageError(sqlError.getSQLState(),sqlError.getMessage()));
               response.setSucessfull(false);
               }
          catch(NullPointerException exNP )
                {
                 response.setSucessfull(true);
                 response.setMessage(" NO EXISTEN REGISTROS DE REPRESENTANTES ");     
                }
          catch(Exception ex )
                {
                 response.setSucessfull(false );
                 response.setMessage( " Error   ");     
                }
        output.setResponse(response);
        return  output;
     }

    
    /*************************** INICIO ABC PARA MULTIREGISTROS IMAGEN *****************************/
    
    public OutputJson insertMultiregistroImagen(HttpServletRequest request) throws SQLException,  Exception {

        OutputJson output = new OutputJson();
        ResponseJson response = new ResponseJson();
        MultiregistroDAO dao = new MultiregistroDAO();

        Gson gson = new Gson();

        try {
            String folio = request.getParameter("folio");
            String fecha = request.getParameter("fecha");
            String descripcion = IOUtils.toString(request.getPart("descripcion").getInputStream()
                    ,"UTF-8");
            String campoAsociado = request.getParameter("campoAsociado");
            Part file = request.getPart("file");
            
            MultiImagenesDTO dto = new MultiImagenesDTO(folio,fecha,descripcion,campoAsociado,file.getSubmittedFileName());
            
            Integer consecutivo =dao.insertMultiregistroImagen(dto);
            Archivos arch = new Archivos();
            String nombreArchivo=arch.uploadFile(file,dto.getFolio(),
                    arch.getConsecutivo(consecutivo),0,file.getSubmittedFileName());
            dto=dao.getRegImagen(folio,consecutivo);
            dto.setNombre_archivo(nombreArchivo);
            response.setSucessfull(true);
            response.setMessage("Se agrego multiregistro");
            output.setData(consecutivo);
            
        } 
        catch(SQLException sqlError)
               {
               SQLValidator sqlV= new SQLValidator();
               response.setMessage(sqlV.getMessageError(sqlError.getSQLState(),sqlError.getMessage()));
               response.setSucessfull(false);
               }
          
        catch (Exception ex) {
            response.setSucessfull(false);
            response.setMessage(ex.getMessage());
        }
        finally
        {
         output.setResponse(response);
        }
        return output;
        
    }      //////////////Controller insert y update multiregistro poligonos
    
    public OutputJson updateMultiregistroImagen(HttpServletRequest request) throws SQLException, Exception {

        OutputJson output = new OutputJson();
        ResponseJson response = new ResponseJson();
        MultiregistroDAO dao = new MultiregistroDAO();

        Gson gson = new Gson();

        try {
            String imagen = request.getParameter("imagen");
            Part file = request.getPart("file");
            MultiImagenesDTO dto = gson.fromJson(imagen.trim(), MultiImagenesDTO.class);
            Archivos arch = new Archivos();
//            arch.borrarArchivo(PATH.PATH_IMAGENES+0+"\\QR\\"+dto.getLista().get(0).getFolio()+"_url_"+arch.getConsecutivo(Integer.parseInt(dto.getLista().get(0).getConsecutivo())));
  //          arch.borrarArchivo(PATH.PATH_IMAGENES+0+"\\QR\\"+dto.getLista().get(0).getFolio()+"_url_"+arch.getConsecutivo(Integer.parseInt(dto.getLista().get(0).getConsecutivo()))+".pdf");
    //        arch.uploadFile(file,dto.getLista().get(0).getFolio(),
      //              arch.getConsecutivo(Integer.parseInt(dto.getLista().get(0).getConsecutivo())),0, dto.getLista().get(0).getUrl());
        //    output.setData(dao.updateMultiregistroImagen(dto.getLista().get(0)));
            response.setSucessfull(true);
        } catch (Exception ex) {
            response.setSucessfull(false);
            response.setMessage(ex.getMessage());
        }

        return output;
    }

    public OutputJson getAuditorias(HttpServletRequest request) {
        OutputJson output = new OutputJson();
        ResponseJson response = new ResponseJson();
        MultiregistroDAO dao = new MultiregistroDAO();

        Gson gson = new Gson();

        try {
            String folio = request.getParameter("folio");
    //        output.setData(dao.getRegImagen(folio,consecutivo));
            response.setSucessfull(true);
            response.setMessage("Registros");
                       
        } 
/*        catch(SQLException sqlError)
               {
               SQLValidator sqlV= new SQLValidator();
               response.setMessage(sqlV.getMessageError(sqlError.getSQLState(),sqlError.getMessage()));
               response.setSucessfull(false);
               }
          
  */      catch (Exception ex) {
            response.setSucessfull(false);
            response.setMessage(ex.getMessage());
        }
        finally
        {
         output.setResponse(response);
        }
        return output;
             
    }

}
