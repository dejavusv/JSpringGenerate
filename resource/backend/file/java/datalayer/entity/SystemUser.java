

package <%packagename%>.datalayer.entity;

/**
 *
 * @author Surachai
 */
public class SystemUser {
    private String userId;
    private String pwd;
    private String isActive;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "SystemUser{" + "userId=" + userId + ", pwd=***, isActive=" + isActive + '}';
    }    
}
