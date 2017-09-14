/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.probosque.dao;

/**
 *
 * @author ramiro
 */
public class Calculadora extends Operaciones {
    public Integer numeros(){
        return this.suma(4, 10);
        
    }
    
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        
        System.out.println(cal.multiplicacione(4, 6));
    }
            
    @Override
    public Integer multiplicacione(Integer v1, Integer v2) {
       
        
        Integer res = v1 * v2 *100;
        
        return res;
    }
            
}
