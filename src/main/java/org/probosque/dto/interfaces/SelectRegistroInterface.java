package org.probosque.dto.interfaces;

import java.sql.SQLException;
import javax.naming.NamingException;

public interface SelectRegistroInterface {

Object selectRegistro(Integer program,String folio)
        throws SQLException, NamingException;    
}
