/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.probosque.dao;

import org.probosque.dto.interfaces.Restar;
import org.probosque.dto.interfaces.sumar;

/**
 *
 * @author ramiro
 */
public abstract class Operaciones implements sumar, Restar{

    @Override
    public Integer suma(Integer v1, Integer V2) {
     
        
        Integer res = v1 + V2;
        
        return res;
    }

    @Override
    public Integer resta(Integer v1, Integer v2) {
        v1 = 3;
        v2 = 5;
        
        Integer res = v1 - v2;
        
        return res;
    }

    @Override
    public Integer multiplicacione(Integer v1, Integer v2) {
        v1 = 5;
        v2 = 5;
        
        Integer res = v1 * v2;
        
        return res;
    }
    
    
}
