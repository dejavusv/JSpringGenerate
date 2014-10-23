

package <%packagename%>.servlet.combo;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface AbstractAJAXServlet {
	public Map process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
