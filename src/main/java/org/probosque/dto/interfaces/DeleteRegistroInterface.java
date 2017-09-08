package org.probosque.dto.interfaces;

import java.sql.SQLException;
import javax.naming.NamingException;

public interface DeleteRegistroInterface {
    Boolean deleteRegistro(Integer program, String Folio) throws SQLException, NamingException;
}
