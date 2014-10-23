

package <%packagename%>.controller;

import <%packagename%>.master.controller.<%projectname%>Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Surachai
 */
public class LogOutController extends <%projectname%>Controller{

    private static final Logger log = Logger.getLogger(LogOutController.class.getName());
    private static final ModelAndView LOGIN = new ModelAndView(new RedirectView("login.<%url%>", true));
    @Override
    protected ModelAndView process(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        log.info("User logout.");
        session.setAttribute("USER", null);
        session.invalidate();
        return LOGIN;
 
    }
    
}
