
package <%packagename%>.controller;

import <%packagename%>.master.controller.<%projectname%>Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


public class <%pagename%>Controller extends <%projectname%>Controller {

    private static final ModelAndView <%pagename%> = new ModelAndView("<%pagename%>");
    private static final ModelAndView <%pagename%>_REFRESH = new ModelAndView(new RedirectView("<%pagename%>.<%url%>", true));
    

    @Override
    protected ModelAndView process(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        return <%pagename%>;
    }

}