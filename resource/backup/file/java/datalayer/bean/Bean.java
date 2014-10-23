
package <%packagename%>.datalayer.bean;

import <%packagename%>.datalayer.entity.<%modelname%>;
import <%packagename%>.datalayer.query.<%modelname%>Query;
import <%packagename%>.datalayer.service.<%modelname%>Service;

/**
 *
 * @author Surachai
 */
public class <%modelname%>Bean implements <%modelname%>Service{
    private <%modelname%>Query <%titlename%>Query;

    public <%modelname%>Query get<%modelname%>Query() {
        return <%titlename%>Query;
    }

    public void set<%modelname%>Query(<%modelname%>Query <%titlename%>Query) {
        this.<%titlename%>Query = <%titlename%>Query;
    }
	
	//generate code
}
