

package <%packagename%>.controller;

import <%packagename%>.datalayer.entity.SystemUser;
import <%packagename%>.master.controller.<%projectname%>Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import java.util.Collection;
import java.util.Iterator;
/**
 *
 * @author Surachai
 */
public class LoginController extends <%projectname%>Controller{
    private static final Logger log = Logger.getLogger(LoginController.class.getName());
    private static final ModelAndView INDEX = new ModelAndView(new RedirectView("index.<%url%>", true));
    private static final ModelAndView LOG_IN = new ModelAndView("login");

    @Override
    protected ModelAndView process(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String error = request.getParameter("error");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        if (name != null && (!name.equalsIgnoreCase("anonymousUser"))) {
            session.setAttribute("USER", name);
            log.info("Login Successful with " + session.getAttribute("USER").toString());
            return INDEX;
        } else if(request.getAttribute("logout") != null && "out".equalsIgnoreCase(request.getAttribute("logout").toString())){
            log.info("user log out ");   
        }
        
        if(error != null){
            request.setAttribute("ResultLogin", "Login fail!!");
            log.info("Login fail!!");   
        }
        return LOG_IN;
    }
	
    public String getUserDetails() {
            
            Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
            Iterator<? extends GrantedAuthority> data = authorities.iterator();
            while(data.hasNext()){
                return (data.next().getAuthority());
            }
            return "empty";
    }

        
}
