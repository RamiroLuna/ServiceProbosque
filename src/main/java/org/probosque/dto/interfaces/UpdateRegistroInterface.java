package org.probosque.dto.interfaces;

import java.sql.SQLException;
import javax.naming.NamingException;

public interface UpdateRegistroInterface {
    Boolean updateRegistro(Integer program, Object obj)throws SQLException, NamingException;
}
