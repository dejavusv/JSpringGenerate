

package <%packagename%>.controller;

import <%packagename%>.master.controller.<%projectname%>Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;
/**
 *
 * @author Surachai
 */
public class IndexController extends <%projectname%>Controller{
    private static final ModelAndView INDEX = new ModelAndView("index");
    private static final ModelAndView INDEX_REFRESH = new ModelAndView(new RedirectView("index.<%url%>", true));
    private static final Logger log = Logger.getLogger(IndexController.class.getName());

    @Override
    protected ModelAndView process(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        if (session.getAttribute("USER") == null) {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String name = auth.getName(); //get logged in username
            if (name != null && (!name.equalsIgnoreCase("anonymousUser"))) {
                session.setAttribute("USER", name);
				log.info("username :"+name);
            }
        }
        return INDEX;
    }
}
