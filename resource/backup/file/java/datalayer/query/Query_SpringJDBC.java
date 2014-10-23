
package <%packagename%>.datalayer.query;

import <%packagename%>.common.<%projectname%>SQL;
import <%packagename%>.datalayer.entity.<%modelname%>;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;

/**
 *
 * @author surachai
 */
public class <%modelname%>Query extends <%projectname%>SQL {

    private static final Logger log = Logger.getLogger(<%modelname%>Query.class.getName());
    //generate variable
    
    
    public <%modelname%>Query(String SQL_TAG,DataSource datasource ){
        super(SQL_TAG,datasource);
    }
    
	//generate code
   
}
