
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="margin-left: 200px;">

        <h3>Spring Says: ${message}</h3>
        
        <div>
            <!-- Logged In -->
            <sec:authorize access="isAuthenticated()">    
                <p>  User: <sec:authentication property="principal.username" /> </p>
                <p> <a href="j_spring_security_logout">Log out</a></p>
            </sec:authorize>
            
            <!-- Not Logged In -->
            <sec:authorize access="isAnonymous()">    
                <p> User: guest </p>
                <p> <a href="spring_security_login">Log in</a></p>
            </sec:authorize>
        </div>

        
        <fieldset style="width: 70%;">
           
            <legend style="margin-left: 40%;" >Upon Clicking</legend>
            <a href="adminpage">Admin Page</a><br /><br />
            <ul>
                <li>When logged out you will be directed to the login page first</li>
                <li>
                    Subsequently if login is successful, (or you were already logged in) 
                    you will be directed towards the corresponding @Controller method
                </li>
                <li>
                    <ul>
                        <li>If you do not have ROLE_ADMIN you will be directed to /accessdenied</li>
                        <li>If you do have ROLE_ADMIN access will be granted</li>
                        <li>john password is admin, while jane password is user</li>
                    </ul>
                </li>
            </ul>
         
        </fieldset>
        
        
        </div>
    </body>
</html>
