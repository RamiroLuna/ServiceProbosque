/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.probosque.model;

import java.io.Serializable;

/**
 *
 * @author Erick_G
 */
public  class OutputJson implements Serializable{
    
    public OutputJson() {
    }
    public OutputJson(Object response) {
        this.response = response;
    }
    
    private Object response;
    private Object data;
  

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

  
    
}
