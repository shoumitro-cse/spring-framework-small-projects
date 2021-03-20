<%-- 
    Document   : errorpage
    Created on : Apr 23, 2019, 8:00:51 AM
    Author     : suse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${message}  <br/>
        <a href="home">Go to home</a>  
        <br><br>  
        <jsp:include page="/index.jsp"></jsp:include>  
    </body>
</html>
