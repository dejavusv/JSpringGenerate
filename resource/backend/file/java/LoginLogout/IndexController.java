

package <%packagename%>.controller;

import <%packagename%>.master.controller.<%projectname%>Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Surachai
 */
public class IndexController extends <%projectname%>Controller{
    private static final ModelAndView INDEX = new ModelAndView("index");
    private static final ModelAndView INDEX_REFRESH = new ModelAndView(new RedirectView("index.<%url%>", true));
    

    @Override
    protected ModelAndView process(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        if (session.getAttribute("USER") == null) {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String name = auth.getName(); //get logged in username
            if (name != null && (!name.equalsIgnoreCase("anonymousUser"))) {
                session.setAttribute("USER", name);
				log,info("username :"+name);
            }
        }
        return INDEX;
    }
}
