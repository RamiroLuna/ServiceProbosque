/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.probosque.validator;

import org.probosque.dto.FormularioPrincipalDTO;

/**
 *
 * @author Mike M
 */
public class FormularioPrincipalValidator {
    
    public FormularioPrincipalDTO getFormularioPrincipalDTO(FormularioPrincipalDTO campos)
       {
       if(campos.getTipoTenenciaTierra().isEmpty() || campos.getTipoTenenciaTierra().equals("-1")) 
          {
          campos.setTipoTenenciaTierra("0");
          }
           
       if(campos.getSedemex().isEmpty())
           {
           campos.setSedemex("0");
           }
       if(campos.getDescripcionComoLlegarPredio().isEmpty())
          {
          campos.setDescripcionComoLlegarPredio("");
          }
       if(campos.getLatitud().isEmpty())
          {
          campos.setLatitud("0");
          }
       if(campos.getLongitud().isEmpty())
          {
          campos.setLongitud("0");
          }       
       if(campos.getSuperficieTotal().isEmpty())
          {
          campos.setSuperficieTotal("0");
          }
       if(campos.getSuperficieOtrosUsos().isEmpty())
          {
          campos.setSuperficieOtrosUsos("0");
          }
       if(campos.getSuperficieCartografica().isEmpty())
          {
          campos.setSuperficieCartografica("0");
          }
       if(campos.getSuperficieArbolada().isEmpty())
          {
          campos.setSuperficieArbolada("0");
          }
       if(campos.getCuencaEspecifica().isEmpty() || campos.getCuencaEspecifica().equals("-1") )
           {
           campos.setCuencaEspecifica("");
           }
       if(campos.getAreaNaturalProtegida().isEmpty() || campos.getAreaNaturalProtegida().equals("-1") )
           {
           campos.setAreaNaturalProtegida("");
           }
       if(campos.getObservacionesPredio().isEmpty())
           {
           campos.setObservacionesPredio("");
           }
       if(campos.getRegistroForestalNacional().isEmpty())
          {
          campos.setRegistroForestalNacional("");
          }
       if(campos.getEstatusPredio().isEmpty() || campos.getEstatusPredio().equals("-1"))
         {
         campos.setTipoTenenciaTierra("0");
         }
       return campos;
       }
    
}
