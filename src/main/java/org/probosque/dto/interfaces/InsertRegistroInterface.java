package org.probosque.dto.interfaces;

import java.sql.SQLException;
import javax.naming.NamingException;

public interface InsertRegistroInterface {

    String insertRegistro(Integer program, Object ogj)throws SQLException, NamingException;
    
}
