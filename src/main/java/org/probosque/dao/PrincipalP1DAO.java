/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.probosque.dao;

import java.sql.SQLException;
import javax.naming.NamingException;
import org.probosque.dto.FichaPrincipalP1DTO;
import org.probosque.dto.interfaces.Registro;
import org.probosque.dto.interfaces.Restar;
import org.probosque.dto.interfaces.sumar;

/**
 *
 * @author ramiro
 */
public class PrincipalP1DAO extends Registro implements sumar, Restar{
    @Override
    public String insertRegistro(Integer program, Object obj) throws SQLException, NamingException {
        FichaPrincipalP1DTO dto = (FichaPrincipalP1DTO)obj;
        StringBuilder sb =  new StringBuilder();
        sb.append("SELECT result from spInsertPrograsma1(15, )")
    }

    @Override
    public Integer suma(Integer v1, Integer V2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer resta(Integer v1, Integer v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer multiplicacione(Integer v1, Integer v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
