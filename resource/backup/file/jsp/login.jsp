
<%-- 
    Document   : login
    Created on : Aug 29, 2014, 10:29:23 AM
    Author     : Surachai
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="form-box" id="login-box">
    <div class="header">Sign In</div>
    <form  method="post" name="formApplication" id="formApplication" method="post" action="login.<%url%>">
        <div class="body bg-gray">
            <div class="form-group">
                <input type="text" name="username" class="form-control" tabindex="1" placeholder="User ID"/>
            </div>
            <div class="form-group">
                <input type="password" name="password" tabindex="2" class="form-control" placeholder="Password"/>
            </div>          
            <div class="form-group">
                <input type="checkbox" name="remember_me"/> Remember me
            </div>
        </div>
        <div class="footer">            
            <button type="Button" class="btn bg-olive btn-block" onclick="login()" tabindex="4">Sign me in</button> 
        </div>
         <input type="hidden" name="action" id="action"/>
    </form>

</div>

<script src="js/login.js"></script>
<c:if test="${! empty requestScope['ResultLogin']}">
    <script language="javascript">
            alert('<c:out value="${requestScope['ResultLogin']}" />');
    </script>
</c:if>
