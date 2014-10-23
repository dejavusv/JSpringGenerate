
package <%packagename%>.datalayer.bean;

import <%packagename%>.common.bean.AbstractBean;
import <%packagename%>.common.view.SelectOption;
import <%packagename%>.datalayer.ajax.service.AbstractAJAXServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Surachai
 */
public class AJAXBean extends AbstractBean implements
        AbstractAJAXServices {
    
   
    // query model
    
    
    // servlet name
    
    
    // servlet type
	

    public AJAXBean(List queryList) {
        super(queryList);
        if (queryList != null && queryList.size() > 0) {
            for (int i = 0; i < queryList.size(); i++) {
                Object obj = queryList.get(i);
				/* example setting
				if (obj instanceof ObjectQuery) {
                    objectQuery = (ObjectQuery) obj;
                }					
				*/
                

            }
        }
    }

    @Override
    public List load(Map map) {
        SelectOption selectOption = null;
        List result = new ArrayList();
        String servletName = String.valueOf(map.get("servletName"));
        String type = String.valueOf(map.get("type"));
		// add your custom ajax
		
        return result;
    }

    @Override
    public List loadMulti(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object loadSingle(Map map) {
        Object result = new Object();
        String servletName = String.valueOf(map.get("servletName"));
        String type = String.valueOf(map.get("type"));
        String data = map.get("data").toString();
        // add your custom ajax
		
        return result;
    }

}
