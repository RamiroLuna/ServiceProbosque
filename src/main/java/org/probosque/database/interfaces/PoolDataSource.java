package org.probosque.database.interfaces;

import javax.naming.NamingException;
import org.apache.commons.dbutils.QueryRunner;


public interface PoolDataSource {
    QueryRunner getDataBaseProgram(Integer program) throws NamingException;
}
