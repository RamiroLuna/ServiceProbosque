package org.probosque.database.interfaces;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;



public class DataBaseProgram implements PoolDataSource{
 DataSource[] source= new DataSource[9];
 BasicDataSource bds = new BasicDataSource();

    @Override
    public QueryRunner getDataBaseProgram(Integer program) throws NamingException{
           Context ctx= new InitialContext();             
             switch(String.valueOf(program)){
                case "0":
                     source[program] = (DataSource) ctx.lookup("jdbc/ProgramaGeneral");                   
                     break;
                case "1":                        
                       source[program] = (DataSource) ctx.lookup("jdbc/Programa1");                   
                     break;
                case "8":
                      source[program] = (DataSource) ctx.lookup("jdbc/Programa8"); 
                     break;            
            }
            QueryRunner qr = new QueryRunner(source[program]);
            return qr;            
    }
    
}
