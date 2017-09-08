package org.probosque.dto.interfaces;

import java.util.List;
import java.sql.SQLException;
import javax.naming.NamingException;
import org.probosque.dto.CatalogosDTO;

public interface CatalogosFormularios {
List<CatalogosDTO> getCatalogosFormularios(Integer program) throws SQLException, NamingException;    
}
