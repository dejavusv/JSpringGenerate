
package <%packagename%>.servlet.ajax;

import <%packagename%>.common.view.SelectOption;
import <%packagename%>.datalayer.ajax.service.AbstractAJAXServices;
import <%packagename%>.servlet.combo.AbstractAJAXServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class AJAXServlet extends HttpServlet {
    
	private AbstractAJAXServices ajaxServices;
	private AbstractAJAXServlet ajaxServlet;
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		String action 	 	= request.getParameter("action");
		String servletName 	= request.getParameter("servletName");
		String servicesName = request.getParameter("servicesName");

		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		ajaxServlet = (AbstractAJAXServlet) context.getBean(servletName);
		ajaxServices = (AbstractAJAXServices)context.getBean(servicesName);
		
		if(action != null && action.length() > 0) {
			
			if("reload".equalsIgnoreCase(action) || "select".equalsIgnoreCase(action))
			{
                            
				Map obj = ajaxServlet.process(request,response);
				List resultList = ajaxServices.load(obj);
				StringBuffer resXML = new StringBuffer();
				SelectOption selectOption = null;
				
				resXML.append("<result>");
				
				resXML.append("<action>");
				resXML.append(action);
				resXML.append("</action>");
				
				for (Iterator iter = resultList.iterator(); iter.hasNext();) {
					selectOption = (SelectOption) iter.next();
					System.out.println(selectOption.getLabel()+","+selectOption.getValue());
					resXML.append("<option>");
					resXML.append("<label>");
					resXML.append(selectOption.getLabel());
					resXML.append("</label>");
					resXML.append("<value>");
					resXML.append(selectOption.getValue());
					resXML.append("</value>");
					resXML.append("</option>");
					
				}
				resXML.append("</result>");
				response.setContentType("text/xml");
				response.setHeader("Cache-Control", "no-cache");
				response.getWriter().write(resXML.toString());
			}else if("text".equalsIgnoreCase(action)){   
                            Map obj = ajaxServlet.process(request,response);
			    Object resultList = ajaxServices.loadSingle(obj);
			    response.setContentType("text/plain");
                            response.setHeader("Cache-Control", "no-cache");  
                            response.getWriter().write(resultList.toString());
            }
		}
	}
	
        @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		execute( request, response );
	}
	
        @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		execute( request, response );
	}    
}
