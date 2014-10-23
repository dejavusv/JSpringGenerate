

package <%packagename%>.controller;

import <%packagename%>.datalayer.entity.SystemUser;
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
public class LoginController extends <%projectname%>Controller{
    private static final Logger log = Logger.getLogger(LoginController.class.getName());
    private static final ModelAndView INDEX = new ModelAndView(new RedirectView("index.<%url%>", true));
    private static final ModelAndView LOG_IN = new ModelAndView("login");

	@Override
    protected ModelAndView process(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String action = request.getParameter("action");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (action != null) {
            if (action.equalsIgnoreCase("login")) {
				SystemUser user = new SystemUser();
                user.setUserId(username);
                user.setPwd(password);
                String User = null;
                if((user.getUserId() != null) && (user.getUserId().equalsIgnoreCase("<%authenuser%>"))){
                    if((user.getPwd()!= null) && (user.getPwd().equalsIgnoreCase("<%authenpass%>"))){
                        User = "<%authenuser%>";
                    }
                }

                session.setAttribute("USER", User);
                if (session.getAttribute("USER") != null) {
                    log.info("Login Successful with "+session.getAttribute("USER").toString());
                    return INDEX;
                }else{
                    request.setAttribute("ResultLogin", "Login fail!!");
                    log.info("Login fail!!");
                    return LOG_IN;
                }
            }
        }
        if(session.getAttribute("USER")!=null){
            return INDEX;
        }else{
            return LOG_IN;
        }
    }

        
}
