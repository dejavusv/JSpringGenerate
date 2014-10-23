

package <%packagename%>.servlet.ajax;

import <%packagename%>.servlet.combo.AbstractAJAXServlet;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Surachai
 */
public class <%pagename%>Servlet implements AbstractAJAXServlet {

	public Map process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data   = request.getParameter("data");
		String servletName = request.getParameter("servletName");
        String Type = request.getParameter("type");
		Map result = new HashMap();
		result.put("data",data);
		result.put("servletName",servletName);
                result.put("type",Type);
		return result;
	}
}
    

