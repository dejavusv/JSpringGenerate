
package <%packagename%>.datalayer.query;

import <%packagename%>.common.AbstractQuery;
import <%packagename%>.common.<%projectname%>Conection;
import <%packagename%>.datalayer.entity.<%beanname%>;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.log4j.Logger;

/**
 *
 * @author Surachai
 */
public class <%beanname%>Query extends AbstractQuery{
   private static final Logger log = Logger.getLogger(SystemUserQuery.class.getName());
   
    private static final String SELECT_COMMAND = "select t.USERID,t.PWD,t.ISACTIVE from dbo.\"SYSTEM_USER\" t where \n"
            + "t.USERID = ?\n"
            + "and t.PWD = ? \n"
            + "and t.ISACTIVE = ? ;";

    public SystemUserQuery(<%projectname%>Conection connection) {
        super(connection);
    }

    public SystemUser getSystemUser(SystemUser user) {
        SystemUser result = null;
        try (Connection con = getConnection().getConnection();
                PreparedStatement pstmt = con.prepareStatement(SELECT_COMMAND)) {
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getPwd());
            pstmt.setString(3, "Y");
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    user.setIsActive("Y");
                    result=user;
                }
            }
        } catch (Exception ex) {
            log.error(null, ex);
        }
        return result;
    }
    
}
